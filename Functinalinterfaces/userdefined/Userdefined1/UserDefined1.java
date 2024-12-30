package Functinalinterfaces.userdefined.Userdefined1;

// ---------------------- User Defined Interfaces Example ----------------------

//Defining the operation Interface(user defined)
@FunctionalInterface
interface Operation {
    int perform(int a,int b);
}

//Defining another user-defined Functional Interface Greeting!!
@FunctionalInterface
interface Greeting{
    void greet(String name,int age);
}



// Tester Class
public class UserDefined1
{
    public static void main(String[] args) {
      //Lambda expression for the user defined interface operation  
    Operation operator=(a,b)->{
        if(a>0 && b>0)
        {
            return (a*a)+(b*b);
        }
        else 
        {
            return a+b;
        }
    };
    //testing the operation interface
    System.out.println("Result of operation: "+operator.perform(5, 6));

    Greeting greeting = (name, age) -> {
        if (age >= 18) {
            System.out.println("Hello " + name + " You are an adult.!!!!");
        } else if (name.length() > 5 && age < 18) {
            System.out.println("Hello " + name + " You have a long name! and You are not an adult yet.!!");
        } else {
            System.out.println("Hello " + name + " Nice to meet you.!!! You have a long way to go");
        }
    };
    //testing greeting interface
    greeting.greet("Pratyush", 23);
    }
}