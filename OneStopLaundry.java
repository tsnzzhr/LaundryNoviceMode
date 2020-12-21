import java.util.Scanner;
import java.util.*;

public class OneStopLaundry
{   
    Scanner scan = new Scanner(System.in);
    String answer;
    
    public void OneStopLaundry()
    {
        System.out.println("Selamat datang di e-Laundry!");
        IdentitasCustomer customer = new IdentitasCustomer();
        customer.IdentitasCustomer();
        Price price = new Price();
        price.Price();
        confirmation();
    }
    
    public void confirmation()
    {
        System.out.println("Apakah Anda Sudah Selesai Bertransaksi Dengan Kami Dan Ingin Keluar Dari Program?");
        
        answer = scan.next();
        
        switch(answer){
        case "ya" :
        System.out.println("Terima Kasih Sudah Bertransaksi Bersama Kami.");
        break;
        case "tidak" :
        OneStopLaundry();
       }
    }
}
