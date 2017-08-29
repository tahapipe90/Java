//Taha pipewala
//code for karl pearson's correlation using actual mean method

import java.util.*;
public class KarlPearson{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of x\n");  //no of inputs for xn
		int x = sc.nextInt();
		int xn[]= new int[x]; 
		System.out.println();
		System.out.println("enter values of x\n"); //inputs stored in xn array
		for (int i=0;i<x;i++){
			xn[i]=sc.nextInt();
			}
		System.out.println();
		System.out.println("enter mean value for x\n");  //mean of xn
		int xm=sc.nextInt();
		
		int xmean[]=new int[x];  //caclculating the  values of X=xn-xmean
		for (int i=0;i<x;i++){
			xmean[i]=xn[i]-xm;
			}
			
			//display xmean
			System.out.println("the values of xmean are");
			for (int i=0;i<x;i++){
				System.out.println(xmean[i]);
				}
				System.out.println();
			
			int x2[]=new int[x];  //calculating Xsquare
			for (int i=0;i<x;i++){
				x2[i]=xmean[i]*xmean[i];
				}
				
				//display x2
				System.out.println("the values of x2 are");
			for (int i=0;i<x;i++){
				System.out.println(x2[i]);
				}
				System.out.println();
				
					int sumx2=0;  //calculating summation of Xsquare
				for (int i=0;i<x;i++){
					sumx2=sumx2+x2[i];
					}
					
					System.out.println("sum of x2 is \t"+sumx2);
					System.out.println();
					
				double Ex2=sumx2/x;  //Xsquare stored in Ex2
				System.out.println();
				System.out.println("summation of x2 is\t"+Ex2);
		System.out.println();
		
		//calculation of y
		
		System.out.println("enter no of y\n"); //no of inputs for yn
		int y = sc.nextInt();
		
		int yn[]= new int[y];
		System.out.println();
		System.out.println("enter values of y\n"); //inputs stored in yn array
		for (int i=0;i<y;i++){
			yn[i]=sc.nextInt();
			}	
		System.out.println();
		
		System.out.println("enter mean value for y\n");  //mean of yn
		int ym=sc.nextInt();
		System.out.println();
		
		int ymean[]=new int[y];  //caclculating the  values of Y=yn-ymean
		for (int i=0;i<y;i++){
			ymean[i]=yn[i]-ym;
			}
		//display ymean
		System.out.println("the values of ymean are");
			for (int i=0;i<y;i++){
				System.out.println(ymean[i]);
				}
				System.out.println();
				
			int y2[]=new int[y];  //calculation of y2
			for (int i=0;i<y;i++){
				y2[i]=ymean[i]*ymean[i];
				}
				//display y2
				System.out.println("the values of y2 are");
			for (int i=0;i<y;i++){
				System.out.println(y2[i]);
				}
				System.out.println();
				
				int sumy2=0;   //calculating Ysquare
				for (int i=0;i<y;i++){
					sumy2=sumy2+y2[i];
					}
					
					System.out.println("sum of y2 is \t"+sumy2);
					System.out.println();
				
				double Ey2=sumy2/y;
				System.out.println("summation of y2 is\t"+Ey2);
				System.out.println();
				
			    int xy[]=new int [x];  //calculating xy=X*Y
				for(int i=0;i<x;i++){
					xy[i]=xmean[i]*ymean[i];
					}
					
				//display xy
				System.out.println("the values of xy are");
			for (int i=0;i<y;i++){
				System.out.println(xy[i]);
				}
				System.out.println();
				
				int sumxy=0; //summation of xy
				for (int i=0;i<y;i++){
					sumxy=sumxy+xy[i];
					}
					
				System.out.println("sum of xy is \t"+sumxy);
					System.out.println();
					
				double Exy=sumxy/x;  //summation xy stored
				System.out.println("summation of xy is\t"+Exy);
				System.out.println();
				
				double x1=Math.sqrt(Ex2);
				System.out.println("square root of Ex2 is \t"+x1);
				System.out.println();
				
				double y1=Math.sqrt(Ey2);
				System.out.println("square root of Ey2 is \t"+y1);
				System.out.println();
				
				double mul=x1*y1;
				System.out.println("Multiplication of Ex2 and Ey2 is \t"+mul);
				System.out.println();  
				
				double r=Exy/mul;  //calculation of r
				System.out.println();
				System.out.println("the value of r is\t"+r);
				System.out.println();
				
				//display of resprctive relation
				if(r>0){
					System.out.println("positive correlation");
					}
					if(r==0){
						System.out.println("zero correlation");
						}
						if(r<0){
							System.out.println("negative correlation");
							}
		}
	}
