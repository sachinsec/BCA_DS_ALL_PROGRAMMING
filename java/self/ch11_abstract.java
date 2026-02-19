abstract class animal {
    abstract void sound();

    public void eat() {
        System.out.println("Animals eat food.");
    }

    class dog extends animal {
        public void sound() {
            System.out.println("Barking");
        }
    }
}

public class ch11_abstract {
    public static void main(String[] args) {
        System.out.println("I am abstract.");
        dog obj = new dog();
        obj.eat();
        obj.sound();
    }
}
