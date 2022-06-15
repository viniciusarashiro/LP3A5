
public class Produtor extends Thread{
		Fila fila;
		
		Produtor(Fila fila) {
			this.fila = fila;
		}
		
		@Override 
		public void run() {
			for(int k=0; k<10; k++) {
				fila.produzir(this.getName(), k);
				try {
					sleep(0);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

}
