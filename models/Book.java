package models;

public class Book {
    private String title;       // عنوان الكتاب
    private String author;      // اسم المؤلف
    private String isbn;        // رقم ISBN
    private boolean isAvailable; // حالة الكتاب (متوفر أو معار)
    private String type;        // نوع الكتاب (ورقي أو إلكتروني)

    // Constructor - مُنشئ الكائن
    public Book(String title, String author, String isbn, String type) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.type = type;
        this.isAvailable = true; // افتراضيًا متاح
    }

    // Getter - للحصول على البيانات
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getType() {
        return type;
    }

    // Setter - لتعديل البيانات
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // دالة عرض بيانات الكتاب
    public void displayInfo() {
        System.out.println("العنوان: " + title);
        System.out.println("المؤلف: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("النوع: " + type);
        System.out.println("الحالة: " + (isAvailable ? "متوفر" : "معار"));
    }
}