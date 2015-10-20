package preguntesExamen;

public class ComparatorVendaMercat extends Animal implements Comparable<Object>{
	

	public ComparatorVendaMercat(int codi, String breed, Double pes, int potes, Double preuVendaCanal) {
		super(codi, breed, pes, potes, preuVendaCanal);
	}
	
	@Override
	public int compareTo(Object obj) {
		// Create an Animal
		Animal that = (Animal) obj;
		
		// Save Animal Price in a variable
		double preuVentaA = this.getPreuVendaCanal();
		double preuVentaB = that.getPreuVendaCanal();
		
		// de mes petit a més gran
		if (preuVentaA > preuVentaB)
			return 1;
		if (preuVentaA < preuVentaB)
			return -1;			
		return 0;
	}
}
