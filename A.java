import java .util.*;
public class A {
	public static  void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,n,a=0,b=1,c;
		System.out.println("ENTER N FOR SERIES\n");
		n=sc.nextInt();
		System.out.println("\n"+a+"\n"+b);
		for (i=3;i<=n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			}
		}
}
