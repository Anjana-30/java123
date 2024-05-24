package assignment1;

public class Salary {

	public static void main(String[] args)
	{
		 double basicSalary = 7000; 
	        
	        
	        double hraPercent;
	        double daPercent;
	        
	        
	        if (basicSalary <= 10000) 
	        {
	            hraPercent = 20;
	            daPercent = 80;
	        } 
	        else if (basicSalary <= 20000)
	        {
	            hraPercent = 25;
	            daPercent = 90;
	        }
	        else 
	        {
	            hraPercent = 30;
	            daPercent = 95;
	        }
	        
	        
	        double hra = (hraPercent/ 100) * basicSalary;
	        double da = (daPercent / 100) * basicSalary;
	        
	        
	        double totalSalary = basicSalary + hra + da;
	        
	       
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("Total Salary: " + totalSalary);

	}

}
