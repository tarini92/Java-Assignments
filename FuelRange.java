import java.util.Scanner;


public class FuelRange {

	public static void main(String[] args)
	{
		
		float range = 0.0f;
		Scanner sc = new Scanner(System.in);
		int numCars = sc.nextInt();
		int dp[] = new int[numCars];
		float eff[] = new float[numCars];
		float remfuel[] = new float[numCars];
		for(int i=0;i<numCars;i++)
		{
			dp[i] = sc.nextInt();
			eff[i] = sc.nextFloat();
			remfuel[i] =sc.nextFloat();
			
		}
		for(int i=1;i<=numCars;i++)
		{
			if(dp[i]==1)
				range = eff[i]*remfuel[i];
			else if(dp[i]==2)
				range = eff[i]*(remfuel[i]/100);
			System.out.println("Car"+i+": range = "+range);
		}
		
		}
		
		
		
	}

