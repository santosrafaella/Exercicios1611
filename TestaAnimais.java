package br.com.generation.exercicios1611;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo cv1 = new Cavalo();
		Preguica pg1 = new Preguica();
		
		
		c1.setNome("Tot�");
		c1.setIdade(2);
		c1.setEmitirSom("AuAuAu");
		c1.setCorrer("Tot� est� correndo");
		
		cv1.setNome("Pegasus");
		cv1.setIdade(3);
		cv1.setEmitirSom("iiirrrri");
		cv1.setCorrer("Pegasus est� correndo");
		
		pg1.setNome("Soneca");
		pg1.setIdade(4);
		pg1.setEmitirSom("Som de pregui�a");
		pg1.setSubirArvore("Soneca est� subindo na �rvore");
		
		
		System.out.println("Nome do cachorro: " + c1.getNome());
		System.out.println("Idade do cachorro: " + c1.getIdade() + " anos.");
		System.out.println("Som emitido pelo cachorro: " + c1.getEmitirSom());
		System.out.println("Movimenta��o do cachorro: " + c1.getCorrer());
		
		System.out.println();
		
		System.out.println("Nome do cavalo: " + cv1.getNome());
		System.out.println("Idade do cavalo: " + cv1.getIdade() + " anos.");
		System.out.println("Som emitido pelo cavalo: " + cv1.getEmitirSom());
		System.out.println("Movimenta��o do cavalo: " + cv1.getCorrer());
		
		System.out.println();
		
		System.out.println("Nome da pregui�a: " + pg1.getNome());
		System.out.println("Idade da pregui�a: " + pg1.getIdade() + " anos.");
		System.out.println("Som emitido pela pregui�a: " + pg1.getEmitirSom());
		System.out.println("Movimenta��o da pregui�a: " + pg1.getSubirArvore());
	}

}
