import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) throws Exception {
        System.out.println("Who are you?");
        System.out.print("> ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String name = br.readLine();
        System.out.println("Hello, " + name + "!");
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
        if (count[0] > count[1]) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}