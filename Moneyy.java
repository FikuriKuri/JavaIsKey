import java.util.Scanner;

public class Moneyy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        moneyCount(sc.nextInt());
    }

    public static void moneyCount(int moneySum){
        int currency[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
        
        for(int i=0; i<currency.length; i++){
            int nMoney,change;
            
            if (moneySum < currency[i]) {
                continue;
            }
            else{
                nMoney = moneySum / currency[i];
                change = moneySum % currency[i];
                System.out.printf("A total of %d IDR %d\n", nMoney, currency[i]);
            }
            
            if (change != 0) {
                moneySum = change;
            }
            else{
                break;
            }
        }
    }
}
