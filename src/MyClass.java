import java.io.*;
import java.util.*;
import java.util.Scanner;
//////////////////////////
public class MyClass 
{
	public MyClass() 
	{
		
	}
	///////////////////////////////////////////////////////
	public static boolean isPrime(int i)
	{
        int factors = 0;
        int j = 1;
        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
	///////////////////////////////////////////////////////////
	public static void ReturnPrime(int A[])
	{
		for (int i=0; i<A.length; i++)
		{
			if( isPrime(A[i]) == true )
				System.out.println(A[i]);
		}
	}
	///////////////////////////////////////////////////////////
	public static void main(String[] args)
	{
		
	}

}
