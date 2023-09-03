package books;

import books.dao.LibraryImpl;
import books.model.Book;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryAppl {
    public static void main(String[] args) {
        LibraryImpl library = new LibraryImpl(100);//создаем обьект библиотеку
        Book[] books = new Book[6];//массив в котором хранятся книги в библиотеке
        books[0] = new Book(100L, 1960, "Pushkin");
        books[1] = new Book(200L, 1970, "Lermontov");
        books[2] = new Book(300L, 1950, "Tolstoy");
        books[3] = new Book(400L, 1975, "Dostoevsky");
        books[4] = new Book(500L, 1930, "Chekhov");
        books[5] = new Book(600L, 1900, "Pushkin");

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);//добавляем обьекты books[i] методом addBook в обьект library
        }

        System.out.println(library.size());
        System.out.println("+++++++++++++Unsorted++++++++++++");
        printBooks(books);
        Arrays.sort(books);
        System.out.println("+++++++++++++Sorted++++++++++++");
        printBooks(books);

        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare((int) o1.getIsbn(), (int) o2.getIsbn());
            }
        };
        System.out.println("+++++++++++++Sorted Comparator++++++++++++");
        Arrays.sort(books, comparator);
        printBooks(books);

        System.out.println("+++++++++++++Sorted Lambda++++++++++++");
        Arrays.sort(books, (b1, b2) -> { // sort by lambda
            return b1.getAuthor().compareTo(b2.getAuthor());
        });
        printBooks(books);

        System.out.println("======== Search Predicate ===========");
        Book[] pushkin = library.findBookByAuthor("Pushkin");
        printBooks(pushkin);


    }


    public static void printBooks(Book[] books){
        for (Book book : books){
            System.out.println(book);
        }
    }
}
