
/**
 * Write a description of class Roster here.
 * 
 * @author Korben Kirscht
 * @version 20150723.1
 */

import java.util.ArrayList;     //imported arraylist class
import java.util.Arrays;


public class Roster
{
    // instance variables - replace the example below with your own
    private int x;
    private String studentID;
    private String firstname;
    private String lastname;
    private String emailaddress;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    
    private static  ArrayList<Roster> list = new ArrayList<Roster>();

    /**
     * Constructor for objects of class Roster
     */
    public Roster(String studentID, String firstname, String lastname,
                  String emailaddress, int age, int grade1, int grade2, int grade3)
    {
        // initialise instance variables
        this.studentID = studentID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.age = age;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

   public static void add(String studentID, String firstname, String lastname,
                          String emailaddress, int age, int grade1, int grade2, int grade3)
   {    
      list.add( new Roster( studentID, firstname, lastname, emailaddress, age,
                            grade1, grade2, grade3) );       
   }
   
   public static void remove(String studentID)
   {
       int found = 0;
       
       for ( int i = 0 ; i < list.size() ; i++)
       {
           Roster item = list.get(i);
           if ( item.getstudentID().equals("3") )
           {
              //System.out.printf("remove %s\n", item.getstudentID());
              list.remove(i);
              found = 1;
              break;
           }
       }
       if ( found == 0)
       {
           System.out.printf("Error removing ID %s, does not exist\n", studentID);
        }
   }
   
   private String getstudentID()
   {
      return this.studentID;
   }

}
