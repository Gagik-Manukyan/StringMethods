package hm7;

public class Main {
    public static void main(String[] args){
        String word =  "We are living in an yellow submarine. We don't  have anything";
          String newWord = word.replaceAll("a", "");
        System.out.println(newWord);
    }

}
