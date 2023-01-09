package quanlidanhsachtainghe;

import java.io.Serializable;
import java.util.Scanner;
 
public class phukien implements Serializable {
    private String maPK, tenPK, mauSac;
    Scanner scanner = new Scanner(System.in);
     
    public phukien() 
    {
        super();
    }
 
    public phukien(String maPK, String tenPK, String mauSac) {
        super();
        this.maPK = maPK;
        this.tenPK = tenPK;
        this.mauSac = mauSac;
    }
 
    public String getMaPK() {
        return maPK;
    }
 
    public void setMaPK(String maPK) {
        this.maPK = maPK;
    }
 
    public String getTenPK() {
        return tenPK;
    }
 
    public void setTenPK(String tenPK) {
        this.tenPK = tenPK;
    }
 
    public String getMauSac() {
        return mauSac;
    }
 
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
 
    public void nhap() {
        System.out.print("Ma phu kien: ");
        maPK = scanner.nextLine();
        System.out.print("Ten phu kien: ");
        tenPK = scanner.nextLine();
        System.out.print("Mau sac: ");
        tenPK = scanner.nextLine();
    }
     
    @Override
    public String toString() {
        return "Ma phu kien: " + this.maPK + "\nTen phu kien: " + this.tenPK + "\nMau sac: " + this.mauSac;
    }
}