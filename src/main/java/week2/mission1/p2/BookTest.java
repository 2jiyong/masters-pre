package week2.mission1.p2;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        // A 도서관
        ArrayList<Book> bookListA = new ArrayList<>();
        bookListA.add(new Book("태백산맥","조정래"));
        bookListA.add(new Book("이기적 유전자","리처드 도킨즈"));
        bookListA.add(new Book("자전거 도둑","박완서"));
        bookListA.add(new Book("토지","박경리"));
        bookListA.add(new Book("대변동","제레드 다이아몬드"));

        // A-1 도서관 얕은 복사
        ArrayList<Book> bookListA_1 = new ArrayList<>(bookListA);
        // B 도서관 깊은복사
        ArrayList<Book> bookListB = new ArrayList<>();
        for (Book book : bookListA) {
            bookListB.add(new Book(book.getTitle(), book.getAuthor()));
        }

        // A 도서관에서 책 수정
        bookListA.get(2).setTitle("그 많던 싱아는 누가 다 먹었을까");
        bookListA.get(2).setAuthor("박완서");

        // B 도서관에서 책 추가
        bookListB.add(new Book("사피엔스","유발 하라리"));
        System.out.println("A 도서관");
        printBookList(bookListA);
        System.out.println("A-1 도서관");
        printBookList(bookListA_1);
        System.out.println("B 도서관");
        printBookList(bookListB);

    }

    public static void printBookList(ArrayList<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
    }
}
