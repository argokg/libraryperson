package models;

public class Reader {
    private String fio;
    private long readerNum;
    private String faculty;
    private String birthDate;


    public Reader() {
    }

    public Reader(String fio, long readerNum, String faculty, String birthDate) {
        this.fio = fio;
        this.readerNum = readerNum;
        this.faculty = faculty;
        this.birthDate = birthDate;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public long getReaderNum() {
        return readerNum;
    }

    public void setReaderNum(long readerNum) {
        this.readerNum = readerNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void takeBook(int bookCount) {
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s взял %d книгу! \n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s взял %d книги! \n", fio, faculty, bookCount);
        } else {
            System.out.printf("Студент %s из факультета %s взял %d книг! \n", fio, faculty, bookCount);
        }
    }

    public void takeBook(Book[] books){
        if(books.length==1){
            System.out.printf("Студент %s из факультета %s взял %s книгу! \n", fio, faculty, books[0]);
        }
        else{
            System.out.printf("Студент %s из факультета %s взял: %s \n", fio, faculty, new Book().booksInfo(books));
        }
    }

    public void returnBook(int bookCount){
        if (bookCount == 1) {
            System.out.printf("Студент %s из факультета %s вернул %d книгу! \n", fio, faculty, bookCount);
        } else if (bookCount > 1 && bookCount < 5) {
            System.out.printf("Студент %s из факультета %s вернул %d книги! \n", fio, faculty, bookCount);
        } else {
            System.out.printf("Студент %s из факультета %s вернул %d книг! \n", fio, faculty, bookCount);
        }
    }

    public void returnBook(Book[] books){
        if(books.length==1){
            System.out.printf("Студент %s из факультета %s вернул %s книгу! \n", fio, faculty, books[0]);
        }
        else{
            System.out.printf("Студент %s из факультета %s вернул: %s \n", fio, faculty, new Book().booksInfo(books));
        }
    }


}
