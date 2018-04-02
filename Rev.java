import java.util.*;
class Rev{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string\n");
		String str=sc.nextLine();
		
		int l=str.length();
		String rev="";
		
		for(int i=l-1;i>=0;i--){
			rev=rev+(str.charAt(i));
			
			}
			System.out.println("the reverse of the string is\n"+rev);
			
			if(str.equals(rev)){
				System.out.println("Entered string is palimdrome");
				}
			else{
				System.out.println("Entered string is not palimdrome");
				}
	}
}
