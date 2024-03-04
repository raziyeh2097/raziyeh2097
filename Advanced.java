import java.util.Scanner;

public class Advanced{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        //for calling wordCensor
        String sen = scan.nextLine();
        String oWord = scan.nextLine();
        String nWord = scan.nextLine();
        System.out.println(wordCensor(sen , oWord , nWord));
        */
        /*
        //for calling normalizingName
        String fname = scan.nextLine();
        String lname = scan.nextLine();
        System.out.println(normalizingName(fname , lname));
         */
        /*
        //for calling doubleChar
        String w= scan.nextLine();
        System.out.println(doubleChar(w));
         */
    }
    public static String wordCensor(String sentence, String word, String newWord){
        int size = 1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ') size++;
        }
        String[] strArray = sentence.split(" ", size);
        for(int i=0;i< strArray.length;i++){
            if(strArray[i].equals(word))
                strArray[i] = newWord;
        }
        String answer = "";
        for(int i=0; i<strArray.length;i++){
            answer+=strArray[i]+' ';
        }
        return answer;
    }
    public static String normalizingName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        char[] fname = firstName.toCharArray();
        char[] lname = lastName.toCharArray();
        fname[0]-=32;
        lname[0]-=32;
        String answer="";
        for(int i=0;i<fname.length;i++){
            answer+=fname[i];
        }
        answer+=' ';
        for(int i=0;i<lname.length;i++){
            answer+=lname[i];
        }
        return answer;
    }
    public static String doubleChar(String word){
        char[] strArray = word.toCharArray();
        for(int i=1;i<word.length();i++){
            if(strArray[i]==strArray[i-1]){
                strArray[i]='*';
            }
        }
        String answer="";
        for(int i=0;i<word.length();i++){
            if(strArray[i]!='*') answer+=strArray[i];
        }
        return answer;
    }
}