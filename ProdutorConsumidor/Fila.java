import java.util.concurrent.Semaphore;

public class Fila {
	private int fila;
	private Semaphore mutex, cheio, vazio;
	
	Fila(int numero, Semaphore mutex, Semaphore cheio, Semaphore vazio) {
		this.fila = numero;
		this.mutex = mutex;
		this.cheio = cheio;
		this.vazio = vazio;
	}
	
	public int consumir(String idThread) {
		
		try {
			cheio.acquire();
			mutex.acquire();
			System.out.println("Consumidor " + idThread + " consumiu " + this.fila);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			mutex.release();
			vazio.release();
		}
		
		return this.fila;
	}
	
	public void produzir(String idThread, int valor) {
		try {
			vazio.acquire();
			mutex.acquire();
			this.fila = valor;
			System.out.println("Produtor " + idThread + " Produziu " + valor );
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			mutex.release();
			cheio.release();
		}
 	} 
	
	public synchronized int get(String idThread) {
		return this.fila;
	}
}
