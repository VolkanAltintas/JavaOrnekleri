import java.util.Scanner;

public class AlanHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double u= (a+b+c) / 2.0;
		
		double alan;
		alan = Math.sqrt( u* (u - a)* (u-b) * (u-c));
		System.out.println(alan);
	}

}
