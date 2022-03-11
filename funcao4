import java.util.Scanner;

public class funcao4 {
		
 
	static int mult (int p1, int p2) {
		
		
		   int res = p1;
		   int numero;
		   
		   if(p2<0) numero = p2*-1;
		   else numero = p2;
		   
			for (int i = 1; i < numero; i++) {
				res = res + p1;
				
			}
			if(((p1>0) && (p2<0))|| ((p1<0)&&(p2<0))) {res = res * (-1);}
			return res;
		
	}
		
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas vezes deseja realizar o teste ");
		int teste = input.nextInt();
		
		for(int i = 1; i<= teste; i++) {
			System.out.println("Digite um número");
			int num1 = input.nextInt();
			
			System.out.println("Digite o segundo número");
			int num2 = input.nextInt();
			
			System.out.println(mult(num1,num2));
	  }
		input.close();
	


	}

}
