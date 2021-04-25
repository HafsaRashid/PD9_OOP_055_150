package task2;

import java.util.Scanner;

public class Task2 {

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

        System.out.println("Enter a string: \n");

        System.out.println("Enter a sentence to print vertically: \n");

        s=obj.nextLine();
        System.out.println("Your sentence printed vertically is: \n"+displayVertical(s));
        
    }
    
}
