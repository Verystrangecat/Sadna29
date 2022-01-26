import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        Hell(n1, n2);
    }

    public static void Hell(int count, int num) {
        int counthelper = count;
        while (count > 0) {
            int counter2 = count;
            while (counter2 > 0) {
                System.out.print(num);
                counter2--;
            }
            System.out.println("");
            count--;
        }
        count = 1;
        while (count > 0 && count < counthelper) {
            count++;
            int counter2=count;
            while (counter2 > 0) {
                System.out.print(num);
                counter2--;
            }
            System.out.println("");
        }
    }
}


