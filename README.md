# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
class Student/*Class name*/{
  private String name;/*String instance variable called Name*/
  private int rollNo;/*Integer instance variable called rollNo*/

  Student(String s, int r)/*Student constructor with parameters 's' and 'r'*/
  {
    name = s;/*Instance variables are set here through the constructors--*/
    rollNo = r;/*--parameters. But are assigned actual values when a new object is created.*/
  }

  void methodForDisplay()/*Instance method of class Student*/
  {
    System.out.println(name+"'s Roll No: "+rollNo);
  }

  public static void main(String[] args) {
    Student obj1=new Student("Rambo",21);/*New student object created*/
    obj1.methodForDisplay();
  }
}
```

## Part 2 - Public VS Static
* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

//Static methods are methods whose process will not change when an object is created. So it can be called without the chance of getting different types of results when called multiple times. Public methods have a chance of changing due to instance changes, so an object must be created before the method can be used.

## Part 3 - Dogs
* View the image below, and from the image, construct a Java file **Dog** that mirrors the diagrammed class and the 3 dog objects.
![Dog Class](images/ClassVSObject.png)
* Your class should be named **Dog**
* You should have **private** instance variables/fields for all the data members.
* You should have a **constructor** that sets the initial state of the data members via passed parameters.
    * Think about what data-types the fields and parameters will need!!!
* You should have 4 instance methods for eat, run, sleep, and name
* You should have a **main** method that creates the 3 Dog objects in the diagram.
* Make at least 2 of your methods functional (i.e. perform some action)!!!
    * For Example: method eat might take a class parameter named **Food** (i.e. another class) that has a field **weight**, and your eat method might reduce the weight in **Food**.

## Part 4 - Turn-In
* Commit your code and push it back to your account.
* Create a Pull request as you have been doing for all assignments.
* Paste the Pull request URL back into the Canvass assignment page for credit.