package javaptit;

import java.util.Arrays;
import java.util.Scanner;

public class J02006_Hop2DaySo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); 
        int a[] = new int[n + m];
        for(int i = 0; i < n + m; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n + m - 1; i++)
        {
            for(int j = i + 1; j < n + m; j++)
            {
                if(a[i] == a[j])    a[j] = -1;
            }
        }
        for(int i : a)
        {
            if(i != -1)
                System.out.print(i + " ");
        }
    }
}
