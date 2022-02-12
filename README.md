# Oppgave11.02

##Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.

 
Write the following methods (instance methods): <br>

 
Method named getFirstName without any parameters, it needs to return the value of the firstName field. <br>

 
Method named getLastName without any parameters, it needs to return the value of the lastName field. <br>

 
Method named getAge without any parameters, it needs to return the value of the age field. <br>

 
Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field. <br>

 
Method named setLastName with one parameter of type String, it needs to set the value of the lastName field. <br>

 
Method named setAge with one parameter of type int, it needs to set the value of the age field. <br>

If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0. <br><br>

 
Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false. <br>

 
Method named getFullName without any parameters, it needs to return the full name of the person. <br>

 
In case both firstName and lastName fields are empty, Strings return an empty String. <br>

 
In case lastName is an empty String, return firstName. <br>

 
In case firstName is an empty String, return lastName. <br>

 
To check if s String is empty, use the method isEmpty from the String class. <br><br>




Make constructor for the class Person <br>

The constructor should take 3 parameters, firstName, lastName and age <br>

Also make a constructor with no parameters that uses the other constructor and uses your name and age as default. <br>
