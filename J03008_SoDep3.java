package javaptit;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class J03008_SoDep3 
{
    public static int prime(int n) 
    {
        if(n < 2)   return 0;
        for(int i = 2; i <= (int)sqrt(n); i++)
        {
            if(n % i == 0)  return 0;
        }
        return 1;
    }
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
            if(prime((int)s.charAt(i) - 48) == 0)
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
