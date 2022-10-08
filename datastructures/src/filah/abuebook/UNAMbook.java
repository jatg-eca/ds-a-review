package filah.abuebook;

public class UNAMbook extends Book {
	
	private String colorForros;
	private int numeroDePaginas;
	private boolean solapas;
	private String materialPapel;
	private String materialForros;
	
	private int paginaActual = 0;
	
	UNAMbook(String colorForros, int numeroDePaginas,
			 boolean soalpas, String materialPapel,
			 String materialForros){
		this.colorForros = colorForros;
		this.numeroDePaginas = numeroDePaginas;
		this.solapas = soalpas;
		this.materialPapel = materialPapel;
		this.materialForros = materialForros;
		
	}

	@Override
	public void avanzaPagina() {
		if(paginaActual >= this.numeroDePaginas) {
			System.out.println("Se acabó el libro!");
			this.numeroDePaginas = 0;
		}
		else {
			paginaActual += 1;
		}
	}

	@Override
	public void regresaPagina() {
		// TODO Auto-generated method stub
		if(paginaActual <= 0) {
			System.out.println("No hemos empezado el libro");
			this.paginaActual = 0;
		}
		else {
			paginaActual -= 1;
		}
	}

	@Override
	public void despliegaPaginasLargas() {
		// TODO Auto-generated method stub
		System.out.println("Oh! Un poster???");
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		System.out.println("Leyendo");
	}

	@Override
	public void dejarDeLeer() {
		// TODO Auto-generated method stub
		System.out.println("Dejar de leer. Hora de programmar");
	}
	
	public void getPaginaActual() {
		System.out.println("Va en la página " + paginaActual);
	}

}
