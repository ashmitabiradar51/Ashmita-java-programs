import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Rahul");
        map.put(2, "Ankit");
        map.put(3, "Priya");

        System.out.println("Map: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After removing: " + map);
    }
}