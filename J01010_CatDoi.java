package javaptit;

import java.util.Scanner;

public class J01010_CatDoi 
{
    public static char Solve(char s) 
    {
        if(s == '0')    s = '0';
        else if(s == '1')    s = '1';
        else if(s == '8')    s = '0';
        else if(s == '9')    s = '0';
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            
            int ok = 0;
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) >= '2' && s.charAt(i) <= '7')
                {
                    ok = 1;
                    System.out.print("INVALID");
                    break;
                }
            }
            if(ok == 0)
            {
                int cnt = 0;
                int khong = 0;
                for(int i = 0; i < s.length(); i++)
                {
                    if(Solve(s.charAt(i)) != '0')
                    {
                        cnt = i;
                        break;
                    }
                    else
                    {
                        khong++;
                    }
                }
                if(khong == s.length()) 
                    System.out.print("INVALID");
                else
                {
                    for(int i = cnt; i < s.length(); i++)
                    {
                        System.out.print(Solve(s.charAt(i)));
                    }  
                }   
            }
            System.out.print("\n");
        }
    }
}
