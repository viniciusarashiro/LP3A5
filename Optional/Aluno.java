public class Aluno {
	private String nome;
	private String matricula;
	private int idade;
	private String curso;
	private String email;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String matricula, int idade, String curso, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.curso = curso;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimirDados() {
		System.out.println("========== Dados do Aluno ==========");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Curso: " + this.getCurso());
		System.out.println("E-mail: " + this.getEmail());
	}
	
}