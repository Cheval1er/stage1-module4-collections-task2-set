package com.epam.mjc.collections.set;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer x : sourceList) {
            while (x % 2 == 0){
                hashSet.add(x);
                x = x / 2;
            }
            hashSet.add(x);
            hashSet.add(2*x);
        }
        return hashSet;
    }
}