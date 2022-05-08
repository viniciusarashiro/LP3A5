import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		final List<Integer> lista = Arrays.asList(1,2,3,4,5);

		Optional<Integer> primeiro =  lista.stream().findFirst();
		
        System.out.println("Utilizando o método findFirst()");
		System.out.println(primeiro.get());
		
		

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Exemplo")
        								.add("de")
        								.add("Stream")
        								.build();
        
        System.out.println("Utilizando o método builder()");
        stream.forEach(System.out::println);
	}
}
