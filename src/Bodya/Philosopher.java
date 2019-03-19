package Bodya;

/**
 * Created by asus on 24.02.2019.
 */
public class Philosopher extends Student {
    private int countBooks;

    public Philosopher(){
        countBooks = 27;
    }
    public Philosopher(int countBooks){
        this.countBooks = countBooks;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
    }
    @Override
    public String toString(){
        return "Name " + this.getName()
                + "\nSurename " + this.getSurename()
                + "\nBirthday " + this.getBirthday()
                + "\nUniversity " + this.getUniversity()
                + "\nCourse " + this.getCourse()
                + "\nCount Reads Books " + this.getCountBooks();

    }
}
