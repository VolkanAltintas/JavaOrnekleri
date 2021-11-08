import java.util.Scanner;

public class NotOrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Türkçe Notunuzu giriniz..");
		int turkce=inp.nextInt();
		
		System.out.println("Matematik Notunuzu giriniz..");
		int matematik=inp.nextInt();
		
		System.out.println("Müzik Notunuzu giriniz..");
		int muzik=inp.nextInt();
		
		System.out.println("Fizik Notunuzu giriniz..");
		int fizik=inp.nextInt();
		
		System.out.println("Tarih Notunuzu giriniz..");
		int tarih=inp.nextInt();
		
		System.out.println("Kimya Notunuzu giriniz..");
		int kimya=inp.nextInt();
		
		int toplam=turkce+matematik+muzik+fizik+tarih+kimya;
		double ortalama=toplam/6.0;
		
		String sonuc=(ortalama>60)?"Sınıfı Geçti":"Sınıfta Kaldı";
		System.out.println(sonuc);
		
	}

}
