import java.util.Scanner;

public class DaireDilimiAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		double yaricap,aci;
		Scanner sc=new Scanner(System.in);
		
		yaricap=sc.nextDouble();
		aci=sc.nextDouble();
		
		double alan=(pi*(yaricap*yaricap)*aci)/360;
		System.out.println(alan);

	}

}
