package javaptit;

import java.util.Scanner;

public class J01014_UocSoNguyenToMAX  
{
    public static long solve(long n) 
    {
        long tmp = 2;
        while(n % tmp == 0)
        {
            n /= tmp;
        }
        for(long i = 3; i * i <= n; i += 2)
        {
            while(n % i == 0)
            {
                n /= i;
                tmp = i;
            }
        }
        if (n>1) tmp = n;
        return tmp;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) 
        {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }
}
