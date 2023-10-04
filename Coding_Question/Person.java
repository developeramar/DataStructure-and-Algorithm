package Coding_Question;

public class Person {
    
    private String Name;
    private int Age;
    private String Place;
    
    public Person(String name, int age, String place) {
        Name = name;
        Age = age;
        Place = place;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }
   
    

    
}
