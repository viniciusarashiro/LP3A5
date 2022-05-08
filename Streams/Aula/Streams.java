import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
	    final List<String> lista = Arrays.asList("amor", "bola", "casa", "dado");
	    
	    System.out.println("Transformando a lista em Stream");
	    lista.stream().forEach(System.out::println);
	    
	    System.out.println("\n\nCom paralelismo");
	    lista.parallelStream().forEach(System.out::println);
	    
	    String[] nomes = new String[] {"Ana", "Beatriz", "Clara", "Diana", "Eliane"};
	    System.out.println("\n\nStream a partir de array usando a classe java.util.Arrays");
	    Arrays.stream(nomes).forEach(System.out::println);

	    System.out.println("\n\nCom paralelismo");
	    Arrays.stream(nomes).parallel().forEach(System.out::println);

	    //System.out.println("\n\nAo usar o método Stream.of podem ser passados Object");
			//Stream.of("casa", 1, "teste").forEach(System.out::println);

	    System.out.println("\n\nCriando um stream com o método IntStream.range");
		IntStream.range(10, 20).forEach(System.out::println); 


	    System.out.println("\n\nCriando um stream com o método Stream.iterate");
	    Stream.iterate(true, valor -> !valor).limit(5).forEach(System.out::println); 
	    Stream.iterate(1, valor -> valor = valor + 1).limit(20).forEach(System.out::println); 

	    System.out.println("\n\nMétodo skip");
	    Arrays.stream(nomes).skip(1).limit(2).forEach(System.out::println);
	    
	    System.out.println("\n\nMétodo filter");
	    Arrays.stream(nomes).filter(nome -> nome.startsWith( "C")).forEach(System.out::println);


	    System.out.println("\n\nMétodo Map");
	    Arrays.stream(nomes).map(String::toUpperCase).forEach(System.out::println);
        Arrays.stream(nomes).map(nome -> nome + " " + nome.length()).forEach(System.out::println);


	    System.out.println("\n\nMétodo splitAsStream");
	    Pattern padrao = Pattern.compile(" ");
	    padrao.splitAsStream("esse eh.um exemplo de teste!").forEach(System.out::println);

	    System.out.println("\n\nMétodo Reduce");
	    final OptionalInt resultadoSoma = IntStream.rangeClosed(1, 10).reduce( (v1, v2) -> v1+v2  );
	    System.out.println(resultadoSoma.getAsInt());

	    
	}
}
