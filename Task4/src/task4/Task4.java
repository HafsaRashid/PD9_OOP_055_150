package task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Select the option");
        System.out.println("1. Check if string is palindrome.");
        System.out.println("2. Reverse the string.");
        System.out.println("3. Remove alphabets from string.");
        System.out.println("4. Check if one string starts with other.");
        System.out.println("5. Check if one string ends with other.");
        System.out.println("6. Remove duplicate words.");
        System.out.println("7. Count punctuation marks in a string");
        System.out.print("Enter option: ");
        
        int option;
        option = obj.nextInt();
        
        if (option == 1) {
            int count = 0;
            System.out.print("Enter string: ");
            String str = scanner.nextLine();
            boolean newStr = isPalindrome(str);
            if (newStr == true)
            {
                System.out.println("String is palindrome");
            } 
            else 
            {
                System.out.println("String is not palindrome");
            }
        } 
        else if (option == 2) 
        {
            System.out.print("Enter string to reverse: ");
            String str = scanner.nextLine();
            String newStr = reverse(str);
            System.out.println("Updated string is: " + newStr);
        }
        else if (option == 3)
        {
            System.out.print("Enter string with Alphabets: ");
            String str = scanner.nextLine();
            String ridAlp = removeAlphabets(str);
            System.out.println("Updated string is: " + ridAlp);
        }
        else if (option == 4) 
        {
            System.out.print("Enter string 1: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter string 2: ");
            String str2 = scanner.nextLine();
            boolean chkString = startswith(str1, str2);
            if (chkString == true) 
            {
                System.out.println("String 2 matches the string 1");
            }
            else
            {
                System.out.println("String 2 does not matches the string 1");
            }
        }
        else if (option == 5)
        {
            System.out.print("Enter string 1: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter string 2: ");
            String str2 = scanner.nextLine();
            boolean chkString = endswith(str1, str2);
            if (chkString == true)
            {
                System.out.println("First string ends with second string.");
            } 
            else
            {
                System.out.println("First string doesn't ends with second string.");
            }
        } 
        else if (option == 6) 
        {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            String newStr = removeDuplicateWords(str);
            System.out.println("Updated String is: " + newStr);
        }
        else if (option == 7) 
        {
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            int i = puncCount(str);
            System.out.println("There are " + i + " punctuation marks.");
        }
        else 
        {
            System.out.println("You have entered invalid option.");
        }
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
        for (int i = (length - 1); i >= 0; i--) 
        {
            str = str + s.charAt(i);
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

    public static boolean startswith(String a, String b) 
    {
        boolean flag = false;
        int size1 = a.length();
        int size2 = b.length();
        for (int i = 0; i < size2; i++)
        {
            if (a.charAt(i) == b.charAt(i))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean endswith(String a, String b) 
    {
        boolean flag = false;
        int size1 = a.length();
        int size2 = b.length();
        int j = size1 - 1;
        for (int i = size2 - 1; i >= 0; i--) 
        {
            if (a.charAt(j) == b.charAt(i)) 
            {
                j--;
                flag = true;
            }
        }
        return flag;
    }

    public static String removeDuplicateWords(String s)
    {
        int length = s.length();
        String str = "";
        String [] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    str = s.replace(arr[i], "");
                    
                }
            }
        }
        return str;
    }
    
    public static int puncCount(String s) 
    {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) 
        {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '"' || s.charAt(i) == ',')
            {
                count = count + 1;
            }
        }
        return count;
    }
}
    
    