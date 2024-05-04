import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

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
        
        int num1 = 5;
        int num2 = 10;
        
        int sum = MathUtils.add(num1, num2);
        System.out.println("Suma " + num1 + " i " + num2 + " wynosi: " + sum);
        
        EmailMessenger emailMessengerr = new EmailMessenger();
        emailMessengerr.sendMessage("Suma " + num1 + " i " + num2 + " wynosi: " + sum);
    }
}
