package javaptit;

import java.util.Scanner;

public class J01001_HinhChuNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        if(cd > 0 && cr > 0)
            System.out.println((cd + cr) * 2 + " " + cd * cr);
        else
            System.out.println("0");
    }
}
