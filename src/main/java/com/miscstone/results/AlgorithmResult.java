package com.miscstone.results;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AlgorithmResult {
    public static void main(String[] args) {
        System.out.println("hello, scala, I am java");
    }

    public HashMap<Integer, Integer> getExecutors(Set<Integer> stageIdSet) {
        HashMap<Integer, Integer> stageToExecutorNum = new HashMap();
        Iterator var3 = stageIdSet.iterator();

        while (var3.hasNext()) {
            Integer stageId = (Integer) var3.next();
            if (stageId == 1) {
                stageToExecutorNum.put(stageId, 1);
            } else if (stageId == 2) {
                stageToExecutorNum.put(stageId, 2);
            } else if (stageId == 3) {
                stageToExecutorNum.put(stageId, 2);
            } else {
                stageToExecutorNum.put(stageId, 1);
            }
        }

        return stageToExecutorNum;
    }

    public HashMap<Integer, String> getExecutorTypes(Set<Integer> stageIdSet) {
        HashMap<Integer, String> stageToExecutorType = new HashMap();
        Iterator var3 = stageIdSet.iterator();

        while (var3.hasNext()) {
            Integer stageId = (Integer) var3.next();
            if (stageId == 1) {
                stageToExecutorType.put(stageId, "slave1");
            } else if (stageId == 2) {
                stageToExecutorType.put(stageId, "slave2");
            } else if (stageId == 3) {
                stageToExecutorType.put(stageId, "slave1");
            } else {
                stageToExecutorType.put(stageId, "slave2");
            }
        }

        return stageToExecutorType;
    }

}
