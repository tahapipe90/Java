/*
@ author Taha Pipewala
*/
import java.util.*;
class LinearRegression{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of inputs\n");
		int n = sc.nextInt();
		
		float x[] = new float [n];
		System.out.println("Enter the values for x \n");
		
		for (int i=0;i<=n-1;i++){
			x[i]=sc.nextInt();
		
		}
		
		float sum=0;
			
		for (int i=0;i<=n-1;i++){
		 sum = sum + x[i];
		}
		
		System.out.println("Sum of x is equals to\t" +sum);
		System.out.println("\n");
		
		float avg = sum/n;
		System.out.println("Value of avg of x is equals to\t" +avg);
		System.out.println("\n");
		
		float xi[] = new float [n];
		System.out.println("The values for xi are as follows\n");
		for (int i=0;i<=n-1;i++){
		 xi[i]= x[i]-avg;
		 System.out.println("value of\t"+"xi"+i+"\tis equals to\t" +xi[i]);
		}
		System.out.println("\n\n");
		
		float y[] = new float [n];
		System.out.println("Enter the values for y \n");
		
		for (int i=0;i<=n-1;i++){
			y[i]=sc.nextInt();
		}
		
		float sum1=0;
		
		for (int i=0;i<=n-1;i++){
		 sum1 = sum1 + y[i];
		}
		
		System.out.println("Sum of y is equals to\t" +sum1);
		System.out.println("\n");
		
		float avg1 = sum1/n;
		System.out.println("Value of avg of y is equals to\t" +avg1);
		System.out.println("\n");
		
		float yi[] = new float [n];
		
		for (int i=0;i<=n-1;i++){
		 yi[i]= y[i]-avg1;
		 System.out.println("value of\t"+"yi"+i+"\tis equals to\t" +yi[i]);
		}
		System.out.println("\n");
		
		float xiyi[] = new float [n];
		System.out.println("values of xi*yi\n");
		for (int i=0;i<=n-1;i++){
		 xiyi[i]=xi[i]*yi[i];
		 System.out.println("value of\t"+"xiyi"+i+"\tis equals to\t" +xiyi[i]);
		}
		
		System.out.println("\n");
		
		
		float sumXiYi = 0;
		for(int i=0;i<=n-1;i++){
			sumXiYi=sumXiYi + (xi[i]*yi[i]);
		}
		System.out.println("The value of sum of Xi*Yi is equals to\t"+sumXiYi);
		System.out.println("\n");
		
		float xixi[] = new float [n];
		System.out.println("values of xi*xi\n");
		for (int i=0;i<=n-1;i++){
		 xixi[i]=xi[i]*xi[i];
		 System.out.println("value of\t"+"xixi"+i+"\tis equals to\t" +xixi[i]);
		}
		System.out.println("\n");
		
		float sumXiXi = 0;
		for(int i=0;i<=n-1;i++){
			sumXiXi=sumXiXi + (xi[i]*xi[i]);
		}
		System.out.println("The value of sum of Xi*Xi is equals to\t"+sumXiYi);
		System.out.println("\n");
		
		float b1 = ((sumXiYi)/(sumXiXi));
		System.out.println("The value of b1 is equals to\t"+b1);
		System.out.println("\n");
		
		float b0 = ((avg1)-(b1*avg));
		System.out.println("The value of b0 is equals to\t"+b0);
		System.out.println("\n");
		
		
		System.out.println("Enter the value for x sample\n");
		float newX = sc.nextFloat();
		System.out.println("\n");
		float predY = ((b0) + (b1*newX));
		System.out.println("The predicted value of y for x sample is\t"+predY);
		
		
		}
	}
	
	
//Output
/*
Enter the number of inputs

4
Enter the values for x 

10
15 
20
25
Sum of x is equals to	70.0


Value of avg of x is equals to	17.5


The values for xi are as follows

value of	xi0	is equals to	-7.5
value of	xi1	is equals to	-2.5
value of	xi2	is equals to	2.5
value of	xi3	is equals to	7.5



Enter the values for y 

20
22
35
40
Sum of y is equals to	117.0


Value of avg of y is equals to	29.25


value of	yi0	is equals to	-9.25
value of	yi1	is equals to	-7.25
value of	yi2	is equals to	5.75
value of	yi3	is equals to	10.75


values of xi*yi

value of	xiyi0	is equals to	69.375
value of	xiyi1	is equals to	18.125
value of	xiyi2	is equals to	14.375
value of	xiyi3	is equals to	80.625


The value of sum of Xi*Yi is equals to	182.5


values of xi*xi

value of	xixi0	is equals to	56.25
value of	xixi1	is equals to	6.25
value of	xixi2	is equals to	6.25
value of	xixi3	is equals to	56.25


The value of sum of Xi*Xi is equals to	182.5


The value of b1 is equals to	1.46


The value of b0 is equals to	3.6999989


Enter the value for x sample

20


The predicted value of y for x sample is	32.9


------------------
(program exited with code: 0)
Press return to continue

*/
