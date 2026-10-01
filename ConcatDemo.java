class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java";

        // 1. Using + operator
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        // 2. Using concat() method
        String s4 = s1.concat(s2);
        System.out.println(s4);

        // 3. Concat with space
        String s5 = s1.concat(" ").concat(s2);
        System.out.println(s5);
    }
}