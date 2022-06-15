import java.util.concurrent.Semaphore;

public class Teste {

	public static void main(String[] args) {
		int numeroPermissoes = 1;
		Semaphore mutex = new Semaphore(numeroPermissoes);
		Semaphore cheio = new Semaphore(0);
		Semaphore vazio = new Semaphore(1);
		
		Fila f = new Fila(0, mutex, cheio, vazio);
		Produtor p = new Produtor(f);
		Consumidor c1 = new Consumidor(f);
		Consumidor c2 = new Consumidor(f);
		Consumidor c3 = new Consumidor(f);
		
		p.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
