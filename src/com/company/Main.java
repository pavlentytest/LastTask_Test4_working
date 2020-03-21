package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, TreeMap<String,Integer>> buyer = new TreeMap<String, TreeMap<String,Integer>>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {

                String name = scan.next();
                String prod = scan.next();
                int count = scan.nextInt();
                TreeMap<String, Integer> product = buyer.get(name);
                if (product == null) {
                    product = new TreeMap<String, Integer>();
                    product.put(prod, count);
                    buyer.put(name,product);
                } else {
                    if (!product.containsKey(prod)) {
                        product.put(prod, count);
                    } else {
                        product.put(prod, count + product.get(prod));
                    }
                }


        }
        for(Map.Entry<String,TreeMap<String,Integer>> e: buyer.entrySet()) {
            System.out.println(e.getKey()+ ":");
            for(Map.Entry<String,Integer> ee: e.getValue().entrySet()) {
                System.out.println(ee.getKey() + " " + ee.getValue());
            }
        }


    }
}
