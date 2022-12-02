import java.util.Scanner;

public class e6_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese la longitud del cuadrado: ");
		int side = input.nextInt();
		squareOfAsterisks(side);
	}

	private static void squareOfAsterisks(int side) {
		for(int i = 0; i < side; i++){
			for(int j = 0; j < side; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}