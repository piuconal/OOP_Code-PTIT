package javaptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class MonHoc
{
    String maMon, tenMon;
    int soTinChi;
    void input(Scanner sc)
    {
        sc.nextLine();
        maMon = sc.nextLine();
        tenMon = sc.nextLine();
        soTinChi = sc.nextInt();
    }
    void output()
    {
        System.out.printf("%s %s %d\n", maMon, tenMon, soTinChi);
    }
}
public class J07034_DanhSachMonHoc 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        Vector<MonHoc> v = new Vector<>();
        for (int i = 0; i < n; i++) 
        {
            MonHoc x = new MonHoc();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc a, MonHoc b) 
            {
                if (a.tenMon.compareTo(b.tenMon) > 0)
                    return 1;
                return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
    }
}
