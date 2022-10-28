package gerenciadordecursos;


public class Aula implements Comparable<Aula> { // Assinando a interface Comparable, para conseguirmos realizar o
												// ordenamento da lista por String etc

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override // reescrevendo nosso método toString da classe Aula, para que ele retorne algo
				// significativo:
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) { // Metodo reescrito após assinarmos a interface Comparable comparando por Titulo
		return this.titulo.compareTo(outraAula.titulo);

	}

}
