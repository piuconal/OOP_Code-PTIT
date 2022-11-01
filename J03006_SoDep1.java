package javaptit;

import java.util.Scanner;

public class J03006_SoDep1 
{
    public static int solve(String s) 
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return 0;
        }
        return 1;
    }
    public static int solve1(String s) 
    {
        for(int i = 0; i < s.length(); i++)
        {
            if((int)s.charAt(i) % 2 != 0)
                return 0;
        }
        return 1;
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
