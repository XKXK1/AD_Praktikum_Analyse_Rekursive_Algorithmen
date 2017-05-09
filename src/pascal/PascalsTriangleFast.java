package pascal;

import java.util.ArrayList;

public class PascalsTriangleFast implements PascalsTriangleCalculation {
	private long counter;
	private ArrayList<Long> faculty;

	public PascalsTriangleFast() {
		faculty = new ArrayList<Long>();
		counter = 0;
	}

	/**
	 * Der Algorithmus berechnet die jeweilige N-te Zeile über den
	 * Binomialkoeffizient n über k. Wobei n die Zeile und k die jeweilige
	 * Spalte in dem Dreieck darstellt.
	 */
	@Override
	public long[] getLinePascals(int n) {
		if (n > 0) {
			long[] dreieckzeile = new long[n];
			n--;
			long nfakultaet = getFacultyOf(n);

			// Da das Dreieck symmetrisch ist muss nur die Haelfte durchlaufen werden
			for (int k = 0; k <= n / 2; k++) {
				counter++;
				// Formel zum berechnet einer Zahl der Spalte im Dreieck
				dreieckzeile[k] = nfakultaet / (getFacultyOf(k) * getFacultyOf(n - k));			
				dreieckzeile[n - k] = dreieckzeile[k];
			}

			return dreieckzeile;
		} else {
			throw new IllegalArgumentException("Keine Zeile <= 0 erlaubt!");
		}
	}

	/**
	 * Hilfsmethode zum errechnen der Fakultaet einer Zahl
	 * 
	 * @param zahl
	 * @return
	 */
	protected long getFacultyOf(int zahl) {
		if (zahl < 0) // Fehlerfall eingabe ist ungueltig
		{
			return -1;
		}

		if (faculty.size() - 1 < zahl) // fakultaet muss noch berechnet werden
		{
			if (zahl == 0) // 0! ist definiert als 1
			{
				faculty.add(zahl, (long) 1);
			} else
			// Fakultaet muss berechnet werden (0! ist
			// definiert
			// als
			// 1)
			{
				for (int i = faculty.size(); i <= zahl; i++) {
					if (i == 0) {
						faculty.add(i, (long) 1);
					} else {
						counter++;
						long temp = i * faculty.get(i - 1);
						faculty.add(i, temp);
					}
				}
			}
		}
		// Falls Fakultaet schon vorhanden, kann sie direkt zurueckgegeben
		// werden
		return faculty.get(zahl);
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
