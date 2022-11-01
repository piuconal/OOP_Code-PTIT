package javaptit;

import java.util.Scanner;

public class J04006_KhaiBaoLopSinhVien 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String cls = sc.nextLine();
        String date = sc.nextLine();
        double p = sc.nextDouble();
        
        if(date.charAt(1) == '/')
        {
            if(date.charAt(3) == '/')
                date = '0' + date.substring(0, 2) + '0' + date.substring(2);
            else if(date.charAt(4) == '/')
                date = '0' + date.substring(0);
        }
        else if(date.charAt(2) == '/')
        {
            if(date.charAt(4) == '/')
                date = date.substring(0, 3) + '0' + date.substring(3);
        }
        
        System.out.println("B20DCCN001 " + name + " " + cls + " " + date + " " + String.format("%.2f", p));
    }
}
