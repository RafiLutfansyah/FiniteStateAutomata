import java.util.*;

public class State1 { // A1
    public static void main(String[] args) { // B1
        Scanner scan = new Scanner(System.in);
        final int N = 5, D = 10, Q = 25;
        int nilai = 0;
        String pilihan;
        while (nilai >= 0) { // C1
            System.out.println("Nilai = " + nilai);
            System.out.println("State 0");
            while (nilai < 25) { // D1
                System.out.print("Masukan Pilihan N/D/Q? ");
                pilihan = scan.next();
                switch (pilihan) { // E1
                    case "Q":
                    case "q":
                        nilai = nilai + Q;
                        System.out.println("Nilai = " + nilai);
                        System.out.println("State 5");
                        break;
                    default:
                        System.out.println("Pilihan Salah!");
                } // E2
            } // D2
            nilai = nilai - 25;
        } // C2
    } // B2
} // A2