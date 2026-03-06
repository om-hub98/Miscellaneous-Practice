package DataStructure.Map.LinkedHashMap;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(1); // Access 1 → becomes most recently used

        cache.put(4, "D"); // Capacity exceeded → removes 2

        System.out.println(cache);
    }
}