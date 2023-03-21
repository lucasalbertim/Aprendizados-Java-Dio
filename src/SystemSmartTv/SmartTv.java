package SystemSmartTv;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void aumentarVolume() {
		volume ++;
		if (volume >25) {
			volume = 25;
		} 
	}
	
	public void diminuirVolume() {
		volume --;
		if (volume < 1) {
			volume = 1;
		} 
	}
	
	public void mudarCanal(int novoCanal) {
		if (novoCanal > 500 || novoCanal < 1) {
			System.out.println("Canal " +novoCanal+ " não disponivel!"); 
		}else{
			canal = novoCanal;		
		}
	}
	
	public void aumentarCanal() {
		canal++;
		if (canal > 501) {
			canal = 1;
		}		
	}
	
	public void diminuirCanal() {
		canal--;
		if (canal < 1){
			canal = 500;
		}
	}
	
	public void ligar() {
		ligada=true;
	}
	public void desligar() {
		ligada=false;
	}
}

