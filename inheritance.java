import java.util.Scanner;

class student
{
    Scanner sc = new Scanner(System.in);
    String studentname;
    int rollno;
    public void getStudent()
    {
        System.out.println("Enter Student name : ");
        studentname = sc.nextLine();
    }
    void dispStudent()
    {
        System.out.println("Student name is " + studentname);
    }
};
class teacher extends student
{
    String teacherName;
    int id;
    Scanner sc = new Scanner(System.in);
    public void getTeacher()
    {
        // getStudent();
        System.out.println("Enter Teacher name : ");
        teacherName = sc.nextLine();
        
    }
    public void dispTeacher()
    {
        // dispStudent();
        System.out.println("Teacher name is " + teacherName);
    }
};

class principal extends teacher 
{
    String principalName;
    Scanner sc = new Scanner(System.in);
    public void getPrincipal()
    {
        getStudent();
        getTeacher();
        System.out.println("Enter Principal name : ");
        principalName = sc.nextLine();
    }
    public void dispPrincipal()
    {
        dispStudent();
        dispTeacher();
        System.out.println("Principal name is " + principalName);
    }
}
public class inheritance {
    public static void main(String[] args) {
        principal p = new principal();
        p.getPrincipal(); 
        System.out.println("***********************");       
        p.dispPrincipal();
    }
}
