package Exc16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exc16
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Henning", 32);
        map1.put("Bent", 19);
        map1.put("Søren", 61);
        map1.put("Ida", 32);

        System.out.println(is1to1(map1));
    }
    private static boolean is1to1(Map<String, Integer> map)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(map.values());
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i:list1)
        {
            map1.put(i, 0);
        }
        for (Integer i:list1)
        {
            map1.put(i, map1.get(i) +1);
        }
        list1.clear();
        list1.addAll(map1.values());
        for (Integer i:list1)
        {
            if (i >= 2)
            {
                return false;
            }
        }
        return true;
    }
}
