import java.io.IOException;

public class e11_16 {

	public static void main(String[] args) {
		try{
			throw new e16_exeptionA();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try{
			throw new e16_exeptionB();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		try{
			throw new NullPointerException();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		try{
			throw new IOException();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}