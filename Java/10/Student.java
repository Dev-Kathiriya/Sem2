import java.io.FileInputStream;
import java.io.FileOutputStream;
class Student{
	public static void main(String[] args) {
		try{
			FileInputStream fib = new FileInputStream("temp.txt");
			FileOutputStream fib2 = new FileOutputStream("temp2.txt");
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