
public class Consumidor extends Thread{
	Fila fila;
	
	Consumidor(Fila fila) {
		this.fila = fila;
	}
	
	@Override
	public void run() {
		int valor = 0;
		
		for(int k=0; k<10; k++) {
			valor = this.fila.consumir(this.getName());
			try {
				sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
