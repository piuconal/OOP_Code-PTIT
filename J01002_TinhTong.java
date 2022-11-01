package javaptit;

import java.util.Scanner;

public class J01002_TinhTong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        while(test-->0)
        {
            long n = sc.nextInt();
            System.out.println((long)(n*(n+1)/2));
        }
    }
}
