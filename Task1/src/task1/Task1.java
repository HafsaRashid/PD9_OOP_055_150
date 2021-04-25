package task1;

import java.util.Scanner;

public class Task1 {

      public static int wordCounter(String s)
    {
        int count = 0 ;
        int size = s.length();
        for(int i = 0 ; i < size ; i++)
        {
            if(s.charAt(i)==' ')
            {
                count = count + 1;
            }
            
        }
        
   
        return count+1;
    }
    
    public static int vowelcounter(String s)
    {
       int count = 0;
         int size = s.length();
        for(int i = 0 ; i < size ; i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count = count + 1;
            }
            
        }
        return count;
    }
    
    public static int puncCount(String s)
    {
        int count = 0;
         int size = s.length();
        for(int i = 0 ; i < size ; i++)
        {
            if(s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)==':'||s.charAt(i)==';'||s.charAt(i)=='"'||s.charAt(i)==',')
            {
                count = count + 1;
            }
            
        }
        return count;
    }

    public static  boolean findSubString(String s, String sub)
    {
       int s1 = s.length();
      int s2 = sub.length();
       boolean flag = false;
       for(int i = 0 ;i< s1;i++)
       {
           if(s.charAt(i)==sub.charAt(s2-s2))
           {
                for(int j = 0 ;j< s2;j++)
                   {                                                         
                        if(s.charAt(i+j)==sub.charAt(j))
                        {
                            flag=true;
                        }
                        else
                        {
                            flag=false;
                            break;
                        }
                   }
           }
           
           if(flag==true)
           {
               return true;
           }
           else
           {
               flag=false;
              
           }
       }
       return flag;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String a="";
         boolean b = false;
        System.out.println("Enter the string : \n");
        a=obj.nextLine();
        int n= wordCounter(a);
        System.out.println("Number of words : "+n);
        n= vowelcounter(a);
        System.out.println("Number of vowels: "+n);
        n=puncCount(a);
        System.out.println("Number of punctuations: "+n);
        b=findSubString(a,"the");
        if(b==true)
        {
            System.out.println("\"the\" is the part of string");        
                   
        }                     
       else
        {
            System.out.println("\"the\" is not the part of string");
        }
         
    }
}
  

