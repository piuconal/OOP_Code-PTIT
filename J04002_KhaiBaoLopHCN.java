package javaptit;

import java.util.Scanner;

public class J04002_KhaiBaoLopHCN 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.nextLine().toLowerCase();
        if(a > 0 && b > 0)
        {
            long p = (long)(2 * a + 2 * b);
            long ans = (long)(a * b);
            System.out.print(p + " " + ans + " " + s.substring(1, 2).toUpperCase() + s.substring(2));
        }
        else
        {
            System.out.print("INVALID");
        }
    }
}
