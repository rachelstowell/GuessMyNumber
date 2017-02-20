import java.util.Scanner;
public class GuessMyNumber {

    public static void main(String[] args) {
        System.out.println("Think of an integer between 1 and 1,000,000!");
        guess(1, 1000000);
    }

    public static void guess(int low, int high) {
        Scanner scan = new Scanner(System.in);
        int midpoint = 0;
        int answer = 0;
        if (low == high) {
            answer = low;
            System.out.println("Is it " + answer + "?");
            char in0 = scan.next().charAt(0);
            if (in0 == 'y' || in0 == 'Y')
                System.out.println("I knew it!");
        }
        if (low < high) {
            midpoint = (low + high) / 2;
            System.out.println("Is it " + midpoint + "?");
            char in1 = scan.next().charAt(0);
            if (in1 == 'y' || in1 == 'Y') {
                System.out.println("I knew it!");
            } else {
                System.out.println("Is it larger than " + midpoint + "?");
                char in2 = scan.next().charAt(0);
                if (in2 == 'y' || in2 == 'Y') {
                    guess(midpoint + 1, high);
                } else {
                    guess(low, midpoint - 1);
                }
            }
        }
    }
}
