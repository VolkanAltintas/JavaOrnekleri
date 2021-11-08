import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tutar, KdvOran;
		Scanner inp=new Scanner(System.in);
		System.out.println("Ücreti Giriniz...");
		tutar=inp.nextDouble();
		KdvOran=(tutar<1000)?0.18:0.08;
		double KdvTutar=tutar*KdvOran;
		double KdvliTutar=tutar+KdvTutar;
		System.out.println(KdvliTutar);
	}

}
