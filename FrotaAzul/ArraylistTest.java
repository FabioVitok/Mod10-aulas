import java.util.ArrayList;
public class ArraylistTest
{
    public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    String carAtPosition2 = cars.get(2);
    
    cars.add(2, "Citroen");
    System.out.println(cars);
    boolean has = cars.contains("Ford");
    System.out.println(has);
  }
}

