class RecursiveDemo {

    int fact(int n) {
        if (n == 1) return 1; // base condition
        return n * fact(n - 1); // recursive call
    }

    public static void main(String[] args) {
        RecursiveDemo obj = new RecursiveDemo();
        System.out.println(obj.fact(5)); // 120
    }
}