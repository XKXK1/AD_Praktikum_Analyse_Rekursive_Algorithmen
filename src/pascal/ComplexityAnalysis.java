package pascal;

public class ComplexityAnalysis {
	
	static double counter;
public static void main(String[] args) {		
		
		PascalsTriangleCalculation pascal;
<<<<<<< HEAD
		for(int zeile = 1; zeile < 20; zeile += 1)
=======
		for(int zeile = 1; zeile < 22; zeile += 1)
>>>>>>> bbe1c104bef4f51510a03f09107043c5341c060a
		{
			System.out.println("\n ######## ZEILE : "+zeile+" #######");
			
			pascal = new PascalsTriangleFast();
			System.out.print("Binominal ");
			aufwandsAnalyse(pascal, zeile);
			
			pascal = new PascalsTriangleIterativ();
			System.out.print("Iterativ ");
			aufwandsAnalyse(pascal, zeile);
			
			pascal = new PascalsTriangleRecursive();
			System.out.print("Rekursiv ");
			aufwandsAnalyse(pascal, zeile);
		}
				
	}
	

	private static void aufwandsAnalyse(PascalsTriangleCalculation pascal, int zeile)
	{	
		long[] result = pascal.getLinePascals(zeile);
		
		//printArray(result);
		
		System.out.println(" : " + pascal.getCounter());
		pascal.setCounter(0);
	}
	
	public static void printArray(long[] array)
	{
		for (int spalte = 0; spalte < array.length; spalte++) 
		{			
			if(array[spalte] != 0)
			{
				System.out.print(array[spalte] + "|");
			}
		}
	}


}
