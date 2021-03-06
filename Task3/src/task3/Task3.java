package task3;

import java.io.UnsupportedEncodingException;
import java.util.*;    
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Select the option");
        System.out.println("1. Rid Multiple Blank Spaces. ");
        System.out.println("2. Remove Integers.");
        System.out.println("3. String Encryption.");
        System.out.print("Enter option: ");
        
        int option;
        option = obj.nextInt();
        
        if(option == 1)
        {
            System.out.print("Enter string with spaces: ");
            String str = scanner.nextLine();
            String ridSpace = ridMultipleBlank(str);
            System.out.println("Updated string is: " + ridSpace);
        }
        else if(option == 2)
        {
            System.out.print("Enter string with integers: ");
            String str = scanner.nextLine();
            String ridNum = removeInteger(str);
            System.out.println("Updated string is: " + ridNum);

        }
        else if(option == 3)
        {
            System.out.print("Enter string to encrypt: ");
            String str = scanner.nextLine();
            String Encrypt = stringEncryption(str);   
            System.out.println("Encrypted string is: " + Encrypt);
        }
        else 
        {
            System.out.println("You have entered invalid option.");
        }
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
