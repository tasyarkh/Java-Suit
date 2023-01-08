//Membuat game suit java sederhana
package suitjava;
import java.util.Scanner;

public class SuitJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anda = null;
        String komp = null;
        String hasil = null;
        
        System.out.println("=== PERMAINAN SUIT BATU GUNTING KERTAS ===");
        System.out.println("1. Batu");
        System.out.println("2. Gunting");
        System.out.println("3. Kertas");
        System.out.println("");
        
        System.out.print("Masukan pilihan anda (1/2/3) : ");
        
        int pilihan  = input.nextInt();
        switch(pilihan){
                case 1 :
                    anda = "Batu";
                    System.out.println("Anda memilih : "+ anda);
                    break;
                case 2 :
                    anda = "Gunting";
                    System.out.println("Anda memilih : "+ anda);
                    break;
                case 3 :
                    anda = "Kertas";
                    System.out.println("Anda memilih : "+ anda);
                    break;
                default:
                    System.out.println("Tidak ada pilihan");
        }
        
        int generate = (int) (Math.random()*3+1);
        switch(generate){
            case 1 :
                    komp = "Batu";
                    System.out.println("Komputer memilih : "+ komp);
                    break;
            case 2 :
                    komp = "Gunting";
                    System.out.println("Komputer memilih : "+ komp);
                    break;        
            case 3 :
                    komp = "Kertas";
                    System.out.println("Komputer memilih : "+ komp);
                    break;   
            default:
                System.out.println("Tidak ada pilihan");
        }
        
        if(pilihan<1 || pilihan>4){
            System.out.println("Ulangi Permainan");
        }else if (anda.equals(komp)) {
            hasil = "SERI";
        }else if (anda=="Batu" && komp=="Kertas") {
            hasil = "Anda Kalah, NT";
        }else if (anda=="Batu" && komp=="Gunting") {
            hasil = "Selamat anda menang";
        }else if (anda=="Kertas" && komp=="Gunting") {
            hasil = "Anda Kalah";
        }else if (anda=="Kertas" && komp=="Batu") {
            hasil = "Selamat anda menang";
        }else if (anda=="Gunting" && komp=="Batu") {
            hasil = "Anda kalah";
        }else if (anda=="Gunting" && komp=="Kertas") {
            hasil = "Selamat anda menang";
        }
        
        System.out.println("");
       
        for (int i = 0; i <=5; i++){
            System.out.println(hasil);
        }
    }
    
}
