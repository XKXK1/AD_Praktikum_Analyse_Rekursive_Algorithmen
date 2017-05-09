package pascal;

public class PascalsTriangleRecursive implements PascalsTriangleCalculation {
	private long counter;

	/**
	 * Das rekursive Verfahren geht die Länge der gesuchten Zeile: „N“ mit einer
	 * „for“-Schleife durch. Dann wird jeder Wert der Zeile durch die Summe von
	 * zwei neuen aufrufen derselben Funktion berechnet. So wird für jeden Wert
	 * die Rekursive Funktion aufgerufen, welche sich wie ein, bis es den
	 * gesuchten Wert ermittelt hat, immer weiter aufteilt. Jeder Aufruf hat
	 * somit zwei weitere Aufrufe. Die erste Zeile wird mit „1“ initialisiert,
	 * was die Abbruchbedingung für die Rekursive Funktion ist.
	 */
	@Override
	public long[] getLinePascals(int zeile) {
		long[] pascal = new long[zeile];

		for (int i = 0; i < zeile; i++) {
			counter++;
			//Rekursive Funktion wird für jeden Spaltenwert aufgerufen
			pascal[i] = pascal_recursive(zeile - 1, i);
		}
		return pascal;
	}

	public long pascal_recursive(int zeile, int spalte) {
		// Vorinitialisiertung der Ersten Zeile ist auch Abbruchbedingung
		if (spalte == 0 || spalte == zeile) {
			return 1;
		}
		counter++;
		//Berechnung durch Rekursive Berechnung einer Reihe drüber mit der Spalte + einer Reihe drueber mit einer Spalte davor
		return pascal_recursive(zeile - 1, spalte) + pascal_recursive(zeile - 1, spalte - 1);
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
