package preguntesExamen;

import java.util.Comparator;

public class perValor implements Comparator<Animal> {

	@Override
	public int compare(Animal a, Animal b) {

		// Compare Potencia Fiscal de mes petit a més gran
		if (a.getPreuVendaCanal() > b.getPreuVendaCanal())
			return 1;
		if (a.getPreuVendaCanal() < b.getPreuVendaCanal())
			return -1;
		return 0;
	}

}