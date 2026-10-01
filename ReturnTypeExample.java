class ReturnExample {

    // returns int
    int add(int a, int b) {
        return a + b;
    }

    // returns String
    String getName() {
        return "Java";
    }

    // returns boolean
    boolean isEven(int n) {
        return n % 2 == 0;
    }

    // returns nothing - void
    void sayHi() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        ReturnExample obj = new ReturnExample();
        
        System.out.println(obj.add(10, 20));   // 30
        System.out.println(obj.getName());     // Java
        System.out.println(obj.isEven(4));     // true
        obj.sayHi();                           // Hi
    }
}