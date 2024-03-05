import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Diziniz uzunluğunu giriniz: ");
        int diziBoyut = input.nextInt();

        int[] dizis = new int[diziBoyut];

        for (int i=0; i<dizis.length; i++){
            System.out.println("Diziniz"+i+"."+" elemanını giriniz:");
            dizis[i] = input.nextInt();
        }

        for (int deger: dizis){
            tekmiCiftmi(deger);
        }
    }

    public static void tekmiCiftmi(int sayi){
        if (sayi % 2==0){
            System.out.println( "Sayi "+sayi+ " Çifttir");
        }else {
            System.out.println( "Sayi "+sayi+" tektir");
        }
    }
}
