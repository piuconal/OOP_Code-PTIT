package javaptit;

import java.util.Scanner;

public class J01024_SoTamPhan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s = sc.nextLine();
            int cnt = 0;
            for(int i = 0; i <= s.length() - 1; i++)
            {
                if(((int)s.charAt(i)) >= 48 && ((int)s.charAt(i) <= 50))
                {
                    cnt++;
                }
            }
            if(cnt == s.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
