package javaptit;

import java.util.Scanner;

public class J03007_SoDep2 
{
    public static int solve(String s) 
    {
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8')   
            return 0;
        else
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) != s.charAt(s.length() - i - 1))
                    return 0;
            }
            return 1;
        }
    }
    public static int solve1(String s) 
    {
        int ans = 0;
        for(int i = 0; i < s.length(); i++)
        {
            ans += ((int)(s.charAt(i)) - 48);
        }
        if(ans % 10 == 0)   return 1;
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s = sc.nextLine();
            if(solve(s) == 1 && solve1(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
