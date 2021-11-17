import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen boyunuzu giriniz.. ");
		double boy=sc.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz.. ");
		double kilo=sc.nextDouble();
		double indeks=(kilo/(boy*boy));
		System.out.println("Vücut Kitle İndeksi"+indeks);

	}

}
