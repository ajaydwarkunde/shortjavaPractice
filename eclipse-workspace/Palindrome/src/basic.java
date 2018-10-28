import java.util.Scanner;
class palindrome1{
	int x;
	int temp;
	void function(int a[]){
		x = a.length;
		if ((x%2)==0) {
		 temp =0;
	//	 System.out.println("If condition");
		for(int i=0;i<((a.length)/2);i++) {
			if(a[i]==a[a.length-i-1]) {
				System.out.println();
				System.out.println((i+1)+" & "+(a.length-i)+ " Letters Match are:- "+a[i]);
				temp++;
			}
		}
	//	System.out.println("\ntemp value is:- "+temp);
		if(temp == (x/2)) {
			System.out.println("\nString is Palindrome.");
		}
		else
			System.out.println("\nString is Not Palindrome.");

	}
		else {
		temp=1;
		//System.out.println("else conditon");
			for(int i=0;i<((a.length)/2);i++) {
			if(a[i]==a[a.length-i-1]) {
				System.out.println();
				System.out.println((i+1)+" & "+(a.length-i)+ " Letters Match are:- "+a[i]);
				temp+=2;
			}
		}
		//	System.out.println("\ntemp value is:- "+temp);
			if(temp == a.length) {
				System.out.println("\n"+((a.length/2)+1)+" letter is : "+a[((a.length/2))]);
				System.out.println("\nString is Palindrome.");
			}
			else
				System.out.println("\nString is Not Palindrome.");
		
	}
	}
	
}
public class basic {

	public static void main(String[] args) {
		int a[];
		int i;
		Scanner abc= new Scanner(System.in);
		System.out.println("Enter the Size of String:- ");
		int size = abc.nextInt();
		a = new int[size]; 
		System.out.println("Enter the No Array:- ");
		for( i=0;i<a.length;i++) {
			a[i] = abc.nextInt();
			
		}
		System.out.print("Entered Array is:- ");
		for(i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
			
		}
		System.out.println();
		palindrome1 p = new palindrome1();
		p.function(a);
		
		}
}


