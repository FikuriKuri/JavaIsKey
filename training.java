import java.io.IOError;
import java.util.Scanner;

public class training{
    public static void reading(){
        Scanner read = new Scanner(System.in);

        int i;
        String input;
        String[] inputArr;
        try{
            input = read.nextLine();
            inputArr = input.split("");
        
            System.out.println("Please enter again");
            input = read.nextLine();

        int[] inputInt = new int[inputArr.length];
        for(i = 0;i<inputArr.length;i++){
            inputInt[i] = Integer.parseInt(inputArr[i]);
        }
        int odd=1,even=1;
        i = 0;
        
        while(i<inputInt.length){
           if(inputInt[i]%2==0){
            even *= inputInt[i];
           }
           else{
            odd *= inputInt[i];
           }
           i++;
        }
        int result = even - odd;
        System.out.println(result);

        read.close();
    }
    catch(IOError ioe){
        input = read.nextLine();
    }
    }
    public static void main(String[] args){
        reading();
    }
}