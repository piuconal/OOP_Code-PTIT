package javaptit;

import java.util.Scanner;

public class J04008_ChuViTamGiac 
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
            double a2 = sc.nextDouble();
            double b2 = sc.nextDouble();
            
            double x = Math.abs(a - a1);
            double x1 = Math.abs(b - b1);
            double AB = Math.sqrt(x * x + x1 * x1);
            
            double y = Math.abs(a - a2);
            double y1 = Math.abs(b - b2);
            double AC = Math.sqrt(y * y + y1 * y1);
            
            double z = Math.abs(a2 - a1);
            double z1 = Math.abs(b2 - b1);
            double BC = Math.sqrt(z * z + z1 * z1);
            
            if(AB + BC > AC && AB + AC > BC && AC + BC > AB)
            {
                System.out.printf("%.3f\n", (double)(AB + BC + AC));
            }
            else
            {
                System.out.println("INVALID");
            }
        }
    }
}
