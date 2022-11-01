package javaptit;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class J01004_SoNguyenTo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0)
        {
            int n = sc.nextInt();
            int ok = 1;
            if(n < 2)   
                ok = 0;
            else
            {
                for(int i = 2; i <= sqrt(n); i++)
                {
                    if(n % i == 0)
                    {
                        ok = 0;
                        break;
                    }
                }
            }
            if(ok == 1) 
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
}
