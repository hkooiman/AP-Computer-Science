
public class Student
{
    // Write 4 instance variables]
    private String name = "";
    private String grade = "";
    private String email = "";
    private String gender = "";

    // Write a constructor with 4 parameters to initialize all of the instance
    // variables
    public Student(String sname, String sgrade, String semail, String sgender)
    {
        name = sname;
        grade = sgrade;
        email = semail;
        gender = sgender;
    }

    

    // Write a print method that prints all the instance variables
    public void print() 
    {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }

    // main method
    public static void main(String[] args)
    {
        // Construct 2 Student objects using the constructor with different values
        Student student1 = new Student("Hannah Kooiman", "12", "hkooiman25@bfacademy.de", "F");
        Student student2 = new Student("Micah Yakubu", "12", "mYakubu25@bfacademy.de", "M");
        student1.print();
        student2.print();

        // call their print() methods

    }


}



