package com.fyakut;


/**
 * stattic tanımlamak ona artık nesne ile değil sınıf ile erişmek yani o artık sınıfa ait demektir
 */
public class OgrenciMain {

    public static void main(String... args){//main olma nedeni direk erişmek için .nesne yaratmaya gerek yok.

        Ogrenci o1=new Ogrenci(12,"fatma");
      //  System.out.println("ogrenci sayısı:"+o1.getOgrencisayısı());
        System.out.println("ogrenci sayısı:"+o1.ogrencisayısı); //static yapıldıktan sonra direk erişim sağlanabişlir.

        Ogrenci o2=new Ogrenci(15,"yakut");
        System.out.println("ogrenci sayısı:"+o2.ogrencisayısı);

        Ogrenci o3=new Ogrenci(10,"ümran");
        System.out.println("ogrenci sayısı:"+o3.ogrencisayısı);
       Ogrenci.selamVer();

    }
}
