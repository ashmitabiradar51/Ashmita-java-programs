class Student {
    // private data - hidden
    private String name;

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String newName) {
        name = newName;
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        System.out.println(s.getName());
    }
}