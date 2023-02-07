/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1;

/**
 *
 * @author Santosh
 */

import java.util.HashMap;

public class hashMapOps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Maths", 100);
        examScores.put("Physics", 90);
        examScores.put("Chemistry", 85);
//        examScores.replace("Maths", 99);
        examScores.putIfAbsent("Telugu", 99);
        System.out.println(examScores.getOrDefault("Hindi", 98));
        System.out.println(examScores.size());
//        examScores.clear();
        System.out.println(examScores.toString());
        System.out.println(examScores.containsKey("Maths"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());
        
        examScores.forEach((subject, score) -> {
//            System.out.println(subject + " - " + score);
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores.toString());

        
//        System.out.println(examScores.get("Maths"));
        
    }
}
