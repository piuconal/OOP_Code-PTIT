package javaptit;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class J01026_SoChinhPhuong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            int k = (int) sqrt(n);
            if(k * k == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
