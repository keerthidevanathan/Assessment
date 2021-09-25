package question1;

public class taxCalculator {
	public static double taxableAmount(double monthlySalary)
	{
		double AnnualIncome=12*monthlySalary;
		double tax =0;
		
		if(250000 < AnnualIncome && AnnualIncome <= 500000)
			tax=AnnualIncome*(0.1);
		else if(500000 < AnnualIncome && AnnualIncome <= 1000000)
			tax=(250000*0.1)+((AnnualIncome-500000)*(0.2));
		else if(1000000 < AnnualIncome)
			tax=(250000*0.1)+(500000*(0.2))+((AnnualIncome-1000000)*0.3);
		
		return tax;
			
	}
}


