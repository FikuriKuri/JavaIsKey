import java.util.Scanner;

public class ProgDasLatSoal {
    public static void main(String[] args){
        System.out.println(" ___,,  ,,_  _,    _,  _,  , ,  _, ___, ,  ___,,  ,  _,    ");
        System.out.println("' |  \\_/ |_)/_,   (_, / \\,|\\/| /_,' | |_|,' |  |\\ | / _    ");
        System.out.println("  | , /`'| '\\_     _)'\\_/ | `|'\\_   |'| |  _|_,|'\\|'\\_|`   ");
        System.out.println("  '(_/   '    `   '   '   '  `   `  ' ' ` '    '  `  _|    ");
        System.out.println("                                                    '      ");
        System.out.println();
        System.out.println("A Number-To-Text Program");
        System.out.println();
        mainMenu1();
    }

    public static void mainMenu1(){
        System.out.println("--------------MAIN MENU--------------");
        System.out.println("1.Number-to-Text        2.Exit");

        mainMenu2();
    }

    public static void mainMenu2(){
        System.out.println();
        System.out.print("Select a number to navigate through the menu: ");

        Scanner scan = new Scanner(System.in);
        int menuInput = scan.nextInt();

        switch (menuInput) {
            case 1:
                numToText();
                break;
            case 2:
                System.out.println();
                System.out.println("Exitting...");
                System.exit(0);
                break;
        
            default:
                System.out.println("Please enter again");
                mainMenu2();
                break;
        }

        scan.close();
    }

    public static void numToText(){
        System.out.println();
        System.out.println();
        System.out.println("WELCOME TO NUMBER-TO-TEXT PROGRAM!");
        System.out.println();

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        String numInput = input.nextLine();

        String[] numArr = numInput.split("");

        String[] output = new String[numArr.length];
        int holder;

        for(int i = 0; i<numArr.length;i++){
            holder = numArr.length-(numArr.length-i);
        
            switch (numArr[i]) {
                case "1":
                    output[i] = "satu";
                    break;
                case "2":
                    output[i] = "dua";
                    break;
                case "3":
                    output[i] = "tiga";
                    break;
                case "4":
                    output[i] = "empat";
                    break;
                case "5":
                    output[i] = "lima";
                    break;
                case "6":
                    output[i] = "enam";
                    break;
                case "7":
                    output[i] = "tujuh";
                    break;
                case "8":
                    output[i] = "delapan";
                    break;
                case "9":
                    output[i] = "sembilan";
                    break;
                default:
                    break;
            }
        
        

            }
        
        for(int i = 0; i<output.length;i++){
            System.out.print(output[i]+" ");
        }

        input.close();
    }
}
