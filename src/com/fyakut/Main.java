package com.fyakut;
//dıstaki class cerceve class olarak adlandırılır
public class Main {

    /**
     * iç içe classlar olarak adlandırılabilir.
     *
     * @param args
     */


    public static void main(String[] args) {
        String[] dizi={"emre","hasan","omer"};
       Main.StringDizi ad=new Main().new StringDizi();//cağırrıken ust sınıftan sonra yazılır
       ad.diziiYaz(dizi);

    }

    /**
     * dahili uye inner class//iç dahili class
     * inner classlarda private procted yapılabilir
     */
   public  class  StringDizi{

        public  void diziiYaz(String[] dizi){
            for (String gecici:dizi)
                System.out.println(gecici);

        }
   }
}
