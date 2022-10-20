package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();
        for(String s : words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        //Max Heap
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a,b) -> a.getValue() == b.getValue() ?
                        b.getKey().compareTo(a.getKey()) :
                        a.getValue() - b.getValue()
        );
        List<String> res = new ArrayList<>();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            pq.add(e);
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty()){
            res.add(0, pq.poll().getKey());
        }
        return res;
    }
}
