package javaptit;

import java.util.Scanner;
import java.util.Vector;

public class J03005_ChuanHoaXauHoTen2 
{
    public static void DevideString(String s, Vector<String> a) 
    {
        String x = "";
        s += " ";
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == ' ') 
            {
                if (x != "") 
                {
                    a.add(x);
                    x = "";
                }
            } 
            else 
            {
                x += s.charAt(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String k = sc.nextLine();
            String s;
            s = k.toLowerCase();
            Vector<String> a = new Vector<>();
            DevideString(s, a);
            for (int i = 1; i < a.size() - 1; i++) 
            {
                String ans = a.get(i);
                System.out.print(ans.substring(0, 1).toUpperCase() + ans.substring(1) + " ");
            }
            String res = a.get(a.size() - 1);
            System.out.print(res.substring(0, 1).toUpperCase() + res.substring(1) + ", ");
            String res1 = a.get(0);
            System.out.println(res1.toUpperCase());
        }
    }
}
