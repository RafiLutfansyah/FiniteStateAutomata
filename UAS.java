import java.util.*;

public class UAS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder kesimpulanQ = new StringBuilder();
        StringBuilder kesimpulanPilihan = new StringBuilder();
        ArrayList < String > paraKesimpulan = new ArrayList();
        boolean loop = true;
        int pilihan;
        while (loop == true) {
            while (loop == true) {
                System.out.println("State q0");
                kesimpulanQ.append("q0 -> ");
                System.out.print("Masukan pilihan: ");
                pilihan = scan.nextInt();
                switch (pilihan) {
                    case 1:
                        kesimpulanPilihan.append(", 1");
                        System.out.println("State q3");
                        kesimpulanQ.append("q3 -> ");
                        System.out.print("Masukan pilihan: ");
                        pilihan = scan.nextInt();
                        switch (pilihan) {
                            case 1:
                                kesimpulanPilihan.append(", 1");
                                while (loop == true) {
                                    System.out.println("State q4");
                                    kesimpulanQ.append("q4 -> ");
                                    System.out.print("Masukan pilihan: ");
                                    pilihan = scan.nextInt();
                                    switch (pilihan) {
                                        case 0:
                                            kesimpulanPilihan.append(", 0");
                                            break;
                                        case 1:
                                            System.out.println("State q6");
                                            kesimpulanQ.append("q6");
                                            kesimpulanPilihan.append(", 1");
                                            loop = false;
                                            break;
                                        default:
                                            System.out.print("ERROR!");
                                            loop = false;
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("State q5");
                                kesimpulanQ.append("q5 -> ");
                                kesimpulanPilihan.append(", 0");
                                System.out.print("Masukan pilihan: ");
                                pilihan = scan.nextInt();
                                switch (pilihan) {
                                    case 1:
                                        System.out.println("State q7");
                                        kesimpulanQ.append("q7 -> ");
                                        kesimpulanPilihan.append(", 1");
                                        loop = false;
                                        break;
                                    case 0:
                                        kesimpulanPilihan.append(", 0");
                                        break;
                                    default:
                                        System.out.print("ERROR!");
                                        loop = false;
                                }
                                break;
                            case 2:
                                kesimpulanPilihan.append(", 2");
                            default:
                                System.out.print("ERROR!");
                                loop = false;
                        }
                        break;
                    case 0:
                        while (loop == true) {
                            System.out.println("State q1");
                            kesimpulanQ.append("q1 -> ");
                            kesimpulanPilihan.append(", 0");
                            System.out.print("Masukan pilihan: ");
                            pilihan = scan.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("State q2");
                                    kesimpulanQ.append("q2");
                                    kesimpulanPilihan.append(", 1");
                                    loop = false;
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.print("ERROR!");
                                    loop = false;
                            }
                        }
                        break;
                    default:
                        kesimpulanQ.setLength(0);
                        kesimpulanQ.append("ERROR!");
                        kesimpulanPilihan.append("  ERROR!");
                        loop = false;
                }
            }
            kesimpulanPilihan.deleteCharAt(0);
            System.out.println();
            paraKesimpulan.add(kesimpulanQ.toString() + " {Start" + kesimpulanPilihan.toString() + "}");
            for (int i = 0; i < paraKesimpulan.size(); i++) {
                System.out.println("State rule " + i + " : " + paraKesimpulan.get(i));
            }
            System.out.println("\nRAFI LUTFANSYAH, 2014141007, 06TPLE018, V.311");
            kesimpulanQ.setLength(0);
            kesimpulanPilihan.setLength(0);
            System.out.print("\nMau masukin lagi gak? y/n ");
            String masukinLagi;
            masukinLagi = scan.next();
            System.out.println();
            if (masukinLagi.equals("Y") || masukinLagi.equals("y")) {
                loop = true;
            } else {
                loop = false;
            }
        }
    }
}