
public class Java_Exception {

	public static void main(String[] args) {
		try {
			int[] vetor = new int[3];
			
			//vetor[2] = 1;
			
			vetor[3] = 1;  
			System.out.println("Execução realizada com sucesso");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("O índice do vetor acessado não existe");
		}

	}

}
