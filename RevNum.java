import java.util.*;
class RevNum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number\n");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;int r;
		while (num!=0){
			r=num%10;
			rev=(rev*10)+r;
			num=num/10;
			}
			System.out.println("The reverse of the number is\t"+rev);
			
			if(temp==rev)
			System.out.println("The entered number is palindrome.\n");
			else
			System.out.println("The entered number is not palindrome.\n");
		
		}
	}
