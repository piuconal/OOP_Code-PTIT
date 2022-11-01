package javaptit;

import static java.lang.Math.abs;
import java.util.Scanner;

public class J01018_SoKhongLienKe 
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
                if(abs(s.charAt(i) - s.charAt(i + 1)) != 2)
                {
                    ok = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if(ok == 0)
            {
                long ans = 0;
                for(int i = 0; i < s.length(); i++)
                {
                    ans += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
                if(ans % 10 == 0)
                    System.out.println("YES");
                else    
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
