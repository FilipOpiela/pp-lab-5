import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Adam", 30);
            System.out.println("Imie: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Podano nieprawidlowy wiek: " + e.getMessage());
        }
        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wiadmomosc testowa");
    }
}
