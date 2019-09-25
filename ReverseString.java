//Java program to reverse a string by taking input from user

//To take input from user we need to import Scanner package
import java.util.Scanner;
 
public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
	//To create object of Scanner class
        Scanner read = new Scanner(System.in);

	//to get input from user
        String str = read.nextLine();
        String reverse = "";
        
        //Loop to revese the string
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        
	//To display the output
	System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}