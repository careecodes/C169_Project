# C169

This is my project for C169 at WGU, Intro to Java

Not accepting PRs or contributions, just storing on Github for ease of access and version control...

---

## Student Roster

**Competencies:**

**4016.1.1: Introduction to Java Programming** The graduate defines programming languages, identifies common algorithms, and identifies the parts of the Java Programming Environment.

**4016.1.2: ObjectOriented Concepts** The graduate understands the objectoriented programming paradigm and identifies its elements.

**4016.1.3: Variables and Data Types** The graduate declares, initializes, and assigns values to a variable and differentiates between primitive and object data types.

**4016.1.4: Control Structures** The graduate utilizes decision and loop constructs to control the flow of a program. 

---
**Scenario:**

For this assessment, you will write a program containing two classes named student and roster, respectively. The program will maintain a current roster of students within a given course.  Student data for the program includes student ID, first name, last name, email address, age, and array of grades. The program you create will read a list of five students, with one of the students being yourself, and use the series of method calls below (see part B3 below). A welldesigned program would use the principles of encapsulation and information hiding. 

Here is the data that will be used from within the main method of your program:

|Student ID | First Name | Last Name |Email | Age | Grades|
|-----|----------|----------|--------------------|------:|:----------:|
|  1  |John      |Smith     |John1989@gmail.com  |  20  |88, 79, 59|
|  2  |Suzan     |Erickson  |Erickson_1990@gmailcom| 19 |91, 72, 85|
|  3  |Jack      |Napoli    |The_lawyer99yahoo.com| 19  |85, 84, 87|
|  4  |Erin      |Black     |Erin.black@comcast.net| 22 |91, 98, 82|
|  5  |Your first name|Your last name |Your valid email address |Your age|3 test scores|


**The data should be input as follows:**

```
JAVA:
String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
              "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
              "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
              "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
              "5,your-firstname,your-lastname,your-emailaddress,your-age,your-3testscores"};

Python:              
students = [[1,"John","Smith","John1989@gmail.com",20,[88,79,59]],
            [2,"Suzan","Erickson","Erickson_1990@gmailcom",19,[91,72,85]],
            [3,"Jack","Napoli","The_lawyer99yahoo.com",19,[85,84,87]],
            [4,"Erin","Black","Erin.black@comcast.net",22,[91,98,82]],
            [5,"your-firstname","your-lastname,your-emailaddress",99,[99,99,99]]]
            
Replacing the last record with your own information.
```

**Requirements:**


A. Include your personal information in the last item of the table above.


B. Create a program that converts the array of Strings shown above to an ArrayList of Student
objects. For the Student object class, do the following.


  1. Include the following instance variables that describe each student:
    + student ID 
    + first name
    + last name
    + emailaddress
    + age
    + array of grades

  
  2. Include the following methods in the Student class:  
      a. an accessor (i.e., getter) for each instance variable from part B1  
      b. a mutator (i.e., setter) for each instance variable from part B1  
      **Note:** All access and change to the instance variables of the Student class should be through accessor and mutator methods.  
      c. constructor using all of the input parameters  
      d. print() to print specific student data (e.g., student ID, first name, last name) using accessors (i.e., getters)  
      Note: Printing out the grades is optional, not required.
      
  3. Create a student Roster class with the following methods:  
      a. An Add method that that sets the instance variables from part B1 and updates the roster  

      + JAVA Using all ArrayList method calls -  
        
      ***public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)***  
      
      + Python using a List student records (List).  Depending on where the list is maintained.  In MAIN or in the class.   
      
      ***def add(cls, student_id, firstname, lastname, email_address, grades):***  
      
    b. A Remove method that removes students from the roster by student ID.  
      
      + JAVA - ***public static void remove(String studentID)***   
      + Python - ***def remove(student_id):*** 
      
      Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found.  
      
    c. A print_all method that prints a complete tab separated list of student data using accessor methods.  
      Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}. The print_all() method should loop through all the students in the student array list and call the print() method for each student.  
        
      + JAVA Method - ***public static void print_all()***  
      + Python Method - ***def print_all():***  
      
    d. A print_average_grade that correctly prints a student’s average grade by student ID  
      + JAVA - ***public static void print_average_grade(String studentID)*** 
      + Python - ***def print_average_grade(student_id)***  
      
    e. A print_invalid_emails  that verifies student email addresses and displays all invalid email addresses to the user  
      + JAVA - ***public static void print_invalid_emails()***  
      + Python - ***def print_invalid_emails()***  
      
      Note: A valid email should include an at sign (“@”) and period (“.”) and doesn’t include a space.  
      
C. Demonstrate the program’s required functionality by running the following scenario:  

    print_all();
    print_invalid_emails();
    //loop through the ArrayList and for each element:
    print_average_grade(current_loop_student);
    remove("3");
    remove("3");
    //expected: this should print a message saying such a student with this ID was not found.
 
