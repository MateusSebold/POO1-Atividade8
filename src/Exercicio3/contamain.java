package Exercicio3;

public class contamain {

	public static void main(String[] args) {
		// Teste Conta
		/*
		Conta c = new Conta("Banco do Brasil",123,321,0);
		if (c.deposito(1000))
			System.out.println("Dep�sito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);
		*/
		// Teste Conta Simples
		
		contasimples cs = new contasimples("Caixa", 456, 654, 100);
		System.out.println(cs.depositoPoupanca(-40000));
		System.out.println(cs.saquePoupanca(-40000));
		//System.out.println(cs.saquePoupanca(30000));
		System.out.println(cs);
		
		contaespecial ce = new contaespecial();
		System.out.println(ce.getDiassemjuros());
		System.out.println(ce.getLimite());
		

	}

}
