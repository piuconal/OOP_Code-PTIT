package javaptit;

import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int n1 = s1.length();
            int n2 = s2.length();
            int res = s1.compareTo(s2);
            if(res == 0)
                System.out.println("-1");
            else
                System.out.println(Math.max(n1, n2));
        }
    }
}
