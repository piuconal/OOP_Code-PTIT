package javaptit;

import java.util.Scanner;
import java.util.ArrayList;

public class J01008_PhanTichThuaSoNguyenTo 
{
    public static void Method(int n)
    {
	ArrayList<Integer> listIndex = new ArrayList<Integer>();
	ArrayList<Integer> listCount = new ArrayList<Integer>();
	int dem = 2;
	int count = 0;
	while (n >= dem)
	{
            while (n % dem == 0)
            {
                n /= dem;
		count++;
            }
            if (count > 0)
            {
		listIndex.add(dem);
		listCount.add(count);
            }
            dem++;
            count = 0;
        }
		
	for(int i = 0; i < listCount.size(); i++)
	{
            System.out.print(listIndex.get(i)+"("+listCount.get(i)+") ");
	}
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 1; i <= test; i++)
        {
            int n = sc.nextInt();
            System.out.print("Test " + i + ": ");
            Method(n);
            System.out.print("\n");
        }
    }
}
