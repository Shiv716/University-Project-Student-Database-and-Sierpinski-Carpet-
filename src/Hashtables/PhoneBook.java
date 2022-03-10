package Hashtables;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {


    // Following maps , full-names to phonebook entry ;
    private static HashMap<String,PhoneBookEntry> map = new HashMap<String,PhoneBookEntry>();


    public static void add_phonebook(String s , PhoneBookEntry o){

        //Putting in the map details
        map.put(s, o);

    }

    public static void remove_phonebook(String s){

        //Removing in the map details
        map.remove(s);

    }

    //Prints specifically  for asked name :-
    public void print_function(String Name){
        if(map.containsKey(Name)){
            for (PhoneBookEntry s : map.values()) {
                System.out.println("Details are: " +" email - "+ s.email+" , phone - " + s.Homeaddress);
            }
        }
    }

    //Printing all the present entries:-

    @Override
    public String toString() {
        return "PhoneBook:- \n " +
                "map= " + map +
                '\n' ;
    }
}
