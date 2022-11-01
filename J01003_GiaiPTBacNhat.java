package javaptit;

import java.util.Scanner;

public class J01003_GiaiPTBacNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        if(a == 0)
        {
            if(b == 0)
                System.out.print("VSN");
            else    
                System.out.print("VN");
        }
        else
        {
            if(b == 0)
                System.out.print("VSN");
            else
                System.out.print(String.format("%.2f", (double)-b/a));
        }
    }
}
