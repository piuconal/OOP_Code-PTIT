package javaptit;

import static java.lang.Math.abs;
import java.util.Scanner;

public class J01017_SoLienKe 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s = sc.nextLine();
            int ok = 0;
            for(int i = 0; i < s.length() - 1; i++)
            {
                if(abs(s.charAt(i) - s.charAt(i + 1)) != 1)
                {
                    ok = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if(ok == 0)
                System.out.println("YES");
        }
    }
}
