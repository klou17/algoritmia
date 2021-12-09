import java.util.Scanner;

public class Descifrado {
	static int numero=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=0;
		while (len!=4)
		{
			System.out.println("Cifrado (4 cifras): ");
			String num = sc.nextLine();
			numero=Integer.parseInt(num);
			len = num.length();
		}
		int n1=numero/1000;
		int n2=(numero%1000)/100;
		int n3=((numero%1000)%100)/10;
		int n4=((numero%1000)%100)%10;
		int [] array = {n1,n2,n3,n4};
		for(int i=0;i<4;i++) 
		{
			if (array[i]<7)
				array[i]=array[i]+3;
			else
				array[i]=array[i]-7;
		}
		System.out.println("Descifrado: "+array[0]+""+array[1]+""+array[2]+""+array[3]);
	}
}
