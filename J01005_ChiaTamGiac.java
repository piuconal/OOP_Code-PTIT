package javaptit;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class J01005_ChiaTamGiac
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            int N = sc.nextInt();
            int H = sc.nextInt();
            
            double S = 0.5 * H;
            for(int i = 1; i <= N - 1; i++)
            {
                double x, t;
                x = i * (double)(S/N) * H;
                t = sqrt(x/0.5);
                System.out.print(String.format("%.6f", t) + " ");
            }
            System.out.print("\n");
        }
    }
}
