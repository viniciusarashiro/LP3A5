
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> alunoReflection = Class.forName("Aluno");
		
		Object aluno01 = alunoReflection.getConstructor().newInstance();
		
		Field[] atributos = alunoReflection.getDeclaredFields();
		
		for(Field atributo : atributos) {
			System.out.println(atributo);
		}
		
		Method[] metodos = alunoReflection.getDeclaredMethods();
		
		for(Method metodo : metodos) {
			System.out.println("Método:" + metodo);
			
			System.out.println("-------------------------------------------");
		}
		
		int modificador = alunoReflection.getModifiers();
		System.out.println(Modifier.isPrivate(modificador));
		
		Method metodo = aluno01.getClass().getDeclaredMethod("calculaMedia");
		metodo.setAccessible(true);
		
		
	}

}
