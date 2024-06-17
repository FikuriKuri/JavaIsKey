import java.text.DecimalFormat;
import java.util.Arrays;
import java.math.RoundingMode;
import java.util.Scanner;

public class Copy{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        task3A();
    }

    public static void task3A() {

        Scanner readFile = new Scanner(Copy.class.getResourceAsStream("score.csv"));

        int Case = readFile.nextInt();
        
        for (int i = 0; i < Case; i++) {

            int anggota = readFile.nextInt();

            readFile.nextLine();

            int[] id = new int[anggota];
            double[] mtk = new double[anggota];
            double[] fisika = new double[anggota];
            double[] kimia = new double[anggota];
            double[] biologi = new double[anggota];
            double[] sumScore = new double[anggota];
            String[] nama = new String[anggota];

            double[] max = new double[2];
            double[] min = new double[2];

            double avarageScore;

            System.out.println("ID Number\t|\tStudent Name\t|\tMathematics\t|\tPhysics \t|\tChemistry\t|\tBiology\t\t|");
            System.out.println("=========================================================================================================================================");

            for (int j = 0; j < anggota; j++) {

                String[] line = readFile.nextLine().split(",");

                id[j] = Integer.parseInt(line[0]);
                String status = (id[j] % 2 == 0? "even" : "odd");

                nama[j] = line[1];
                mtk[j] = (line[2].equals("")? 0 : Integer.parseInt(line[2]));
                fisika[j] = (line[3].equals("")? 0 : Integer.parseInt(line[3]));
                kimia[j] = (line[4].equals("")? 0 : Integer.parseInt(line[4]));
                biologi[j] = (line[5].equals("")? 0 : Integer.parseInt(line[5]));

                double[] scoreSort = {mtk[j], fisika[j], kimia[j], biologi[j]};
                Arrays.sort(scoreSort);
                
                double sum = mtk[j] + fisika[j] + kimia[j] + biologi[j];
                sumScore[j] += sum;
                
                switch (status) {

                    case "even":

                    if (mtk[j] == 0 || fisika[j] == 0 || kimia[j] == 0 || biologi[j] == 0) {
                        if (mtk[j] == 0) {
                            mtk[j] = (scoreSort[1] + scoreSort[2]) / 2;
                        }
                        else if (fisika[j] == 0) {
                            fisika[j] = (scoreSort[1] + scoreSort[2]) / 2;
                        }
                        else if (kimia[j] == 0) {
                            kimia[j] = (scoreSort[1] + scoreSort[2]) / 2;
                        }
                        else if (biologi[j] == 0) {
                            biologi[j] = (scoreSort[1] + scoreSort[2]) / 2;
                        }
                    }
                        break;

                    case "odd":

                    if (mtk[j] == 0 || fisika[j] == 0 || kimia[j] == 0 || biologi[j] == 0) {

                        if (mtk[j] == 0) {
                            mtk[j] = (sum) / 3;
                        }
                        else if (fisika[j] == 0) {
                            fisika[j] = (sum) / 3;
                        }
                        else if (kimia[j] == 0) {
                            kimia[j] = (sum) / 3;
                        }
                        else if (biologi[j] == 0) {
                            biologi[j] = (sum) / 3;
                        }

                    }
                    break;
                
                    default:
                        break;
                }

                System.out.println(id[j] + "\t\t|\t" + nama[j] + "\t\t|\t" + df.format(mtk[j]) + "\t\t|\t" + df.format(fisika[j]) + "\t\t|\t" + df.format(kimia[j]) + "\t\t|\t" + df.format(biologi[j]) + "\t\t|");
            }

            max[1] = sumScore[0];
            min[1] = sumScore[0];

            for (int k = 0; k < sumScore.length; k++) {
                if (sumScore[k] > max[1]){
                    max[1] = sumScore[k];
                    max[0] = k;
                }
                if (sumScore[k] < min[1]){
                    min[1] = sumScore[k];
                    min[0] = k;
                }
            }
            
            avarageScore = max[1] /4;

            System.out.println();
            System.out.println("============================");
            System.out.println("BEST STUDENT");
            System.out.println("ID NUMBER = " + id[(int) max[0]]);
            System.out.println("NAMA = " + (nama[(int) max[0]]));
            System.out.println("Average Store = " + max[1] / 4);
            System.out.println("============================");
            System.out.println();
        }
            
    }
}