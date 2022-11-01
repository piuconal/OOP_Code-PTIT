package javaptit;

import java.util.Scanner;

public class J02004_MangDoiXung 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            int a[] = new int[111];
            for(int i = 1; i <= n; i++)
            {
                a[i] = sc.nextInt();
            }
            int cnt = 0;
            for(int i = 1; i <= n/2; i++)
            {
                if(a[i] == a[n - i + 1])
                    cnt++;
            }
            if(cnt == n/2)
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
}
