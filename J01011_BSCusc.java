package javaptit;

import java.util.Scanner;

public class J01011_BSCusc 
{
    public static long gcd(long a, long b) 
    {
        while (a != b)
        {
            if (a > b)
            {
                a -= b;
            }
            else
            {
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = a * b;
            System.out.print(ans / gcd(a, b) + " ");
            System.out.println(gcd(a, b));
        }
    }
}
