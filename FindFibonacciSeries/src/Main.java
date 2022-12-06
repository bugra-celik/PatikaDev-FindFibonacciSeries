import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int n1=0,n2=1,n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz:");
        n = scan.nextInt();
        System.out.print(n1 + " " + n2);

        for(int i =1;i<n;i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;


        }
    }
}
