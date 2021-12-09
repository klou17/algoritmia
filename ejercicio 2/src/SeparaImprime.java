import java.util.Scanner;

public class SeparaImprime {
	static int numero=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len=0;
		while (len!=5)
		{
			System.out.println("Ingrese numero de 5 cifras: ");
			String num = sc.nextLine();
			numero=Integer.parseInt(num);
			len = num.length();
		}
		int n1=numero/10000;
		int n2=numero%10000/1000;
		int n3=((numero%10000)%1000)/100;
		int n4=(((numero%10000)%1000)%100)/10;
		int n5=(((numero%10000)%1000)%100)%10;
		String esp="   ";
		System.out.println(n1+esp+n2+esp+n3+esp+n4+esp+n5);
	}
}
