import java.util.Scanner;

public class reader {
    public static void scan(){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArr = input.split("");
        int inputInt = Integer.parseInt(input);
        int digit1 = Integer.parseInt(inputArr[0]);
        int digit2 = Integer.parseInt(inputArr[1]);
        int digit3 = Integer.parseInt(inputArr[2]);

        if(inputInt%7==0){
            inputInt-=digit3;
        }
        if(inputInt%3==0){
            inputInt-=digit2;
        }
        if(inputInt%2==0){
            inputInt-=digit1;
        }

        System.out.println(input+" "+inputInt);

        sc.close();
    }
    public static void main(String[] args){
        scan();
    }
}
