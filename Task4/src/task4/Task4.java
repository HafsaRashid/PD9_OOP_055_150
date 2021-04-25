/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Hafsa Rashid
 */
import java.util.*;

public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Enter string: ");
        String str = scanner.nextLine();
        boolean newStr = isPalindrome(str);
        if (newStr == true) 
        {
            System.out.println("String is palindrome");
        } else 
        {
            System.out.println("String is not palindrome");
        } */ 
        /*System.out.print("Enter string to reverse: ");
        String str1 = scanner.nextLine();
        String s = reverse(str1);
        System.out.println(s);*/
        
        System.out.print("Enter string with Alphabets: ");
        String str2 = scanner.nextLine();
        String ridAlp = removeAlphabets(str2);
        System.out.println("Updated string is: " + ridAlp);
    }

    public static boolean isPalindrome(String s) 
    {
        boolean flag = false;
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            if (s.charAt(i) == s.charAt(length - i - 1)) 
            {
                flag = true;
            } 
            else 
            {
                flag = false;
            }

        }
        return flag;
    }
    
    public static String reverse(String s)
    {
        String str = "";
        int length = s.length();
        for(int i = (length - 1); i > 0; i--)
        {
            str = (s.charAt(i)+"");
        }
        return str;
    }
    
    public static String removeAlphabets(String s) 
    {
        String str = "";
        String lower = "";
        int length = s.length();
        for (int i = 0; i < length; i++) 
        {
            lower = s.toLowerCase();
            str = (lower.replaceAll("[a-z]", ""));
        }
        return str;
    }
    
   
}

    /*public static String removeDuplicateWords(String s)
    {
        String [] words = s.split("");
        int length = s.length();
        int count = 0;
        String a = "";
        for(int i = 0; i < length; i++)
        {
            for(int j = i+1; j < length; j++)
            {
                if(words[i] == words[j])
                {
                    a = s.replaceAll(words[j], "");
                }
                else
                {
                    a = words[i];
                } 
}
}
        return a;
    }*/

