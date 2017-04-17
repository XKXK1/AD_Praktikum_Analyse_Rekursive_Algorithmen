package pascal;

public class PascalsTriangleRecursive implements PascalsTriangleCalculation{
	private long counter;

	@Override
	public long[] getLinePascals(int zeile) {
		long[] pascal = new long[zeile];

		for (int i = 0; i < zeile; i++)
		{
			counter++;
			pascal[i] = pascal_recursive(zeile - 1, i);
		}
		return pascal;		
	}
	
	public long pascal_recursive(int zeile, int spalte)
	{
		if (spalte == 0 || spalte == zeile)
		{
			return 1;
		}
		counter++;
		return pascal_recursive(zeile - 1, spalte)
				+ pascal_recursive(zeile - 1, spalte - 1);
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
