import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //kullanıcıdan değer alabilmek için dahil ederiz
        int fizik,matematik;
        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();
        System.out.print("Matematik notunuz: ");
        matematik=input.nextInt();
        double sonuc=(fizik+matematik)/2.0;
        System.out.println(sonuc);

    }
}
