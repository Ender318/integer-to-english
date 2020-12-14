import java.util.Scanner;
public class IntToEnglish
{
    //Usage:	public static String intToEnglish (int n)
	//Desc:	Converts a positive integer to English.  
	//Pre:	n must be positive.  
    //Return:	A string consists of English words of n.  For example, if n=372, intToEnglish returns the String "three seven two".
    public static String intToEnglish(int n)
    {
        String[] digit = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        if (n > 0)   
            return intToEnglish(n/10) + digit[n%10];
        else
            return "";
    }
    public static void main(String[] args)
    {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = f.nextInt();
        System.out.println(intToEnglish(num));
    }
}
