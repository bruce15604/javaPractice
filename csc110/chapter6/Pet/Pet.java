import java.util.Scanner;

/* Design a class named Pet, which should have the following fields/methods:
name - holds the name of a pet
animal - holds the type of animal that a pet is
age - holds the pet's age

setName - stores a value in the name field
setAnimal - stores a value in the animal field
setAge - stores a value in the age field
getName - returns the value of the name field
getAnimal - returns the value of the animal field
getAge - returns the value of the age field

Finish the code, and also draw a UML diagram of the class.
In the UML diagram, include the field and method's access and data types,
also include method params and their data types
 */
public class Pet
{
    //declare private variables
    private String name;
    private String animal;
    private int age;

    public void setName(String name) //Gets pet name from user
    {
        this.name = name;
    }

    public void setAnimal(String animal) //Gets animal type from user
    {
        this.animal = animal;
    }

    public void setAge(int age) //Gets pet age from user
    {
        this.age = age;
    }

    public String getName() //Returns pet name
    {
        return this.name;
    }

    public String getAnimal() //Returns pet animal type
    {
        return this.animal;
    }

    public int getAge() //Returns pet age
    {
        return this.age;
    }
}
