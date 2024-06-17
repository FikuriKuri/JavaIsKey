import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    /* Testing...
     * BRIEFING
     * My 2nd Voluntary Project
     * TIC-TAC-TOE
     *
     * How does this work?
     * 'Player1' is the method for the player
     * just like the classic game, the player can start on whichever turn they want on 'VS COM'
     * on 'DUEL', we use a randomizer
     *
     * Now I intended on adding 2 mode
     * 'VS COM' and 'DUEL'
     * this forced me to learn more about Java unfortunately
     * for now I'll make the rule for P1
     *
     * */

    public static void main(String[] args) {
        mainMenu();
    }


    static void mainMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Enter your name, nickname is recommended");
        System.out.println("V V V V")
        String name1 = scan.nextLine();

        System.out.println("oOoOOoOOo                    oOoOOoOOo                        oOoOOoOOo             oO ");
        System.out.println("    o     o                      o                                o                 OO ");
        System.out.println("    o                            o                                o                 oO ");
        System.out.println("    O                            O                                O                 Oo ");
        System.out.println("    o     O  .oOo  ooooooooo     o     .oOoO' .oOo  ooooooooo     o     .oOo. .oOo. oO ");
        System.out.println("    O     o  O                   O     O   o  O                   O     O   o OooO'    ");
        System.out.println("    O     O  o                   O     o   O  o                   O     o   O O     Oo ");
        System.out.println("    o'    o' `OoO'               o'    `OoO'o `OoO'               o'    `OoO' `OoO' oO \n\n");

        System.out.println("Select Mode: Enter A Number!");
        System.out.println("1.VS COM        2.DUEL      3.Exit");
        System.out.println("V V V V");

        int option = scan.nextInt();
        switch (option) {
            case 1:
                COM();
            case 2:
                Player2();
            case 3:
                System.exit(0);
        }

    }

    static void Player2() {
        Scanner scan = new Scanner(System.in);

        int[] coinFlip = {1,2,3,4,5,6};
        Random random = new Random();
        int decideTheTurn = random.intStream(0, 6);
        String turn = coinFlip[decideTheTurn];

        System.out.println(" ! FIRST TIME TUTORIAL ! ");

        System.out.println("     __ __ __");
        System.out.println(" 0  |__|__|__|");
        System.out.println(" 1  |__|__|__|");
        System.out.println(" 2  |__|__|__|");
        System.out.println("     0  1  2");

        System.out.println("When it's your turn, fill in the blank box by entering the coordinate\n" +
                "of the box (vertical axis, horizontal axis). Look at the map above for reference.");

        System.out.println();
        int choice = scan.nextInt();

        String[][] gameMap = {{"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}};
        try{
            String playerInput = coinFlip[choice];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Oops! Just pick numbers between 0 and 1!");
            System.out.println("Pick Head(0) or Tail(1)");
            choice = scan.nextInt();    
        }
        finally{
            System.out.println("TURN REVEAL!");
        }
        if (playerInput.equals(turn)) {
            System.out.println("\n"+name1+" is team 'X'");
            System.out.println(name1+" starts 1st");
            teamX(gameMap);
        } else {
            System.out.println("\nYou are team 'O'");
            System.out.println("You start 2nd");
            teamX(gameMap);
        }

    }

    static void COM() {
        System.out.println("This feature is still on development!\nPlease restart the game.");
        System.exit(0);
    }

    static void teamX(String[][] gameMap) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nTeam X's turn!");

        for (String[] row: gameMap) {
            for (String cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

            System.out.println("Input the vertical axis (0-2): ");
            int vertiAxis = scan.nextInt();

            System.out.println("Input the horizontal axis (0-2): ");
            int horiAxis = scan.nextInt();

            gameMap[vertiAxis][horiAxis] = "X";

            if (gameMap[0][0].equals("X")
                    && gameMap[0][1].equals("X")
                    && gameMap[0][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[0][0].equals("X")
                    && gameMap[1][1].equals("X")
                    && gameMap[2][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[0][0].equals("X")
                    && gameMap[1][0].equals("X")
                    && gameMap[2][0].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[1][0].equals("X") 
                    && gameMap[1][1].equals("X") 
                    && gameMap[1][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[2][0].equals("X") 
                    && gameMap[2][1].equals("X") 
                    && gameMap[2][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[2][0].equals("X") 
                    && gameMap[1][1].equals("X") 
                    && gameMap[0][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[0][1].equals("X")
                    && gameMap[1][1].equals("X")
                    && gameMap[2][1].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            } else if (gameMap[0][2].equals("X")
                    && gameMap[1][2].equals("X")
                    && gameMap[2][2].equals("X")) {
                System.out.println("Team X Wins!");
                replay();
            }
            else {
                teamO(gameMap);
            }
    }

    static void teamO(String[][] gameMap) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nTeam O's turn!");

        for (String[] row: gameMap) {
            for (String cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

            System.out.println("Input the vertical axis (0-2): ");
            int vertiAxis = scan.nextInt();

            System.out.println("Input the horizontal axis (0-2): ");
            int horiAxis = scan.nextInt();

            gameMap[vertiAxis][horiAxis] = "O";

            if (gameMap[0][0].equals("O")
                    && gameMap[0][1].equals("O")
                    && gameMap[0][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[0][0].equals("O")
                    && gameMap[1][1].equals("O")
                    && gameMap[2][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[0][0].equals("O")
                    && gameMap[1][0].equals("O")
                    && gameMap[2][0].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[1][0].equals("O")
                    && gameMap[1][1].equals("O")
                    && gameMap[1][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[2][0].equals("O")
                    && gameMap[2][1].equals("O")
                    && gameMap[2][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[2][0].equals("O")
                    && gameMap[1][1].equals("O")
                    && gameMap[0][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[0][1].equals("O")
                    && gameMap[1][1].equals("O")
                    && gameMap[2][1].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            } else if (gameMap[0][2].equals("O")
                    && gameMap[1][2].equals("O")
                    && gameMap[2][2].equals("O")) {
                System.out.println("Team O Wins!");
                replay();
            }
            else {
                teamX(gameMap);
            }
    }

    static void winCondition() {
        boolean winPossibility = true;
    }


    static void replay() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Play again? (Y/N)");
        String playAgain = scan.nextLine();
        if (playAgain.equals("Y") || playAgain.equals("y")) {
            mainMenu();
        }
        else if (playAgain.equals("N") || playAgain.equals("n")) {
            System.exit(0);
        }
    }
}