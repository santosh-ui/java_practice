/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.util;

/**
 *
 * @author Santosh
 */
public class StringUtil {
    public static String getFileName(String path) {
        int lastIndex1 = path.lastIndexOf("\\");
        int lastIndex2 = path.lastIndexOf("/");
        
        int index = lastIndex1 > lastIndex2 ? lastIndex1 : lastIndex2;
        
        if (index != -1) {
            return path.substring(index + 1);
        } else {
            return path;
        }
    }
    
    public static String getFileExtension(String path) {
        int lastIndex = path.lastIndexOf(".");
        if (lastIndex != -1) {
            return path.substring(lastIndex + 1);
        } else {
            return "";
        }
    }
    
}
