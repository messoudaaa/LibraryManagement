package main;

// الاستيرادات
import models.Book;
import models.Borrower;
import models.BorrowingProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {

    // قوائم لحفظ البيانات
    private static List<Book> books = new ArrayList<>();
    private static List<Borrower> borrowers = new ArrayList<>();
    private static List<BorrowingProcess> borrowings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // طباعة القائمة
            System.out.println("\n===== نظام إدارة المكتبة =====");
            System.out.println("1. إضافة كتاب جديد");
            System.out.println("2. إضافة مستعير جديد");
            System.out.println("3. إعارة كتاب");
            System.out.println("4. استرجاع كتاب");
            System.out.println("5. عرض جميع الكتب");
            System.out.println("6. عرض جميع المستعيرين");
            System.out.println("7. البحث عن كتاب");
            System.out.println("8. عرض الكتب المستعارة لمستعير");
            System.out.println("0. خروج");
            System.out.print("اختر خياراً: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // تفادي مشكلة الإدخال

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    addBorrower(scanner);
                    break;
                case 3:
                    borrowBook(scanner);
                    break;
                case 4:
                    returnBook(scanner);
                    break;
                case 5:
                    displayAllBooks();
                    break;
                case 6:
                    displayAllBorrowers();
                    break;
                case 7:
                    searchBook(scanner);
                    break;
                case 8:
                    displayBorrowedBooks(scanner);
                    break;
                case 0:
                    System.out.println("تم الخروج من النظام.");
                    break;
                default:
                    System.out.println("خيار غير صحيح، حاول مرة أخرى.");
            }
        } while (choice != 0);
    }

    // هنا تكتب كل الدوال الأخرى

    private static void addBook(Scanner scanner) {
        // كود إضافة كتاب
    }

    private static void addBorrower(Scanner scanner) {
        // كود إضافة مستعير
    }

    private static void borrowBook(Scanner scanner) {
        // كود إعارة كتاب
    }

    private static void returnBook(Scanner scanner) {
        // كود استرجاع كتاب
    }

    private static void displayAllBooks() {
        // كود عرض كل الكتب
    }

    private static void displayAllBorrowers() {
        // كود عرض كل المستعيرين
    }

    private static void searchBook(Scanner scanner) {
        // كود البحث عن كتاب
    }

    private static void displayBorrowedBooks(Scanner scanner) {
        // كود عرض الكتب المستعارة
    }

    private static Book findBookByIsbn(String isbn) {
        // كود البحث عن كتاب بالـISBN
    }

    private static Borrower findBorrowerById(String id) {
        // كود البحث عن مستعير بالرقم الجامعي
    }
}