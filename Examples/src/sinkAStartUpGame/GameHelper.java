/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinkAStartUpGame;

/**
 *
 * @author Santosh
 */
import java.util.Scanner;
public class GameHelper {
    public int getUserInput() {
        System.out.print("prompt: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
