public class ProgDasLatihanArray {
    public static void main(String[] args){
        int[] numArr = {1,2,3,4,5,6,7};
        int d = 2;
        int[] new_numArr1 = new int[d];
        int[] new_numArr2 = new int[numArr.length];
        int[] new_numArr3 = new int[numArr.length];

        System.arraycopy(numArr, 0, new_numArr1, 0, d);

        System.arraycopy(numArr, 2, new_numArr2, 0, numArr.length-d);

        System.arraycopy(new_numArr2, 0, new_numArr3, 0, numArr.length);

        System.arraycopy(new_numArr1, 0, new_numArr3, new_numArr3.length-d, d);

        for(int i = 0; i < numArr.length; i++){
            System.out.print(new_numArr3[i]+" ");
        }
    }
}
