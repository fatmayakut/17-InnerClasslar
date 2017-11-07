package com.fyakut;

public class Ogrenci {

    private int oreciNo;
    private String ogrnisim;
    //private int ogrencisayısı=0; bu seklde olunca
    // her nesne uretildiğinde değişken yeniden başlatılmış gibi 0 değerini alır.
    // statik olarak tanımlandığında ilk değeri tutar ve nesne olşturulmadan erişim sağlanır
    public static int ogrencisayısı=0;

    public Ogrenci() {
    }

    public Ogrenci(int oreciNo, String ogrnisim) {
        this.oreciNo = oreciNo;
        this.ogrnisim = ogrnisim;
        this.ogrencisayısı++;
    }


    public int getOreciNo() {
        return oreciNo;
    }

    public void setOreciNo(int oreciNo) {
        this.oreciNo = oreciNo;
    }

    public String getOgrnisim() {
        return ogrnisim;
    }

    public void setOgrnisim(String ogrnisim) {
        this.ogrnisim = ogrnisim;
    }

    public int getOgrencisayısı() {
        return ogrencisayısı;
    }

    public void setOgrencisayısı(int ogrencisayısı) {
        this.ogrencisayısı = ogrencisayısı;
    }

    public static void selamVer(){
        System.out.println("");
    }
}
