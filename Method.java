class Demo {

    // 1. Non-Parameterized Method (no input)
    void sayHello() {
        System.out.println("Hello from Java");
    }

    // 2. Parameterized Method (with input)
    void add(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        
        obj.sayHello();      // calling non-parameterized
        obj.add(10, 20);     // calling parameterized
    }
}