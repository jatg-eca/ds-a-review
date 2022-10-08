package filah.abuebook;

public class CiGaBook extends UNAMbook{
	
	private boolean mapasaColor;

	CiGaBook(String colorForros, int numeroDePaginas, boolean soalpas, String materialPapel, String materialForros,
			boolean mapasaColor) {
		super(colorForros, numeroDePaginas, soalpas, materialPapel, materialForros);
		// TODO Auto-generated constructor stub
		this.mapasaColor = mapasaColor;
	}
	
	public void despliegaPaginasLargas() {
		System.out.println("Pa su mecha unos mapas...");
		if(mapasaColor == true) {
			System.out.println("que andan a color");
		}
		else System.out.println("A blanco y negro");
	}
}
