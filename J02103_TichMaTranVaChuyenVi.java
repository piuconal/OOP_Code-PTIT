package javaptit;

import java.util.Scanner;

public class J02103_TichMaTranVaChuyenVi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int res = 1; res <= test; res++)
        {
            System.out.print("Test " + res + ":\n");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            int ans[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    for(int k = 0; k < m; k++)
                    ans[i][j] += a[i][k] * b[k][j];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
