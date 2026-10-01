import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Ankit");
        names.add("Priya");

        System.out.println(names);
        
        names.remove(1); // removes Ankit
        System.out.println("After removing: " + names);
        
        System.out.println("Size: " + names.size());
    }
}