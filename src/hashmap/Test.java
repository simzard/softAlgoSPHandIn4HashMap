/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author Tobias
 */
public class Test
{
    public static void main(String[] args)
    {
        Map<String, Integer> myMap = new HashMapLink<>();
        
        // very simple remove test
        myMap.put("Simon", 200);
        System.out.println("Before remove:" + myMap.get("Simon"));
        System.out.println("Removing: " + myMap.remove("Simon"));
        System.out.println("After remove:" + myMap.get("Simon"));
        
        
        myMap = new HashMap<>();
        
        // very simple remove test
        myMap.put("Simon", 200);
        System.out.println("Before remove:" + myMap.get("Simon"));
        System.out.println("Removing: " + myMap.remove("Simon"));
        System.out.println("After remove:" + myMap.get("Simon"));
        /*
        
        for(int i = 0; i < 10; i += 2)
        {
            String s = "#" + i;
            System.out.println("Insert: " + s);
            myMap.put(s, i);
        }
        System.out.println("Size: " + myMap.size());
        for(int i = 0; i < 10; ++i)
        {
            String s = "#" + i;
            Integer value = myMap.get(s);
            System.out.println("Key: " + s + " Value: " + value);
        }
        */
        
        
        
    }
}
