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
public class GetData {
    
    private int x;
    private int y;
    
    private char a;
    private char b;
    
    
    public GetData(int x, int y, char a, char b)
    {
        this.x = x;
        this.y = y;
        
        this.a = a;
        this.b = b;
    }
    
    
    public void setx (int x)
    {
        this.x = (int)x;
    }
    
    public void sety(int y)
    {
        this.y = (int)y;
    }
    
    public void seta (char a)
    {
        this.a = (char)a;
    }
    
    public void setb(char b)
    {
        this.b = (char)b;
    }
    
    public int getx ()
    {
        return x;
    }
    
    public int gety()
    {
        return y;
    }
    
    public char geta ()
    {
        return a;
    }
    
    public char getb()
    {
        return b;
    }
    
}
