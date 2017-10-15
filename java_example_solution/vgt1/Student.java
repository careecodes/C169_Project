
/**
 * Write a description of class Student here.
 * 
 * Student class as defined by VGT1 project.
 * 
 * @author Korben Kirscht 
 * @version 20150723.1
 */

import java.util.ArrayList;     //imported arraylist class
import java.util.Arrays;        //import Arrays class

public class Student
{
    // instance variables - replace the example below with your own
    
    private String name;
    private int[] arrayofGrades;
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    
    private static  ArrayList<Student> list = new ArrayList<Student>();  // Student arraylist

    /**
     * Constructor for objects of class Student
     * 
     * B.  Create a program that converts the array of Strings shown above to an ArrayList of 
     * Student objects. For the Student object class, do the following.
     * 
     *   c.  constructor using all of the input parameters
     *   
     * 1.  Include the following instance variables that describe each student:
     *     •   student ID
     *     •   first name
     *     •   last name
     *     •   e­mail address
     *     •   age
     *     •   array of grades
     *     
     */
    public Student(String studentid, String firstname, String lastname, String emailaddress,
                   int age, int gr1, int gr2, int gr3)
    {
        // initialise instance variables

        this.studentID = studentid;
        this.firstName = firstname;
        this.lastName = lastname;
        this.emailAddress = emailaddress;
        this.age = age;
        this.arrayofGrades = new int[]{ gr1, gr2, gr3 };
    }
    
    
    /**
     * Instance accessor methods.
     * 
     *   a.  an accessor (i.e., getter) for each instance variable from part B1
     */
    
    /**
     * Accessor to get student name.
     * 
     * Parameters:  None
     */
    public String getname()
    {
        return this.firstName + ' ' + this.lastName;
    }

    /**
     * Accessor to get student ID.
     * 
     * Parameters:  None
     */    
    public String getStudentID()
    {
        return this.studentID;
    }

    /**
     * Accessor to get student first name.
     * 
     * Parameters:  None
     */    
    
    public String getfirstName()
    {
        return this.firstName;
    }

    /**
     * Accessor to get student last name.
     * 
     * Parameters:  None
     */    
    
    public String getlastName()
    {
        return this.lastName;
    }
    
    /**
     * Accessor to get student email address name.
     * 
     * Parameters:  None
     */    

    public String getemailAddress()
    {
        return this.emailAddress;
    }

    /**
     * Accessor to get student age name.
     * 
     * Parameters:  None
     */    

    public int getage()
    {
        return this.age;
    }

    /**
     * Accessor to get student single grade.
     * 
     * Parameters:  None
     */    
    
    public int getgrades( int element )
    {
       return this.arrayofGrades[element];
    }

    /**
     * Accessor to get student array of grades.
     * 
     * Parameters:  None
     */    
    
    public int[] getgrades()
    {
       return this.arrayofGrades;
    }

    /**
     * Accessor to get student string of grades.
     * 
     * Parameters:  None
     */    
    
    public String getgradestring()
    {
       return Arrays.toString(this.arrayofGrades);
    }
    
    
    
    
    
    /**
     * Instance mutator methods.
     * 
     *      b.  a mutator (i.e., setter) for each instance variable from part B1
     *      
     *      Note: All access and change to the instance variables of the Student class should be
     *      through accessor and mutator methods.
     */
    
