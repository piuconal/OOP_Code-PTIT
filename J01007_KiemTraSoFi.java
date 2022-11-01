package javaptit;

import java.util.Scanner;

public class J01007_KiemTraSoFi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            long n = sc.nextLong();
            long a[] = new long[95];
            a[1] = 0;
            a[2] = 1;
            if(a[1] == n || a[2] == n)
                System.out.println("YES");
            else
            {
                int ok = 0;
                for(int i = 3; i <= 92; i++)
                {
                    a[i] = a[i - 1] + a[i - 2];
                    if(a[i] == n)
                    {
                        ok = 1;
                        System.out.println("YES");
                        break;
                    }
                }
                if(ok == 0) 
                    System.out.println("NO");
            }
        }
    }
}
