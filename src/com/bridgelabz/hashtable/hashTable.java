package com.bridgelabz.hashtable;
import java.util.*;

public class hashTable {

	void word_frequency(String str, String st)
    {
        
		Map<String,Integer> m = new HashMap<>();
 
        String array[] = str.split(" ");
 
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
            System.out.println(entry.getKey() + " is " + entry.getValue() + " time ");
        }
    }

	
    public static void main(String[] args) {
        
    	hashTable table = new hashTable();
    	String str = "To be or not to be";
    	String st = "Namrata namrata";
    	
        table.word_frequency(str, st);
    }
}
