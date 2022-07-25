import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class Student{
	public static void main(String[] args) {
		try{
			BufferedReader fib = new BufferedReader(new FileReader("temp.txt"));
			BufferedWriter fib2 = new BufferedWriter(new FileWriter("temp2.txt"));
			int i=fib.read();
			while(i!=-1){
				fib2.write(Character.toLowerCase((char)i));
				i=fib.read();
			}
			fib.close();
			fib2.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}