package Lab12_Tasks;

import java.util.Scanner;

public class Task4 {
    public void sentenceCheck(Scanner sc) {
        System.out.println("Enter a Sentence:");
        String sentence = sc.nextLine();

        try {
            if(sentence == null || sentence.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Sentence is NULL or Empty");
            return;
        }

        try {
            int wordCount = 1;
            for(int i=0; i<sentence.length(); i++) {
                if(sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            if(wordCount < 2) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException e) {
            System.out.println(sentence + " Contains Less Than Two Words");
        }
    }

    public static void main(String[] args) {
        Task4 t = new Task4();
        Scanner sc = new Scanner(System.in);
        t.sentenceCheck(sc);
    }
}
