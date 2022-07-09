// Perform String manipulations.

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("String : "+str);
        System.out.println("Length of String : "+str.length());
        System.out.println("To Uppercase : "+str.toUpperCase());
        System.out.println("To Lowercase : "+str.toLowerCase());
        System.out.println();
        String str2=" I Love Python";
        System.out.println("New string: "+str2);
        System.out.println("String Concatination : "+str.concat(str2));
        System.out.println("Index of a word:  \"Python\" in"+str2+" : "+str2.indexOf("Python"));
        System.out.println("String replacement \"Python to Java\" : "+str2.replace("Python", "Java"));
    }
}
