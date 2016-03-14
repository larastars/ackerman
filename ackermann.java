
public class ackermann {
	public int counter = 0;
	private int Array [][] = new int [4][5000];
	
	public int Ackermann (int m, int n)
	{ 
	    int tableValue = tableLookUp(m, n);
		if (tableValue == 0)
		{
			if (m == 0)
			{
				counter ++;
				setValue (m, n, n+1);
				return (n+1);
			}
			else 
			{
				if (n == 0)
				{
					counter ++;
					setValue (m, n, Ackermann(m-1, 1));
					return Ackermann (m-1, 1);
				}
				else
				{
					counter ++;
					setValue (m, n, Ackermann(m-1, Ackermann(m,n-1)));
					return Ackermann(m - 1, Ackermann(m,n - 1));
				}
				
			}
		}
		else
			return tableValue;
	}
	public int tableLookUp(int m, int n)
	{
		return Array [m][n];
		
	}
	public void setTable ()
	{
		for (int i = 0; i < Array.length-1; i++)
		{
			for (int j = 0; j < Array.length-1; j++)
			{
				Array [j][i] = 0;
			}
		}
	}
	public void setValue(int m, int n, int value)
	{
		Array[m][n] = value;
	}
	public int getCount ()
	{
		return counter;
	}

}
