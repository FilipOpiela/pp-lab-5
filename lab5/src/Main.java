import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
        	 Person[] people = new Person[5];
             final int b = 10;

             people[0] = new Person("Jan", 30);
             people[1] = new Person("Adam", 25);
             people[2] = new Person("Grzegorz", 40);
             people[3] = new Person("Janusz", 35);
             people[4] = new Person("Damian", 20);

             EmailMessenger emailMessenger = new EmailMessenger();

             for (Person person : people) {
                 int sum = MathUtils.add(person.getAge(), b);
                 String message = person.getName() + ", twoj wiek plus " + b + " to " + sum;
                 emailMessenger.sendMessage(message);
             }} catch (InvalidAgeException e) {
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

