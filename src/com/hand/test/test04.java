package com.hand.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Arrays;

public class test04 {
	public static void main(String[] args){
		  Random rand = new Random();
		  Map<Integer, int[]> mymap=new HashMap<Integer, int[]>(); 
		  java.util.List<Integer> list = new java.util.ArrayList<Integer>();		  
		  for(int i=0; i<50; i++) {
	      int n=rand.nextInt(100)+1;
		  list.add(n);
		  }
		  Iterator it1=list.iterator();
		  System.out.println("随机生成50个小于100的整数，分别为：");
		  while(it1.hasNext()){
		  int i=(Integer) it1.next();
		  System.out.print(i+",");
		  }
		  System.out.println("");
		  Iterator it2=list.iterator();
		  while (it2.hasNext()) {
			  int value=(Integer) it2.next();
			  int key=value/10;
			  if (mymap.get(key)!=null) {
				 int a[]=mymap.get(key);
				 int length=a.length;
				 int b[]=new int[length+1];
				 for (int i = 0; i < length; i++) {
					b[i]=a[i];
				}
				 b[length]=value;
				 mymap.put(key, b);
			}else {
				int b[]={value};
				mymap.put(key, b);
			}
			  
		}
		  System.out.println("Map中的数为：");
		  Iterator<Integer> iter = mymap.keySet().iterator();
		  while(iter.hasNext()){
			  int key=iter.next();
			  int p[]=mymap.get(key);
			  System.out.print(key+"=>[");
			  for (int i = 0; i < p.length; i++) {
				System.out.print(p[i]+" ");
			}
			  System.out.println("]");
		  }
		  System.out.println("排序后的Map为：");
		  Iterator<Integer> iter2 = mymap.keySet().iterator();
		  while(iter2.hasNext()){
			  int key=iter2.next();
			  int p[]=mymap.get(key);
			  Arrays.sort(p);
			  System.out.print(key+"=>[");
			  for (int i = 0; i < p.length; i++) {
				System.out.print(p[i]+" ");
			}
			  System.out.println("]");
		  }
		}
}
