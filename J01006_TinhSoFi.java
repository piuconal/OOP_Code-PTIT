package javaptit;

import java.util.Scanner;

public class J01006_TinhSoFi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            long a[] = new long[95];
            a[1] = 1;
            a[2] = 1;
            for(int i = 3; i <= n; i++)
            {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println(a[n]);
        }
    }
}
