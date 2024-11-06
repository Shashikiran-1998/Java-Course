package DSAArlgoProblems.Stack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache<K,V> {

    private Integer capacity;
    LinkedHashMap<Integer,Integer> a= new LinkedHashMap<>();
    int maxCapacity;
    LinkedHashMap<K,V> map;

    public static void main(String[] args) {
        // LRU Least recently used cache must be removed

        // Observations
        // 1 recently added will recently used
        // get makes element to make recently used
        //[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]

        // stack | 2 -> 1

        // Use double linked list
        // and also use hashmap  for fast retrieval



    }


    public  LRUCache(int capacity) {
       maxCapacity = capacity;
       map = new LinkedHashMap<>(maxCapacity,1f,true){
           @Override
           protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
               // Remove the eldest entry when size exceeds the maximum capacity
               return size() > maxCapacity;
           }
       };
       // The true flag in the LinkedHashMap constructor ensures that the map maintains the elements in access order. This means that whenever an element is accessed (via get()), it is moved to the end of the list (most recently used).

    }

    public V get(int K) {
        return map.getOrDefault(K,null);



    }

    public void put(K key, V value) {
      map.put(key,value);
    }


}
