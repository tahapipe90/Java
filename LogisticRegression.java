import java.util.*;
class LogisticRegression {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of inputs\n");
		int n = sc.nextInt();
		
		float x[] = new float[n];
		System.out.println("Enter the values for x\n");
		for (int i=0;i<=n-1;i++){
			x[i]=sc.nextFloat();
			}
		System.out.println("\n");
		
			
			float sumX=0;
			for (int i=0;i<=n-1;i++){
				sumX=sumX+x[i];
				}
			System.out.println("The value of sum of x is equals to\t"+sumX);
			System.out.println("\n");
			
			float avgX=sumX/n;
			System.out.println("The value of avg of x is equals to\t"+avgX);
			System.out.println("\n");
			
			float xi[]=new float[n];
			System.out.println("The values for xi are as follows\n");
			for (int i=0;i<=n-1;i++){
				xi[i]=x[i]-avgX;
				System.out.println("value of\t"+"xi"+i+"\tis equals to\t" +xi[i]);
				}
				System.out.println("\n");
			
			System.out.println("Enter the values for yes or no in the form of 1 and 0 ");
			System.out.println("\n");
			
			
			float y[] = new float[n];
			System.out.println("Enter the values for y\n");
			for (int i=0;i<=n-1;i++){
				y[i]=sc.nextFloat();
				}	
				
			float sumY=0;
			for (int i=0;i<=n-1;i++){
				sumY=sumY+y[i];
				}
			System.out.println("The value of sum of y is\t"+sumY);	
			System.out.println("\n");
			
			float avgY=sumY/n;
			System.out.println("The value of avg of y is equals to\t"+avgY);
			System.out.println("\n");
			
			float yi[]=new float[n];
			System.out.println("The values for yi are as follows\n");
			for (int i=0;i<=n-1;i++){
				yi[i]=y[i]-avgY;
				System.out.println("value of\t"+"yi"+i+"\tis equals to\t"+yi[i]);
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
		
		float b0 = ((avgY)-(b1*avgX));
		System.out.println("The value of b0 is equals to\t"+b0);
		System.out.println("\n");
		
		System.out.println("Enter the value for x sample\n");
		float newX = sc.nextFloat();
		System.out.println("\n");
		float yCap = ((b0) + (b1*newX));
		System.out.println("The value of yCap for x sample is\t"+yCap);
		
		double e=2.71828;
		double r=Math.pow(e,yCap);
		
		double prob = ((r)/(r+1));
		System.out.println("The value of probability is\t"+prob);
		
		System.out.println("The probability of Logistic Regression is\t"+(prob*100)+"%");
		
			
		}
	}
/*
Enter the number of inputs

9
Enter the values for x

10
15
8
9
10
12
18
20
17


The value of sum of x is equals to      119.0


The value of avg of x is equals to      13.222222


The values for xi are as follows

value of        xi0     is equals to    -3.2222223
value of        xi1     is equals to    1.7777777
value of        xi2     is equals to    -5.2222223
value of        xi3     is equals to    -4.2222223
value of        xi4     is equals to    -3.2222223
value of        xi5     is equals to    -1.2222223
value of        xi6     is equals to    4.7777777
value of        xi7     is equals to    6.7777777
value of        xi8     is equals to    3.7777777


Enter the values for yes or no in the form of 1 and 0


Enter the values for y

1
1
0
1
0
0
1
1
1
The value of sum of y is        6.0


The value of avg of y is equals to      0.6666667


The values for yi are as follows

value of        yi0     is equals to    0.3333333
value of        yi1     is equals to    0.3333333
value of        yi2     is equals to    -0.6666667
value of        yi3     is equals to    0.3333333
value of        yi4     is equals to    -0.6666667
value of        yi5     is equals to    -0.6666667
value of        yi6     is equals to    0.3333333
value of        yi7     is equals to    0.3333333
value of        yi8     is equals to    0.3333333


values of xi*yi

value of        xiyi0   is equals to    -1.074074
value of        xiyi1   is equals to    0.59259254
value of        xiyi2   is equals to    3.4814816
value of        xiyi3   is equals to    -1.4074074
value of        xiyi4   is equals to    2.1481483
value of        xiyi5   is equals to    0.8148149
value of        xiyi6   is equals to    1.5925925
value of        xiyi7   is equals to    2.259259
value of        xiyi8   is equals to    1.2592591


The value of sum of Xi*Yi is equals to  9.666667


values of xi*xi

value of        xixi0   is equals to    10.382717
value of        xixi1   is equals to    3.1604934
value of        xixi2   is equals to    27.271606
value of        xixi3   is equals to    17.827162
value of        xixi4   is equals to    10.382717
value of        xixi5   is equals to    1.4938275
value of        xixi6   is equals to    22.82716
value of        xixi7   is equals to    45.93827
value of        xixi8   is equals to    14.271605


The value of sum of Xi*Xi is equals to  9.666667


The value of b1 is equals to    0.062952235


The value of b0 is equals to    -0.16570175


Enter the value for x sample

11


The value of yCap for x sample is       0.52677286
The value of probability is     0.6287300353256773
The probability of Logistic Regression is       62.87300353256773%
Press any key to continue . . .
*/
