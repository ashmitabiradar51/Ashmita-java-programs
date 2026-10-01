class Animal { // parent class
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal { // child class
    void bark() {
        System.out.println("Barking...");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from parent
        d.bark(); // own method
    }
}