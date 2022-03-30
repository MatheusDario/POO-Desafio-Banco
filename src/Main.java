
public class Main {

	public static void main(String[] args) {
		
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		
		
		
		IConta cc = new ContaCorrente(matheus);
		IConta cp = new ContaPoupanca(matheus);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		System.out.println();
		
		
		
	}

}
