package books.dao;

import books.model.Book;

import java.util.function.Predicate;

public class LibraryImpl implements Library{
    Book[] books;
    int size;

    //конструктор в котором создаетсся новый массив длиной capacity
    public LibraryImpl(int capacity){
        books = new Book[capacity];

    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBookByIsbn(book.getIsbn()) != null){
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                Book bookForRemove = books[i];
                books[i] = books[size - 1];//последнюю книгу поставили на место найденной
                books[size - 1] = null;//затираем последний элемент
                size--;
                return bookForRemove;
            }
        }
        return null;
    }

    @Override
    public Book findBookByIsbn(long isbn) {
        //надо перебрать массив, найти совпадение по isbn
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        Predicate<Book> predicate = book -> book.getAuthor().equals(author);
        return findBookByPredicate(predicate);
    }

    private Book[] findBookByPredicate(Predicate<Book> predicate) {
        int count = 0;
        //считаем количество книг которые попадают под условие
        for (int i = 0; i < size; i++) {
            if (predicate.test(books[i])){
                count++;
            }
        }
        //заполняем массив
        Book[] result = new Book[count];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (predicate.test(books[i])){
                result[j++] = books[i];
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }
}
