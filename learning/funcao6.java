import java.util.Scanner;

public class funcao5 {

	static int soma (int p1, int p2) {
		return p1+p2;
	}

	static int mult (int p1, double p2) {
		
	    int res = 1;
		
		for (; p2 != 0; --p2) {
			res = mult(res, p1);
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.println(mult(3, 3) == 27);

	        System.out.print("Digite dois números, um será a base e o outro será o expoente: ");
	        int num = input.nextInt();
	        double exp = input.nextDouble();

	        System.out.println("O resultado de "+num+" elevado a "+exp+" potência é: "+mult(num, exp));
	}

}
