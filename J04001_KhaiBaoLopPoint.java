package javaptit;

import java.util.Scanner;

public class J04001_KhaiBaoLopPoint 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double a1 = sc.nextDouble();
            double b1 = sc.nextDouble();
        
            double distance;
            double x = Math.abs(a - a1);
            double y = Math.abs(b - b1);
            distance = Math.sqrt(x * x + y * y);
            System.out.println(String.format("%.4f", distance));
        }
    }
}
