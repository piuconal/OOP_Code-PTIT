package quanlidanhsachtainghe;

import java.io.Serializable;

public class tainghe extends phukien implements Serializable{
    private String loai;
    private int soluong, dongia;
 
    public tainghe() {
        super();
    }
 
    public tainghe(String loai, int soluong, int dongia) {
        super();
        this.loai = loai;
        this.soluong = soluong;
        this.dongia = dongia;
    }
 
    public String getLoai() {
        return loai;
    }
 
    public void setLoai(String loai) {
        this.loai = loai;
    }
 
    public int getSoluong() {
        return soluong;
    }
 
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }
 
    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
 
    public int thanhTien() {
        return soluong * dongia;
    }
     
    public void nhap() {
        super.nhap();
        System.out.print("Loai: ");
        loai = scanner.nextLine();
        System.out.print("So luong: ");
        soluong = scanner.nextInt();
        System.out.print("Don gia: ");
        dongia = scanner.nextInt();
    }
     
    public String toString() {
        return "\nLoai: " + this.loai + "\nSo luong: " + this.soluong + "\nDon gia: " + this.dongia;
    }

}

