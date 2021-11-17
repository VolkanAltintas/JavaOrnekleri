import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Armut Kaç Kilo? :");
		int armut=sc.nextInt();
		System.out.println("Elma Kaç Kilo? :");
		int elma=sc.nextInt();
		System.out.println("Domates Kaç Kilo? :");
		int domates=sc.nextInt();
		System.out.println("Muz Kaç Kilo? :");
		int muz=sc.nextInt();
		System.out.println("Patlıcan Kaç Kilo? :");
		int patlıcan=sc.nextInt();
		double toplam=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.0*patlıcan);
		System.out.println("Toplam Tutar :" + toplam);

	}

}
