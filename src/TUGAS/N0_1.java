package TUGAS;
import java.util.Scanner;
public class N0_1 {
    public static void main (String[] args){
    System.out.println("***** SEQUENTIAL SAERCH *****"+"\n" );
        String data[] = {"Aljabar", "Galileo", "Alkhawarizmi", "Mayoma", "Tesla", "Archimedes"};
        String input;
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        input = scan.nextLine();
        
        System.out.print("isi data adalah: ");
        for (int i=0; i<data.length; i++){
            
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for (int i=0; i<data.length; i++){
            if (input.equalsIgnoreCase(data[i])){
                System.out.print("data "+input+" bearada pada indeks ke - " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" ***** Terima Kasih ***** ");
    }
}