    /**
     * Mutator to set student name.
     * 
     * Parameters:  None
     */
    public void setname( String firstname, String lastname )
    {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    /**
     * Mutator to set student ID name.
     * 
     * Parameters:  None
     */    
    public void setStudentID( String studentid )
    {
        this.studentID = studentid;
    }

    /**
     * Mutator to set student first name.
     * 
     * Parameters:  None
     */    
    
    public void setfirstName( String firstname )
    {
        this.firstName = firstname;
    }

    /**
     * Mutator to set student last name.
     * 
     * Parameters:  None
     */    
    
    public void setlastName( String lastname )
    {
        this.lastName = lastname;
    }
    
    /**
     * Mutator to set student email address.
     * 
     * Parameters:  None
     */    

    public void setemailAddress( String emailaddress )
    {
        this.emailAddress = emailaddress;
    }

    /**
     * Mutator to set student age name.
     * 
     * Parameters:  None
     */    

    public void setage( int age )
    {
        this.age = age;
    }

    /**
     * Mutator to set student single grade.
     * 
     * Parameters:  None
     */    
    
    public void setgrades( int element, int grade )
    {
       this.arrayofGrades[element] = grade ;
    }

    /**
     * Mutator to set student array of grades.
     * 
     * Parameters:  None
     */    
    
    public void setgrades( int[] srcarray )
    {
       System.arraycopy( srcarray, 0, this.arrayofGrades, 0, this.arrayofGrades.length );
    }

    /**
     * Mutator to set student string of grades.
     * 
     * Parameters:  None
     */    
    
    public void setgradestring(String grades)
    {
        String delimiter = ",";
        String[] gradelist = grades.split(delimiter);
        
        for( int i = 0 ; i < grades.length() ; i++)
        {
            this.arrayofGrades[i] = Integer.parseInt(gradelist[i]);
        }
        
    }
    
    
    
    /**
     *     d.  print() to print specific student data (e.g., student ID, first name, last name)
     *         using accessors (i.e., getters)
     *     
     *     Note: Printing out the grades is optional, not required.
     * 
     */

    public void print( String selection )
    {
       switch( selection ) {
           case "studentid":
                System.out.printf( "%s", this.getStudentID());
                break;
           case "firstname":
                System.out.printf( "%s", this.getfirstName());
                break;
           case "lastname":
                System.out.printf( "%s", this.getlastName());
                break; 
           case "email":
                System.out.printf( "%s", this.getemailAddress());
                break;  
          case "age":
                System.out.printf( "%d", this.getage());
                break;                
          case "grades":
                System.out.printf( "%d", this.getgradestring());
                break;                
          case "grade1":
                System.out.printf( "%d", this.getgrades( 0 ));
                break;
          case "grade2":
                System.out.printf( "%d", this.getgrades( 1 ));
                break;
          case "grade3":
                System.out.printf( "%d", this.getgrades( 2 ));
                break;  
          default:
                throw new IllegalArgumentException("print() - Invalid argument: " + selection);
            }   
     
    }    
    
    /**
     *     d.  print() to print specific student data (e.g., student ID, first name, last name)
     *         using accessors (i.e., getters)
     *     
     *     Note: Printing out the grades is optional, not required.
     * 
     */

    public void print()
    {
        System.out.printf("%s\tFirst Name: %s\tLastNAme: %s\tAge: %d\tGrades: %s\n",
                          this.getStudentID(), this.getfirstName(), this.getlastName(),
                          this.getage(), this.getgradestring());
    }    
    
   /** d.  public static void print_average_grade(String studentID) that correctly prints
    *      a student’s average grade by student ID
   */

   public static void print_average_grade(String studentID)
   {
       for(Student item : list)
       {
           if ( item.getStudentID() == studentID )
           {
               int count = 0;
               int total = 0;
               int [] grades = item.getgrades();
               for ( int i = 0 ; i < grades.length ; i++)
               {
                   count++;
                   total += grades[i];
               }
               if ( count == 0 )
               {
                   System.out.printf("Agerage - Student id %s not found\n", studentID);
               } else {
                  System.out.printf("Student: %s Grade Average: %d\n", studentID, total / count);
               }
        }
        
    }
   }

   /**
    * New form of print_average_grade that prints all students average grade.
    * 
    */
   public static void print_average_grade( )
   {
       for (Student item : list)
       {
           String studentID = item.getStudentID();
           print_average_grade(studentID);
        }
    }
   
   /**    e.  public static void print_invalid_emails() that verifies student e­mail addresses
    *         and displays all invalid e­mail addresses to the user
    *         
    *     Note: A valid e­mail should include an at sign (“@”) and period (“.”) and doesn’t include a
    *     space.
    */
   public static void print_invalid_emails()
   {
      for (Student item : list)
      {
          String teststring = item.getemailAddress();
          if ( (teststring.contains(" ")) || (! teststring.contains("@")) ||
               (! teststring.contains(".")) )
          {
             System.out.printf("Invalid email: %s\n", teststring);
          }
      }
   }
   

   /**
    * Method to load an array of student data into arraylist.
    * 
    * 
    * 
    */
 
    public static void loadStudents( String[] students )
    {
        String delimiter = ",";
        
        for(String a : students )
        {
           String[] student_info = a.split(delimiter);
           list.add( new Student( student_info[0], 
                                  student_info[1],
                                  student_info[2], 
                                  student_info[3], 
                                  Integer.parseInt(student_info[4]),
                                  Integer.parseInt(student_info[5]), 
                                  Integer.parseInt(student_info[6]), 
                                  Integer.parseInt(student_info[7]) ));
        }  
    }


    
    //public static void printStudents()
    //{
     //   for(Student item : list)
    //    {
    //       // System.out.printf("name: %s %s\n", item.getfirstName(), item.getlastName());
    //       //item.print("firstname");
    //       item.print("grade1");
    //    }    
    //}
    
     /**
     * c.  public static void print_all() that prints a complete tab­separated list of student
     *     data using accessor methods
     *     
     *     Note: Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith
     *     [tab] Age: 20 [tab] Grades: {88, 79, 59}. The print_all() method should loop through all
     *     the students in the student array list and call the print() method for each student.
     *     
     */   
    public static void print_all()
    {
        for(Student item : list)
        {
            item.print();
        }
    }
    

    public static void createRoster()
    {
       for (Student item : list)
       {
           Roster.add( item.getStudentID(), item.getfirstName(), item.getlastName(),
                       item.getemailAddress(), item.getage(),
                       item.getgrades( 0 ), item.getgrades( 1 ), item.getgrades( 2 ) );
       }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

}
