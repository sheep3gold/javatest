package com.hand.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class test05 {	
	public static void main(String[] args) {
        Random random=new Random();
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<50;i++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println("随机生成小于100的50个数，分别为："+arrayList);
        Map<Integer,ArrayList<Integer>> groupMap=getGroup(arrayList);
        System.out.println("Map中的数据为："+groupMap);
        Map<Integer,ArrayList<Integer>> sortMap=getSort(groupMap);
        System.out.println("排序后的Map为："+sortMap);
    }

    private static Map<Integer,ArrayList<Integer>> getGroup(List<Integer> arrayList){
        Map<Integer,ArrayList<Integer>> groupMap=new LinkedHashMap<Integer, ArrayList<Integer>>();

        for(Integer integer:arrayList){
            int key=integer/10;
            if(groupMap.get(key)==null){
                ArrayList<Integer> keyList=new ArrayList<Integer>();
                keyList.add(integer);
                groupMap.put(key,keyList);
            }else{
                groupMap.get(key).add(integer);
            }
        }
        return groupMap;
    }

    private static Map<Integer,ArrayList<Integer>> getSort(Map<Integer,ArrayList<Integer>> groupMap){
        Map<Integer,ArrayList<Integer>> sortMap=new TreeMap<Integer, ArrayList<Integer>>();
        sortMap.putAll(groupMap);
        return sortMap;
    }
}
