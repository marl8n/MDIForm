/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meso.mdiformpersons.information;

import java.util.LinkedList;
import meso.mdiformpersons.classes.Person;

/**
 *
 * @author MIDP9
 */
public class CollectionOfPersons {
    public static LinkedList<Person> persons = new LinkedList();

    public static LinkedList<Person> getPersons() {
        return persons;
    }

    public static void addPersons(Person person) {
        persons.add(person);
    }
    
    
}
