package Prog_Code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prac_HashMap
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Roshan", 0);
        hm.put("s", 1);
        hm.put("R", 2);

        System.out.println(hm.containsValue(2));
        System.out.println(hm.containsKey("R"));

        // Learning how the iterator is working in hashmap
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
