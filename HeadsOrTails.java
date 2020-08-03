import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        String[] str = {"Heads", "Tails"};
        int[] count = {0, 0};
        System.out.println("Tossing a coin...");
        Random random = new Random();
        for(int i=0 ; i<3 ; i++) {
            int index = random.nextInt(2);
            count[index]++;
            System.out.println("Round " + i + ": " + str[index]);
        }
        System.out.println("Heads: " + count[0] + ", Tails: " + count[1]);
    }
}