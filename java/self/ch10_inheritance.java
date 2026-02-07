class animal {
    public void eat() {
        System.out.println("eating");
    }
}

class dog extends animal {
    public void bark() {
        System.out.println("barking");
    }
}

class puppy extends dog {
    public void cry() {
        System.out.println("Crying");
    }
}

public class ch10_inheritance {
    public static void main(String[] args) {
        puppy ob = new puppy(); // example for inhertiance
        ob.bark();
        ob.eat();
        ob.cry();

    }
}
