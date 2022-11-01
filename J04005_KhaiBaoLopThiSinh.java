package javaptit;

import java.util.Scanner;

public class J04005_KhaiBaoLopThiSinh 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        
        double ans;
        ans = p1 + p2 + p3;
        System.out.println(name + " " + date + " " + String.format("%.1f", ans));
    }
}
