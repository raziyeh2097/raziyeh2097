import java.util.Scanner;

public class Warmup{
    /*public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //for calling wordFinder
        String str = scan.nextLine();
        int num = scan.nextInt();
        System.out.println(wordFinder(str, num));

        //for calling OddEvenCounter
        String num2 = scan.nextLine();
        boolean isIt = scan.nextBoolean();
        System.out.println(oddEvenCounter(num2,isIt));

        //for calling firstWorld
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        System.out.println(firstWord(word1 , word2));
    }*/
    public static String wordFinder(String sentence,int number){
        int space = 1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ') space++;
        }
        if(space < number){
            return "Number = "+number+" is out of Bound";
        }else{
            String[] str=sentence.split(" ",space);
            return str[number-1];
        }
    }

    public static int oddEvenCounter(String number, boolean searchForEven){
        int cForEven=0;
        int cForOdd=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)%2==0) cForEven++;
            else cForOdd++;
        }
        if(searchForEven){
            return cForEven;
        }else{
            return cForOdd;
        }
    }
    public static String firstWord(String wordA, String wordB){
        int size;
        if(wordA.length()>wordB.length()){
            size=wordB.length();
        }else{
            size=wordA.length();
        }
        String answer=null;
        for(int i=0;i<size;i++){
            if(wordA.charAt(i)<wordB.charAt(i)){
                answer=wordA;
                break;
            }else if(wordB.charAt(i)<wordB.charAt(i)){
                answer=wordB;
                break;
            }
        }
        return answer;
    }
}