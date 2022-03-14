import java.util.Scanner;

public class funcao3 {
	static int soma (int p1, int p2) {
		return p1+p2;
	}

	static int mult (int p1, int p2) {
		
	    int res = 0;
		
		for (int i = 1; i <= p2; i++) {
			res = soma(res, p1);
			
		}
		return res;
	}
		
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = input.nextInt();
		
		System.out.println(mult(num1,num2));

	
	}
	 

}
