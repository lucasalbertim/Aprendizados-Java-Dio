package PrimeiraSemana;

public class Operadores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//executarNome();
		//executarSomaString();
		executarNegacaoBoleano();
		
	}
		public static void executarNegacaoBoleano() {
		// TODO Auto-generated method stub
		boolean variavel = false;
		
		variavel = !variavel; //invertendo condição da variavel boleana
		
		System.out.println(variavel);
	}
		public static void executarSomaString() {
		// TODO Auto-generated method stub
			String concatenacao = "?";
			concatenacao = 1+1+1+"1";
			System.out.println(concatenacao);
			
			concatenacao = 1+"1"+1+1;
			System.out.println(concatenacao);
			
			concatenacao = 1+"1"+1+"1";
			System.out.println(concatenacao);
			
			concatenacao = "1"+(1+1+1);
			System.out.println(concatenacao);
			
		}
		public static void executarNome() {
		String nomeCompleto = "Lucas" + " Albertim" + " Barbosa" + " Rodrigues";
		System.out.println(nomeCompleto);
		}
}
