package reproductor;


import ia.GeneradorLetra;
import musica.GeneradorMusica;
import musica.Generos;


public class Player {
	
	public Player() {
		
	}
	
	public void reproducir(String musica, String letra) {
		System.out.println("Se reproduce la canción");
	}
	
public static void main(String[] args) {
		GeneradorLetra genL = new GeneradorLetra();
		GeneradorMusica genM = new GeneradorMusica();
		Player reproductor = new Player();
		String frase = "Frase para la musica";
		Generos rock = new Generos("Rock", "Guitarra, Batería", 8);
		Generos pop = new Generos("Pop", "Guitarra, Teclado", 5);
		Generos hipHop = new Generos("Hip Hop", "Batería", 3);
		String musica = genM.generarMusica(rock, pop, null);
		String letra = genL.generarLetra(musica, frase);
		reproductor.reproducir(musica, letra);
	}

}
