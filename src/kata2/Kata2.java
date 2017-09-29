package kata2;

import java.util.*;

public class Kata2 {
    
    
    
    public static void main(String[] args) {
       int [] data = {1,1,1,0,1,2,1,0,3};
       Map<Integer, Integer>histogram = new HashMap<>();
       
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key)? histogram.get(key)+1 : 1);
        }
       
       
       for(int key: histogram.keySet() ){
           System.out.println(key + "==> " + histogram.get(key)+ "veces");
       }
    }
}
