package quanlidanhsachtainghe;

import java.util.ArrayList;
import java.util.Scanner;
 
public class menu {
     
    public static void main(String[] args) {
        ArrayList<tainghe> arrTainghe = new ArrayList<>();

        int soTainghe, tongTien = 0;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Nhap so tai nghe: ");
        soTainghe = sc.nextInt();
         
        System.out.println("Thong tin:");
        for (int i = 0; i < soTainghe; i++) 
        {
            System.out.println("Tai nghe thu " + (i + 1) + ":");
            tainghe tnghe = new tainghe();
            tnghe.nhap();
            arrTainghe.add(tnghe);
        }
        
        IOFile.writeFile("src/quanlidanhsachtainghe/tainghe.txt", arrTainghe);
        
        System.out.println("-----Danh sach-----");
        for (int i = 0; i < arrTainghe.size(); i++) 
            System.out.println(arrTainghe.get(i).toString());
        
            for (int i = 0; i < arrTainghe.size(); i++) 
            tongTien += arrTainghe.get(i).thanhTien();
        System.out.println("\n---------------------\nTong tien: " + tongTien);

    }
}