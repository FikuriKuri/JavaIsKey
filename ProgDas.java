public class ProgDas {
    //Input: "Sistem Informasi"
    //Output: "Isistem Informas"
    public static void main(String[] args){
        String input = "Sistem Informasi";
        int spaceLoc = input.indexOf(" ");
        String[] words1 = input.split("");
        String[] words2 = input.split("");

        for(int i=0;i<words1.length;i++){
            words1[(i+1)%words1.length] = words2[(i)].toLowerCase();
        }
        words1[0] = words1[0].toUpperCase();
        words1[spaceLoc + 2] = words1[spaceLoc + 2].toUpperCase(); 

        for (int i = 0; i < words2.length; i++) {
            System.out.print(words1[i]);
        }
    }
}