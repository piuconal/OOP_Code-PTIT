package javaptit;

import java.util.Scanner;

public class J04007_KhaiBaoLopNhanVien 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String date = sc.nextLine();
        String add = sc.nextLine();
        String id = sc.nextLine();
        String day = sc.nextLine();
        
        System.out.println("00001 " + name + " " + sex + " " + date + " " + add + " " + id + " " + day);
    }
}
