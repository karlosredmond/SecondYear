package Lab5;


//Abstract superclass Employee
public abstract class Employee {
private String firstName;
private String lastName;

public Employee( String fName, String lName )
{
   firstName = fName;
   lastName = lName;
}

// Return  a copy of the first name
public String getFirstName()
{ return new String(firstName);}

public String getLastName()
{ return new String(lastName); }

// Abstract method that must be implemented for each
// derived class of Employee from which objects
// are instantiated.

abstract double earnings();
}

