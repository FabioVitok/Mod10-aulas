
public class Strings
{
public static void main (String[] args){
    String name = "Fabio Vitoriano";
    String country = "Portugal";
    int age = 17;
    String company = "Imoral";
    double gpa = 3.8;
    char percentSign = '%'; 
    boolean amITellingTheTruth = false;
 String formattedString = String.format(
"My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.",
name,country, age, company, gpa, percentSign, amITellingTheTruth);
System.out.println(formattedString);
    }
}

   
