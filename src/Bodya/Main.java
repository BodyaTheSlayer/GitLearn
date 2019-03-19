package Bodya;

public class Main {

    public static void main(String[] args) {
        /*
        Human human = new Human("Ivan", "Ivanov", "17.01.1994");
        System.out.println(human.getBirthday());
        Student student = new Student();
        System.out.println(student.getCourse());
        Philosopher philosopher = new Philosopher(100);
        System.out.println(philosopher.getCountBooks());
         */

        Philosopher philosopher1 = new Philosopher(100);
        Human human = new Human("Bodya","Maenkov","17.01.1994");
        /*System.out.println("<<<<<<<<NAME>>>>>>>>");
        System.out.println(philosopher1.getName());
        System.out.println("<<<<<<<<SURENAME>>>>>>>>");
        System.out.println(philosopher1.getSurename());
        System.out.println("<<<<<<<<BIRTHDATE>>>>>>>>");
        System.out.println(philosopher1.getBirthday());
        System.out.println("<<<<<<<<UNIVERSITY>>>>>>>>");
        System.out.println(philosopher1.getUniversity());
        System.out.println("<<<<<<<<COURSE>>>>>>>>");
        System.out.println(philosopher1.getCourse());
        System.out.println("<<<<<<<<NUMBER OF BOOKS READ>>>>>>>>");
        System.out.println(philosopher1.getCountBooks());
        System.out.println(human.getSurename());*/

        System.out.println(philosopher1);
    }
}
