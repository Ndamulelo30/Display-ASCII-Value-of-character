/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayasciivalueofacharacter;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        
        // Convert the character to its ASCII value
        int asciiValue = (int) ch;
        
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        
        scanner.close();
    
    }
}
