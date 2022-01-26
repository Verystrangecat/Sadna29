import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int n=input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        Whatahell(n,n2);
        Whatahell(n,n3);
        Whatahell(n2,n3);

    }
    public static void Whatahell (int val, int val2){
        System.out.println(val+"+"+val2+"="+(val+val2));

    }
}
