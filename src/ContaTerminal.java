import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Número da sua Agência: ");
		String agencia = sc.next();
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite quanto você quer depositar: ");
		float saldo = sc.nextFloat();
		
		System.out.printf("Olá %s obrigador por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já esta disponível para saque", nome, agencia, numero, saldo);
		
		sc.close();
	}

}
