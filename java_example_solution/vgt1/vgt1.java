
/**
 * Write a description of class vgt1 here.
 * 
 * @author Korben Kirscht 
 * @version 20150723.1
 */

import java.util.ArrayList;     //imported arraylist class
public class vgt1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class vgt1
     */
    public static void main(String[] args)
    {        
        String [] students = {
                // Index, First Name, Last Name, email, age, test score, test score, test score
                "1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,Caree,Youngman,cclaunc@wgu.edu,24,99,99,99"};

        Student.loadStudents( students );
        Student.createRoster();

        Student.print_all();
        Student.print_invalid_emails();
        Student.print_average_grade( );
        Roster.remove( "3" );
        Roster.remove( "3" );
        
    }
}
