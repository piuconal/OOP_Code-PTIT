package javaptit;

import java.util.Scanner;

public class J01009_TongGiaiThua 
{
    public static long GiaiThua(int n) 
    {
        long ans = 1;
        for(int i = 1; i <= n; i++)
            ans *= i;
        return ans;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        for(int i = 2; i <= n; i++)
        {
            sum += GiaiThua(i);
        }
        System.out.print(sum);
    }
}
