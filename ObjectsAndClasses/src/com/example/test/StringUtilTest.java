/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import com.example.util.StringUtil;

/**
 *
 * @author Santosh
 */
public class StringUtilTest {
    public static void main(String[] args) {
        String fileName1 = StringUtil.getFileName("C:\\Users\\16r91\\OneDrive\\Documents\\PSE\\PSE part1 quiz answers.pdf");
        String fileExtension1 = StringUtil.getFileExtension("C:\\Users\\16r91\\OneDrive\\Documents\\PSE\\PSE part1 quiz answers.pdf");
        // These methods are static methods. so, there is no need of creating an object of this
        // class to use these methods.        
        System.out.println("File Name: " + fileName1);
        System.out.println("File Extension: " + fileExtension1);
        
        
        String fileName2 = StringUtil.getFileName("/home/users/jayden/README");
        String fileExtension2 = StringUtil.getFileExtension("/home/users/jayden/README");
        System.out.println("File Name: " + fileName2);
        System.out.println("File Extension: " + fileExtension2);
        
        
        String fileName3 = StringUtil.getFileName("Help.html");
        String fileExtension3 = StringUtil.getFileExtension("Help.html");
        System.out.println("File Name: " + fileName3);
        System.out.println("File Extension: " + fileExtension3);
        
        String fileName4 = StringUtil.getFileName("setup");
        String fileExtension4 = StringUtil.getFileExtension("setup");
        System.out.println("File Name: " + fileName4);
        System.out.println("File Extension: " + fileExtension4);
    }
}
