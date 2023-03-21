package SystemSmartTv;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartTv smartTv =new SmartTv();
		
		System.out.println("Tv ligada? "+ smartTv.ligada);
		System.out.println("Canal Atual: "+ smartTv.canal);
		System.out.println("Volume Atual: "+ smartTv.volume);
		
		smartTv.mudarCanal(501);
		System.out.println("Novo status - > Canal Atual: "+ smartTv.canal);

		smartTv.mudarCanal(0);
		System.out.println("Novo status - > Canal Atual: "+ smartTv.canal);
		
		smartTv.diminuirVolume();
		System.out.println("Novo status - > Volume Atual: "+ smartTv.volume);
		
		smartTv.diminuirVolume();
		System.out.println("Novo status - > Volume Atual: "+ smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);
		
	}

}
