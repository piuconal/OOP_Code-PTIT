package javaptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiSoChungMin 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.gcd(b);
            BigInteger d = a.multiply(b);
            System.out.println(d.divide(c));
        }
    }
}
