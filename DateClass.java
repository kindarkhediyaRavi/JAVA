import java.time.LocalDate; 
import java.time.LocalTime; 
import java.time.Year; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateClass   {
  public static void main(String[] args) {

    LocalDate myObj = LocalDate.now(); 
    System.out.println("Current Date is " + myObj); 

    LocalTime tm =  LocalTime.now();
    System.out.println("Local Time is " + tm);

    Year y =  Year.now();
    System.out.println("Current Year is " + y);

    LocalDateTime ldt =  LocalDateTime.now();
    System.out.println("Current Date and Time " + ldt);

    DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
    String formatedDate = ldt.format(myFormatter);
    System.out.println("My Formate is " + formatedDate);


  }
}