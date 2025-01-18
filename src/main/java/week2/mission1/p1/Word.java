package week2.mission1.p1;

public class Word {
    public static void main(String[] args) {
        char[] words = new char[26];
        for (int word = 65, idx =0 ; idx<26; word++,idx++) {
            words[idx]=(char) word;
        }

        for (char word : words) {
            System.out.print(word+" ");
        }
    }
}
