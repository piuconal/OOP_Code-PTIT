package javaptit;

import java.util.Scanner;

public class J02106_MaTranNhiPhan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[1005];
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            s[i] = sc.nextLine();
        }
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            int zer = 0;
            int one = 0;
            for(int j = 0; j < s[i].length(); j++)
            {
                if(s[i].charAt(j) == '0')       zer++;
                else if(s[i].charAt(j) == '1')  one++;
            }
            if(one > zer)   cnt++;
        }
        System.out.println(cnt);
    }
}
