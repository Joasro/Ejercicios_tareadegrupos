import java.util.Random;

public class e7_17{
    private static final Random randomGenerator = new Random();
    private static final int Nt = 336000000;
    private static int[] tt = new int[11];

    public static void main(String[] args){
        for(int i=0; i<Nt; i++){
            
            int total = (rollDie() + rollDie()) - 2;

            ++tt[total];
        }

        System.out.printf("%s%13s\n", "Suma", "Total");

        for(int i=0; i<tt.length; i++){
            System.out.printf("%2d%15d\n", i+2, tt[i]);
        }
    }
    public static int rollDie(){
        return 1 + randomGenerator.nextInt(6);
    }
}