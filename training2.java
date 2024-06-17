public class training2 {
    public static void main(String[] args){

        String yow = new String("kuder#$hfi$#jfl");
        String[] woy = yow.split("");
        String charStr;
        for(int i = 0; i < yow.length(); i++){
            charStr = woy[i];
            String x = charStr;
            if(charStr =="#"){
                x = charStr.replace(charStr, "");
            }
            if(charStr =="$"){
                x = charStr.replace(charStr, "");
            }

            System.out.print(x);
        }

    }
}
