package pascal;

public class PascalsTriangleIterativ implements PascalsTriangleCalculation {
	private long counter = 0;

	/**
	 * Das Iterative Verfahren muss in jeder Zeile durch jede Spalte. Um eine
	 * neue Zeile berechnen zu können, wird das Paskalsche Dreieck in einem
	 * zweidimensionalen Array abgespeichert. Die zu berechnende Zeile nimmt
	 * sich dann die Ergebnisse der Zeile zuvor um jede Zahl der Spalte aus 2
	 * Spalten der Zeile zuvor zu berechnen. Die erste Zeile des Dreiecks wird
	 * vorinitialisiert.
	 */
	@Override
	public long[] getLinePascals(int zeile) {
		long[][] pascal = new long[zeile][zeile + 2];
		long result;

		// Vorinitialisierung der ersten Reihe
		pascal[0][1] = 1;

		// Jede Reihe wird Iteriert bis die Zielreihe erreicht wurde
		for (int reihe = 1; reihe < zeile; reihe++) {
			counter++;
			// Jede spalte wird iteriert, bis Die spalte+2 erreicht ist
			for (int spalte = 1; spalte < zeile + 2; spalte++) {
				counter++;
				// das Ergebniss der spalte berechnet sich aus der Zahl eine
				// Reihe drueber an dieser spalte + die Reihe drueber an der
				// spalte zuvor
				result = pascal[reihe - 1][spalte] + pascal[reihe - 1][spalte - 1];
				// Die Berechnete Zahl wird im ErgebnisArray gespeichert
				pascal[reihe][spalte] = result;
				if (result == 0) {
					break;
				}
			}
		}

		return pascal[zeile - 1];

	}

	@Override
	public void outpoutOfLine() {
		// TODO Auto-generated method stub

	}

	@Override
	public long getCounter() {
		return counter;
	}

	@Override
	public void setCounter(long counter) {
		this.counter = counter;

	}

}
