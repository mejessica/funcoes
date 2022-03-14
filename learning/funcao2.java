import java.util.Scanner;
public class funcao2 {

	static int soma (int p1, int p2) {
		return p1+p2;
	}	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = input.nextInt();
		
		System.out.println(soma(num1,num2));

	}
	

}
