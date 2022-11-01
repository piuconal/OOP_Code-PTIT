package javaptit;

import java.util.Scanner;

public class J03024_SoUuThe 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0)
        {
            String s = sc.nextLine();
            int chan = 0, le = 0, ok = 0;
            if((int)s.charAt(0) == 48)
                System.out.println("INVALID");
            else
            {
                for(int i = 0; i < s.length(); i++)
                {
                    if((int)s.charAt(i) < 48 || (int)s.charAt(i) > 57)
                    {
                        ok = 1;
                        System.out.println("INVALID");
                        break;
                    }
                }
                for(int i = 0; i < s.length(); i++)
                {
                    if(((int)s.charAt(i) - 48) % 2 == 0)
                        chan++;
                    else
                        le++;
                }
                if(ok == 0)
                {
                    if((chan < le && s.length() % 2 != 0) || (chan > le && s.length() % 2 == 0))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
