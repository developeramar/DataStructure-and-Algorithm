package Coding_Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main_Class {
    
    public static void main(String[] args) {
        
        List <Person> people = new ArrayList<>();

        people.add(new Person("Amar" , 25 , "Buxar"));
        people.add(new Person("Arun" , 26 , "Patna"));
         people.add(new Person("Amar" , 25 , "Buxar"));
        people.add(new Person("Arun" , 26 , "Patna"));
        people.add(new Person("praksh" , 30 , "Ara"));
        people.add(new Person("Choubey" , 25 , "Dubai"));
        people.add(new Person("Nirala" , 38 , "Shekhpura"));
        people.add(new Person("Shambhu" , 33 , "Delhi"));
        people.add(new Person("Angad" , 31 , "Delhi"));
        people.add(new Person("tiwari" , 18 , "Ara"));

        /* for(Person person : people) {
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getPlace());
        }
        */

        // find the person in the database which age is equal to the conditional age ;

       /*  int targetedAge;
        System.out.println("Enter age of person -- ");
        Scanner scanner = new Scanner(System.in);

        targetedAge = scanner.nextInt();

        for(Person person : people) {
            if(person.getAge() >= targetedAge) {
                System.out.println(person.getName() + " " + person.getAge() + " " + person.getPlace());
            }
        }
*/

////////////////////////////////////////////////////////////////
// find the all person which name is repeating multiple time 

        Map <String,Integer> personNames = new HashMap<>();

        int count =0;
        for (Person person : people){
            String name  = person.getName();

            personNames.put(name , personNames.getOrDefault(name, 0) + 1);
        }

        for (Person person : people){

            if(personNames.get(person.getName()) > 1){
                System.out.println(person.getName() + " " + person.getAge() + " " + person.getPlace());
                count++;
            } 
        }
    
        System.out.println(count + " " + personNames);

    }
}
