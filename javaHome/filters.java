import java.util.HashMap;

public class filters {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 75);
        map.put("Anjali", 55);
        map.put("Kiran", 90);
        map.put("Priya", 60);
        map.put("Sneha", 68);

        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 60)
                .forEach(entry ->
                        System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}