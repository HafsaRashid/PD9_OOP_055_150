/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.util.Scanner;
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String str = scanner.nextLine();
        String ridSpace = ridMultipleBlank(str);
        System.out.print("Enter string with integers: ");
        String str2 = scanner.nextLine();
        String ridNum = removeInteger(str2);
        System.out.print("Enter string to encrypt: ");
        String str3 = scanner.nextLine();
      //  String Encrypt = stringEncryption(3);
        System.out.println("Updated string is: " + ridSpace);
        System.out.println("Updated string is: " + ridNum);
        //System.out.println("Encrypted string is: " + Encrypt);
    }
    public static String ridMultipleBlank(String s)
    {
        String str = "";
        int length = s.length();
        for(int i = 0; i < length; i++)
        {
            str = (s.replaceAll("( +)"," ").trim());
                
        }
        return str;
    }
    
    public static String removeInteger(String s) 
    {
        String str = "";
        int length = s.length();

        for (int i = 0; i < length; i++) 
        {
            str = (s.replaceAll("[0-9]", ""));
        }
        return str;
    }
    
    /*public static String stringEncryption(String s) 
    {
        String str = "";
        int length = s.length();
        for (int i = 0; i < length; i++) 
        {
            
        }
        return str;
    }*/
}
