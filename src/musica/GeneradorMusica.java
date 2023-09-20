package musica;

public class GeneradorMusica {

	public GeneradorMusica() {
		
	}
	
	public String generarMusica(Generos pgenero, Generos pgenero1, Generos pgenero2) {
		String musica = "";
		if (pgenero!=null) {
			if (pgenero1!=null) {
				if (pgenero2!=null) {
					musica = musica + pgenero2.instrumentos;
				}
				musica = musica + pgenero1.instrumentos;
			}
			System.out.println("Se ha generado la música");
			musica = musica + pgenero.instrumentos;
		}
		return musica;
	}
	
}
