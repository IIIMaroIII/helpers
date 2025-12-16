import java.util.Scanner;

public class Validator {
    private int value;
    private final Scanner sc;

    public static void main(String[] args) {

    }

    public Validator(Scanner sc) {
        this.sc = sc;
    }


    public Validator isInteger() {
        while (true) {
            if (!this.sc.hasNextInt()) {
                System.out.println("    🐷 You've typed not integer. Try again ... 🐷\n");
                this.sc.next();
                continue;
            }
            this.value = this.sc.nextInt();

            if (this.value < 0) {
                System.out.println("    🐷 The integer must be positive. Try again ... 🐷\n");
                continue;
            }
            break;
        }

        return this;
    }

    public Validator isAboveLimit(int max) {
        while (true) {
            if (this.value > max) {
                System.out.format("    🐷 You've exceeded the maximum value which is %d. Try again ... 🐷\n", max);
                this.isInteger();
                continue;
            }
            break;
        }
        return this;
    }

    public int getResult() {
        return this.value;
    }
}