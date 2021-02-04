
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



        int i = 0;
        String[] newWords = new String[words.length];
        for(String eachWord: words){

            newWords[i] = eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1);
            i++;
        }
        System.out.println(Arrays.toString(newWords));

        System.out.println("commit");
        //commit

    }


}