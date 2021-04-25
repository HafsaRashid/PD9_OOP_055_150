/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.io.UnsupportedEncodingException;
import java.util.*;    
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String Encrypt = stringEncryption(str3);
        System.out.println("Updated string is: " + ridSpace);
        System.out.println("Updated string is: " + ridNum);
        System.out.println("Encrypted string is: " + Encrypt);
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
    
    public static String stringEncryption(String s) 
    {
        //base64 encoding
        byte[] encodedBytes=null;
        try {
            encodedBytes = Base64.getEncoder().encode(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Task3.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("encodedBytes " + new String(encodedBytes));
        return new String(encodedBytes);
    }
}
