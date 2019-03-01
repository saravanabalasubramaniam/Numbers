import java .io.*;
import java.util.*;
class Numbers
{
    public static void main(String args[])
    {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	for(int i=0;i<a.length();i++)
	{
		if(a.charAt(i)>='0'&&a.charAt(i)<='9')
		{
			System.out.print(a.charAt(i));
		}
	}
    }
}
