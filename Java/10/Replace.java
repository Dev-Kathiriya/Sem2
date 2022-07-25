import java.io.FileInputStream;
import java.io.FileOutputStream;
class Replace{	
	public static void main(String[] args) {
		try{
			FileInputStream fis =new FileInputStream("temp.txt");
			FileOutputStream fos =new FileOutputStream("temp1.txt");
			int a=fis.read();
			while(a!=-1){
				fos.write(a);
				a=fis.read();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Replacing Complete");
	}
}