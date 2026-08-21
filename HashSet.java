
import java.util.*;




class HashSet{
    public static void main(String args[]){
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();   // This line initializes a HashMap

        //Insert
        map.put("India", 120);
        map.put("US", 130);
        map.put("Chaina", 140);

        // System.out.println(map);
        // map.put("Chaina", 180);
        // System.out.println(map);

        // Search    containsKey, get
        // if(map.containsKey("Chaina")){
        //     System.out.println("Key Present in the map");
        // }
        // else{
        //     System.out.println("Key not Present in the map");
        // }

        // System.out.println(map.get("Chaina"));
        // System.out.println(map.get("Indonesia"));

        // Iteration
        // Key→ String , Value→ Integer
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }

        // Remove
        map.remove("Chaina");
        System.out.println(map);



    }
}