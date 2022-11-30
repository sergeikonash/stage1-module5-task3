package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        List<Integer> lists = new ArrayList<>();
        for (List<Integer> integers : list) {
            lists.addAll(integers);
        }
        return lists.stream().min(Comparator.naturalOrder());
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
