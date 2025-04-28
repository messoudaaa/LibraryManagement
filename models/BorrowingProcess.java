package models;

import java.time.LocalDate;

public class BorrowingProcess {
    private Book book;               // الكتاب المستعار
    private Borrower borrower;       // المستعير
    private LocalDate borrowDate;    // تاريخ الإعارة
    private LocalDate returnDate;    // تاريخ الاسترجاع (قد يكون null إذا لم يُسترجع بعد)

    // المُنشئ
    public BorrowingProcess(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now(); // تاريخ اليوم
        this.returnDate = null;
    }

    // إرجاع الكتاب
    public void returnBook() {
        this.returnDate = LocalDate.now(); // تاريخ الاسترجاع هو الآن
        book.setAvailable(true);           // جعل الكتاب متاحًا مجددًا
        borrower.returnBook(book);         // حذف الكتاب من قائمة استعارات المستعير
        System.out.println("تم استرجاع الكتاب بنجاح.");
    }

    // عرض تفاصيل عملية الإعارة
    public void displayProcessInfo() {
        System.out.println("الكتاب: " + book.getTitle());
        System.out.println("المستعير: " + borrower.getName());
        System.out.println("تاريخ الإعارة: " + borrowDate);
        System.out.println("تاريخ الاسترجاع: " + (returnDate != null ? returnDate : "لم يُسترجع بعد"));
    }

    // Getters (إذا احتجناهم لاحقًا)
    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}