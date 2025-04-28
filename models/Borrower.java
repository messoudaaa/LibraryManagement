package models;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;              // اسم المستعير
    private String universityId;      // الرقم الجامعي
    private List<Book> borrowedBooks; // قائمة الكتب المستعارة

    // المُنشئ
    public Borrower(String name, String universityId) {
        this.name = name;
        this.universityId = universityId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUniversityId() {
        return universityId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // استعارة كتاب
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println("تمت إعارة الكتاب: " + book.getTitle());
        } else {
            System.out.println("عذرًا، الكتاب غير متوفر.");
        }
    }

    // استرجاع كتاب
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println("تم استرجاع الكتاب: " + book.getTitle());
        } else {
            System.out.println("هذا الكتاب غير موجود في قائمة استعاراتك.");
        }
    }

    // عرض بيانات المستعير
    public void displayInfo() {
        System.out.println("الاسم: " + name);
        System.out.println("الرقم الجامعي: " + universityId);
        System.out.println("الكتب المستعارة:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}