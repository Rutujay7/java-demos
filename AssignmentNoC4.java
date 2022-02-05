import java.util.Random;
public class AssignmentNoC4 {
public static void main(String[] args) {
 
  int max = 100;
  int min = 1;

  Random randomNum = new Random();
  int showMe1 = min + randomNum.nextInt(max);
  System.out.println(showMe1);
  
  int showMe2 = min + randomNum.nextInt(max-2);
  System.out.println(showMe2);
  
  int showMe3 = min + randomNum.nextInt(max-3);
  System.out.println(showMe3);
 
  int showMe4 = min + randomNum.nextInt(max-4);
  System.out.println(showMe4);
}
}