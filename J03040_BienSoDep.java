package javaptit;

import java.util.Scanner;

public class J03040_BienSoDep 
{
    public static int check1(String s) 
    {
        for(int i = 0; i < s.length() - 1; i++)
        {
            if((int)s.charAt(i) >= (int)s.charAt(i + 1))
                return 0;
        }
        return 1;
    }
    public static int check2(String s) 
    {
        for(int i = 0; i < s.length() - 1; i++)
        {
            if((int)s.charAt(i) != (int)s.charAt(i + 1))
                return 0;
        }
        return 1;
    }
    public static int check3(String s) 
    {
        if((int)s.charAt(0) == (int)s.charAt(1) &&
           (int)s.charAt(1) == (int)s.charAt(2) &&
           (int)s.charAt(3) == (int)s.charAt(4)) 
            return 1;
        return 0;
    }
    public static int check4(String s) 
    {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '6' || s.charAt(i) == '8')
                cnt++;
        }
        if(cnt == s.length())
            return 1;
        else
            return 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s = sc.nextLine();
            String ans = "";
            for(int i = 5; i < s.length(); i++)
            {
                if(s.charAt(i) != '.')
                {
                     ans += s.charAt(i);
                }
            }
            if(check1(ans) == 1 || check2(ans) == 1 || check3(ans) == 1 || check4(ans) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
