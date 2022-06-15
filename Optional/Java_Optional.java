import java.util.Optional;

public class Java_Optional {

	//Site utilizado como base para criar o exemplo
	//https://medium.com/@danielchristofolli/optional-java-f5fad98fa247
	
	public static void main(String[] args) {
		
		//Aluno aluno = new Aluno();  //Exemplo que o aluno n�o est� matriculado
		Aluno aluno = new Aluno("Vin�cius", "123456", 21, "ADS", "viniciusarashiro@gmail.com");  //Exemplo que o aluno est� matriculado
		Optional<String> procuraAluno = Optional.ofNullable(aluno.getMatricula());
		if (procuraAluno.isPresent()) {
			System.out.println("Aluno matriculado!");
		} else {
			System.out.println("Aluno n�o matriculado!");
		}

	}

}