package gerenciadordecursos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // Lista de aulas.

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {             // Metodo para impedir que não seja mais possível alterar o valor dessa lista
		// por fora da própria classe Curso
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) { // Metodo adiciona Aula
		this.aulas.add(aula);
	}

}
