package com.bridgelabz.hashtable;
import java.util.*;

public class hashTable {

	void word_frequency(String str1)
    {
        
		Map<String,Integer> m = new HashMap<>();
 
        String array[] = str1.split(" ");
 
        for(int i = 0; i < array.length; i++)
        {

            if(m.containsKey(array[i]))
            {
                m.put(array[i], m.get(array[i])+1);
            }
            else
            {
                m.put(array[i],1);
            }
            
        }
        
        for(Map.Entry<String,Integer> entry: m.entrySet())
        {
            System.out.println( entry.getKey()  + " is " + entry.getValue() + " time ");
        
        }
        System.out.println(" \n ");
        
        for (int j = 0; j < array.length; j++) 
        {
            if (m.containsKey("avoidable")) 
            {
                m.remove("avoidable");
            }

        }
        System.out.println(" After removing: \n");
        for(Map.Entry<String,Integer> entry: m.entrySet())
        {
            System.out.println( entry.getKey()  + " is " + entry.getValue() + " time ");
        
        }
        
        
    }

	
    public static void main(String[] args) {
        
    	hashTable table = new hashTable();
    	
    	String str = "To be or not to be";
    	String str1 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
    	
        table.word_frequency(str1);
        
    }

}
