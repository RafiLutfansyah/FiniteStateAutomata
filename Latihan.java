import java.util.Scanner;
public class Latihan
{ //A1
    public static void main(String args[])
    { //B1
        Scanner save = new Scanner (System.in);
	String Loop="", q0="", q1="", q2="", q3="", q4="", total_q="";
	int input=0;
	for(Loop="q0";Loop.equals("q0")||Loop.equals("Q0");)
	{ //C1
            System.out.println("State q0");
            q0="q0"; total_q=total_q+" -> "+q0;
            System.out.print("input : ");
            input=save.nextInt();
            if(input==0)
            { //D1
                System.out.println("State q2");
                q2="q2"; total_q=total_q+" -> "+q2;
                System.out.print("input : ");
                input=save.nextInt();
                if(input==1)
                { //E1
                    Loop="q0";
                } //E2
                else if(input==0)
                { //F1
                    System.out.println("State q4");
                    System.out.println("Finish");
                    Loop="x";
                    q4="q4"; total_q=total_q+" -> "+q4;
                } //F2
            } //D2
            q0="q0"; total_q=total_q+" -> "+q0;
        } //C1
        System.out.println("State Rute : "+total_q);
    } //B1
}  //A2