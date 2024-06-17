public class testno1{
    public static void main(String[] args){
        //soal1();
        soal2();
    }

    public static void soal1(){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=1;i<arr.length-1;i++){
            for(int j=i;j<arr[0].length;j++){
                if (arr[i][j]>arr[i-1][j]){
                        arr[i][j] = arr[i-1][j]++;
                }
                if (arr[i][j]%arr[j-1][i-1]>0){
                    arr[i][j] = arr[i-1][j]+ arr[i+1][j];
                    }
                    for(int k=0; k<arr.length;k++){
                        for(int l=0; l<arr[0].length;l++){
                            System.out.print(arr[k][l]);
                        }
                        System.out.println("\n");
                    }
            }
        }

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void soal2(){
        int numArr[][] = {{2,7,6},{9,5,1},{4,3,8}};
        int sumRowNow = 0;
        int sumCol0Now = 0;
        int sumCol1Now = 0;
        int sumCol2Now = 0;
        int sumDiaRightNow = 0;
        int sumDiaLeftNow = 0;

        for(int i=0; i<numArr.length;i++){
            sumRowNow += numArr[i][0] + numArr[i][1] + numArr[i][2];
            sumCol0Now += numArr[i][0];
            sumCol1Now += numArr[i][1];
            sumCol2Now += numArr[i][2];
            sumDiaRightNow += numArr[i][i];
            sumDiaLeftNow += numArr[i][numArr.length - 1 - i];
        }

        int expectedSum = sumRowNow / numArr.length; // Since sumRowNow includes all rows' sums.

        if(sumCol0Now == expectedSum && sumCol1Now == expectedSum && 
           sumCol2Now == expectedSum && sumDiaRightNow == expectedSum && 
           sumDiaLeftNow == expectedSum) {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}    