package project;
import java.math.*;
import java.util.Scanner;

public class CWOR extends CP{
	
	public static BigInteger Combination(long N,long R){
		
		BigInteger NRResult = new BigInteger("1");
		BigInteger RResult = new BigInteger("1");
		BigInteger NMRResult = new BigInteger("1");
		BigInteger FResult;
		long c = N - R;
		BigInteger DResult;
		System.out.println("         --Results--                          ");
		
		// for n!
		for(long i = 1;i<=N;i++){
			
			NRResult = NRResult.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println("                                   ");
		System.out.println("The Factorial of "+ N + " is " + NRResult);
		
		//for r!
		for(long i = 1;i<=R;i++){
			
			RResult = RResult.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("                                   ");
		System.out.println("The Factorial of "+ R + " is " + RResult );
		
		//for (n-r)!
		for(long i=1 ; i<=c ; i++ ){
			
			NMRResult = NMRResult.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("                                   ");
		System.out.println("The N - R factoral is "+ NMRResult);
		System.out.println("                                   ");
		
		//for r!(n-r)!
		DResult = RResult.multiply(NMRResult);
		
		//for n!/r!(n-r)!
		FResult = NRResult.divide(DResult);
		return FResult;
	
	}
	
	public static void exit(){
		
		Index main = new Index();
		
		Scanner In = new Scanner(System.in);
		System.out.println("                           ");
		System.out.println("------------------------------------");
		System.out.println("           --End of Program--       ");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Do you want to continue? "); int choice = In.nextInt();


		
		if (choice == 1){
			
			main.main(null);
			
		}
		else{
			
			System.out.println("Thank You");
			
		}

	}
	
	
	public static void WOREP(){
		
		Scanner In = new Scanner(System.in);
		
		
		System.out.println("                                   ");

		System.out.println("-----------------------------------");
		
		System.out.println("      --Combinations without Repetitions--              ");
		System.out.print("Please Enter A Number For n Value: ");long N = In.nextLong();
		System.out.print("Please Enter Another Number For r Value: ");long R = In.nextLong();
		
		if(R < 0 || N < 0 ){
			
			System.out.println("The 'n' value and 'r' value should not be negative ");
			exit();
			
		}
		
		else if(R > N){ 
			
			System.out.println("                                   ");
			System.out.println("The 'r' Value Should Be Less Than Or Equal To 'n' Value");
			exit();
			
		}
		
		else if(R > N){ 
			
			System.out.println("                                   ");
			System.out.println("The 'r' value should be less than or equal to n value");
			exit();
			
		}
		
		else if(R > 500 || N > 500){
			
			System.out.println("The Limit Has Exceeded Number Should Be Less Than 500");
			exit();
			
		}

		else{
			
			System.out.println("                                   ");
			System.out.println("------------------------------------");
			System.out.println(" "+ N +"C"+ R +" is "+Combination(N, R));
			exit();
			
		}
		
	}
}
