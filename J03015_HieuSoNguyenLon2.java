package javaptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuSoNguyenLon2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.subtract(b));
    }
}
