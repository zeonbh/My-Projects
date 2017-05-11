/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textchanger;

import java.util.Scanner;

/**
 *
 * @author Bharath
 */
public class TextChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Data Manipulator: ");
        
        
        
        ManipulateData m1 = new ManipulateData(GetNum1(),GetNum2(),GetChar1(),GetChar2());
        
        
    }
    
    static public int GetNum1()
    {
        int x;
        Scanner g1 = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        x = g1.nextInt();

        return x;
    }
    
    static public int GetNum2()
    {
        int y;
        Scanner g1 = new Scanner(System.in);
        
        System.out.println("Enter the second number: ");
        y = g1.nextInt();
        
        return y;
    }
    
    static public char GetChar1()
    {        
        
        char a;
        Scanner g2 = new Scanner(System.in);
        
        System.out.println("Enter the first character: ");
        a = g2.next().charAt(0);
        
        return a;
    }
    
        static public char GetChar2()
    {        
        
        char b;
        Scanner g2 = new Scanner(System.in);
        
        System.out.println("Enter the first character: ");
        b = g2.next().charAt(0);
        
        return b;
    }
    
}
