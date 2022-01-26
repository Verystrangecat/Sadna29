import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        double n= input.nextDouble();
        double answer;
        while  (n==1 || n==2 || n==3){
            answer=Whatahell(n);
            System.out.println(answer);
            System.out.println("Please enter a number");
            n= input.nextDouble();
        }
    }











    public static double Whatahell (double n){
        Scanner input=new Scanner(System.in);
        double sum=0;
        System.out.println("Please enter 3 numbers");
            double n2= input.nextDouble();
            double n3= input.nextDouble();
            double n4= input.nextDouble();
            if (n==1)
               sum=(n2+n3)/2;
            else if (n==2)
                sum=(n2+n4)/2;
            else if (n==3)
                sum=(n3+n4)/2;
           return sum;
        }
}


