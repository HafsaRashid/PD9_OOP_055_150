/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Mask
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static String displayVertical(String s)
    {
        
        String n="";
        int size = s.length();
        for(int i = 0; i< size;i++)
        {
            if(s.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                n= n + s.charAt(i) + "\n";
            }
           
        }
          return n;
        
    } 
        
        
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj  = new Scanner(System.in);
        String s="";
        System.out.println("Enter a sentence: \n");
        s=obj.nextLine();
        System.out.println("Your sentence printed vertically is: \n"+displayVertical(s));
        
    }
    
}
