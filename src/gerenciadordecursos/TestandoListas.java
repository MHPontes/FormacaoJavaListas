package gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListas {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>(); // Declarando Array do tipo Aula
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas); // Chamando a lista antes de ordenar

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // Ordenando a lista, após rescrevermos metodo
																		// toString na classe Aula, utilizando a
																		// interface Comparable e também comparando por
																		// tempo de aula do menor para o maior

		// aulas.sort(Comparator.comparing(Aula::getTempo));

		// - Forma mais "bonita" para
		// utilizarmos o Comparator pois Toda lista, a partir do Java 8, possui um
		// método sort que recebe Comparator

		System.out.println(aulas); // Chamando a lista após ordenar

	}

}
