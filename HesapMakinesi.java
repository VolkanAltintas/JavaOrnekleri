import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sonuc;
		Scanner sc=new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz...");
		int sayi1=sc.nextInt();
		System.out.println("İkinci sayıyı giriniz...");
		int sayi2=sc.nextInt();
		System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
		System.out.println("Seçiminiz...");
		int secim=sc.nextInt();
		switch (secim) {
		case 1: {
		sonuc=sayi1+sayi2;
		System.out.println(sonuc);
		break;
			
		}
		case 2: {
			sonuc=sayi1-sayi2;
			System.out.println(sonuc);
			break;
				
			}
		case 3: {
			sonuc=sayi1*sayi2;
			System.out.println(sonuc);
			break;
				
			}
		case 4: {
			
			sonuc=(sayi2!=0)?sayi1/sayi2:-1;
			System.out.println(sonuc);
			break;
				
			}
		default:
			System.out.println("Yanlış Seçim yaptınız..");
		}
		
	}
}
