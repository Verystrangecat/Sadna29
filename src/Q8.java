import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a 3 digit number");
        int n=input.nextInt();
        boolean answer=again(n);
        System.out.println(answer);//There is at least one even number in the number
        int repeat;
        repeat=task(n);
        System.out.println(repeat+" is an amount of numbers with at least with one even digit");


    }
    public static boolean again (int n){
        boolean f = false;
        while (n>0){
            int num=n%10;
            int check=num%2;
            if (check==0){
                n=0;
                f=true;}
            else {
                n=n/10;
                f=false;
            }

        }
        return f;
    }
    public static int task(int n){
        Scanner input=new Scanner(System.in);
        int repeat=0;
        for (int i=0; i<10; i++){
            System.out.println("Please enter a number");
            n=input.nextInt();
           boolean answer=again(n);
            if (answer)
                repeat++;}
        return repeat;

    }

}


