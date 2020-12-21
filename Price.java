import java.util.*;
import java.util.Scanner;

public class Price{
    long harga;
    int kilo;
    int jenis_cuci;
    Scanner scan = new Scanner(System.in); 
    
    
    public void Price(){
        System.out.print("Masukkan Berat Laundry Dalam Satuan Kilo : ");
        kilo = scan.nextInt();
        System.out.println("Masukkan Jenis Cuci : ");
        System.out.println("1- Cuci Kering Tanpa Setrika ");
        System.out.println("2- Cuci Kering Setrika ");
        System.out.println("3- Cuci Basah ");
        System.out.println("4- Wenter ");
        jenis_cuci = scan.nextInt();
        countTotal(kilo,jenis_cuci);
    }
    
    public void countTotal(int kilo,int jenis_cuci)
    {
        
        if(jenis_cuci == 1){
            harga = kilo * 3000;
        }else if(jenis_cuci == 2){
            harga = kilo * 4500;
        }else if(jenis_cuci == 3){
            harga = kilo * 2000;
        }else if(jenis_cuci == 4){
            harga = kilo * 6000;
        }
        
        System.out.println("Total Biaya Laundry : " + harga);
    }
    
}
