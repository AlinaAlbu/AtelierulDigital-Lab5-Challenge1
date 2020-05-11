package lab5.io.ch1;

public class Main {

    public static void main(String[] args) {

        Phonebook pb = new Phonebook(("./scr/lab5/io/phonebook.txt"));
        System.out.println(pb);

        System.out.println(pb.getNumberByName("Ghita"));
        System.out.println(pb.getNumberByName("Maria"));
    }


}
