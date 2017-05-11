/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textchanger;

/**
 *
 * @author Bharath
 */
public class ManipulateData extends GetData {
    
    private int num1;
    private int num2;
    
    private char char1;
    private char char2;
    
    public ManipulateData(int x, int y, char a, char b)
    {
        super(x,y,a,b);
        
        num1 = x;
        num2 = y;
        
        char1 = a;
        char2 = b;
    }
    
    public void MathFunction(int n1, int n2)
    {
        int add, sub, mul, div;
        
        // Addition
        add = num1 + num2;
        
        //Subtraction
        sub = num1 - num2;
        
        //Multiplication
        mul = num1 * num2;

        //Division
        div = num1 / num2;
    }
    
    public void CharFunction()
    {
        String c1, c2, c3, c4;
        
        //Combination
        c1 = Character.toString(char1) + Character.toString(char2);
        
        //Flipped
        c2 = Character.toString(char2) + Character.toString(char1);
        
        //Separated
        c3 = Character.toString(char1);
        c4 = Character.toString(char2);
    }
}
