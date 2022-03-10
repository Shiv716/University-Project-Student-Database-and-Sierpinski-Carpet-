package Hashtables;

public class User {

    //PhoneBook entry of people:-
    private static final PhoneBookEntry phoneBookEntry1 = new PhoneBookEntry("John Gilbert","john@yahoo.com","newStreet uptown");
    private static final PhoneBookEntry phoneBookEntry2 = new PhoneBookEntry("Damon Raymond","damon@yahoo.com","newStreet2 uptown");
    private static final PhoneBookEntry phoneBookEntry3 = new PhoneBookEntry("Elena Gilbert","elena@yahoo.com","newStreet3 uptown");


    //Phonebook object for obtaining details from phonebook entry;
    private static final PhoneBook ph1 = new PhoneBook();

    public static void main(String[] args) {

        //prints updated phonebook entry:-
        PhoneBook.add_phonebook("Damon Salvatore",phoneBookEntry2);
        PhoneBook.add_phonebook("Elena gilbert",phoneBookEntry1);
        PhoneBook.add_phonebook("John gilbert",phoneBookEntry3);

        //Removes data from phonebook:-
       // PhoneBook.remove_phonebook("Damon Salvatore");


        ph1.print_function("Damon Salvatore");

        System.out.println("  ");

        System.out.println(ph1);
    }
}
