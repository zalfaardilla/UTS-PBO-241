//import java.util.Scanner;//scan inputan
public class panjang {  
    public static void main(String[] args){//menjalankan data
        //Scanner sc = new Scanner (System.in);//scan inputan
        double meter = 200;
        double km, hm, dam, dm, cm, mm;
        
        //System.out.print("Masukkan nilai meter : ");
        //meter = sc.nextDouble();
        
        km = meter/1000;
        hm = meter/100;
        dam = meter/10;
        dm = meter*10;
        cm = meter*100;
        mm = meter*1000;

        
      
        System.out.println("Hasil Konversi Panjang");
        System.out.println("Meter ke Kilometer\t:"+km);
        System.out.println("Meter ke Hektometer\t:"+hm);
        System.out.println("Meter ke Dekameter\t:"+dam);
        System.out.println("Meter ke Desimeter\t:"+dm);
        System.out.println("Meter ke Centimeter\t:"+cm);
        System.out.println("Meter ke Milimeter\t:"+mm);
    }
    
}
