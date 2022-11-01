package javaptit;

import java.util.Scanner;

public class J04015_TinhThuNhapGiaoVien 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        int money = sc.nextInt();
        String hs = id.substring(2);
        int x = Integer.parseInt(hs);
        String pc = id.substring(0,2);
        String ht = "HT";
        String hp = "HP";
        String gv = "GV";
        int y;
        if(pc.compareTo(ht) == 0)        y = 2000000;
        else if(pc.compareTo(hp) == 0)   y = 900000;
        else                             y = 500000;
        
        System.out.print(id + " " + name + " " + x + " " + y + " " + (long)(x*money+y));
    }
}
