import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int r;
        double pi=3.14 , a, alan;
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz :");
        r= inp.nextInt();

        System.out.print("Merkez açısının ölçüsüni giriniz :");
        a= inp.nextDouble();

        alan=(pi*(r*r)*a)/360;

        System.out.print("Dairenin alanı:" +alan );




}}



