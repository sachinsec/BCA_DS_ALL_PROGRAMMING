// Simple hash function for demo (not secure)
function simpleHash(str) {
    let hash = 0;
    for (let i = 0; i < str.length; i++) {
        const char = str.charCodeAt(i);
        hash = ((hash << 5) - hash) + char;
        hash = hash & hash; // Convert to 32-bit integer
    }
    return hash.toString();
}

// Elements
const signupForm = document.getElementById('signupForm');
const loginForm = document.getElementById('loginForm');
const signupUsername = document.getElementById('signupUsername');
const signupPassword = document.getElementById('signupPassword');
const loginUsername = document.getElementById('loginUsername');
const loginPassword = document.getElementById('loginPassword');
const toggleLinks = document.querySelectorAll('.toggle-link');
const authSection = document.getElementById('authSection');
const todoSection = document.getElementById('todoSection');
const userInfo = document.getElementById('userInfo');
const currentUsernameSpan = document.getElementById('currentUsername');
const logoutBtn = document.getElementById('logoutBtn');
const todoInput = document.getElementById('todoInput');
const addBtn = document.getElementById('addBtn');
const todoList = document.getElementById('todoList');

// Init on load
document.addEventListener('DOMContentLoaded', initApp);

function initApp() {
    const currentUser = localStorage.getItem('currentUser');
    if (currentUser) {
        showLoggedIn(currentUser);
        loadTodos();
    }
}

function showLoggedIn(username) {
    localStorage.setItem('currentUser', username);
    currentUsernameSpan.textContent = username;
    authSection.classList.add('hidden');
    userInfo.classList.remove('hidden');
    todoSection.classList.remove('hidden');
}

function showLoggedOut() {
    localStorage.removeItem('currentUser');
    authSection.classList.remove('hidden');
    userInfo.classList.add('hidden');
    todoSection.classList.add('hidden');
    todoList.innerHTML = '';
    loginForm.classList.remove('hidden');
    signupForm.classList.add('hidden');
    toggleLinks[0].classList.add('active');
    toggleLinks[1].classList.remove('active');
}

// Toggle forms
toggleLinks.forEach(link => {
    link.addEventListener('click', () => {
        const targetForm = link.dataset.form;
        toggleLinks.forEach(l => l.classList.remove('active'));
        link.classList.add('active');
        
        if (targetForm === 'signup') {
            signupForm.classList.remove('hidden');
            loginForm.classList.add('hidden');
        } else {
            loginForm.classList.remove('hidden');
            signupForm.classList.add('hidden');
        }
    });
});

// Signup
signupForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const username = signupUsername.value.trim();
    const password = signupPassword.value;
    if (!username || !password) return;
    
    const users = JSON.parse(localStorage.getItem('users') || '{}');
    if (users[username]) {
        alert('Username already exists!');
        return;
    }
    
    users[username] = simpleHash(password);
    localStorage.setItem('users', JSON.stringify(users));
    alert('Signup successful! Please login.');
    // Switch to login
    toggleLinks[1].click();
});

// Login
loginForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const username = loginUsername.value.trim();
    const password = loginPassword.value;
    if (!username || !password) return;
    
    const users = JSON.parse(localStorage.getItem('users') || '{}');
    if (users[username] === simpleHash(password)) {
        showLoggedIn(username);
    } else {
        alert('Invalid credentials!');
    }
});

// Logout
logoutBtn.addEventListener('click', showLoggedOut);

// Todo functions
addBtn.addEventListener('click', addTodo);
todoInput.addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        addTodo();
    }
});

function addTodo() {
    const text = todoInput.value.trim();
    if (text === '') return;

    const li = document.createElement('li');
    li.className = 'todo-item';

    const todoText = document.createElement('span');
    todoText.className = 'todo-text';
    todoText.textContent = text;

    const deleteBtn = document.createElement('button');
    deleteBtn.className = 'delete-btn';
    deleteBtn.textContent = 'Delete';
    deleteBtn.onclick = () => {
        li.remove();
        saveTodos();
    };

    li.appendChild(todoText);
    li.appendChild(deleteBtn);
    todoList.appendChild(li);

    todoInput.value = '';
    saveTodos();
}

function saveTodos() {
    const todos = Array.from(todoList.children).map(li => li.querySelector('.todo-text').textContent);
    localStorage.setItem('todos', JSON.stringify(todos));
}

function loadTodos() {
    const todos = JSON.parse(localStorage.getItem('todos') || '[]');
    todos.forEach(text => {
        const li = document.createElement('li');
        li.className = 'todo-item';

        const todoText = document.createElement('span');
        todoText.className = 'todo-text';
        todoText.textContent = text;

        const deleteBtn = document.createElement('button');
        deleteBtn.className = 'delete-btn';
        deleteBtn.textContent = 'Delete';
        deleteBtn.onclick = () => {
            li.remove();
            saveTodos();
        };

        li.appendChild(todoText);
        li.appendChild(deleteBtn);
        todoList.appendChild(li);
    });
}
