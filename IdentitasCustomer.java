import java.util.Scanner;
import java.util.*;

public class IdentitasCustomer{
    String nama;
    String alamat;
    String nomor_WA;
    Scanner scan = new Scanner(System.in); 
    
    public void IdentitasCustomer()
    {   
        System.out.print("Siapa Nama Anda? ");
        nama = scan.nextLine();
        System.out.print("Alamat Anda Berlokasi Di.. ");
        alamat = scan.nextLine();
        System.out.print("Nomor Whatsapp yang Bisa Kami Hubungi? ");
        nomor_WA = scan.nextLine();
    }
    
    public void DisplayIdentitas()
    {
       System.out.println("Nama Customer    : " + nama);
       System.out.println("Alamat Customer    : " + alamat);
       System.out.println("Nomor WA Customer    : " + nomor_WA);
    }
}
