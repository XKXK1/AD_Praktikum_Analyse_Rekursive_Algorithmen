package pascal;

public class PascalsTriangleIterativ implements PascalsTriangleCalculation
{
	private long counter = 0;
	

	@Override
	public long[] getLinePascals(int zeile) {
		long[][] pascal = new long[zeile][zeile+2];		
		long result;
		
		pascal[0][1] = 1;
		
		for(int reihe = 1; reihe < zeile; reihe++)
		{
			counter++;
			for(int spalte = 1; spalte < zeile+2; spalte++)
			{
				counter++;
				result = pascal[reihe-1][spalte] + pascal [reihe-1][spalte-1];
				pascal[reihe][spalte] = result;
				if(result == 0)
				{
					break;
				}
			}
		}
		
		return pascal[zeile-1];

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
