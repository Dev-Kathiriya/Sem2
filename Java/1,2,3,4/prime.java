import java.io.*;
import java.util.*;
class prime{
	public static void main(String[] args) {
		System.out.print("Enter no.on no you want to enter\n");
		Scanner inp=new Scanner(System.in);
		int x=inp.nextInt();
		int no[x];
		for (int i=0;i<x ; i++) {
			no[i]=inp.nextInt();
		}
		for (int i=0;i<x ;i++ ) {
			(no[i]%2==0)? System.out.print("Even "):System.out.print("Odd ");
		}
	}
}