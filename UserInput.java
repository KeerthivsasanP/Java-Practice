import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            Float salary = in.nextFloat();
            char gender = in.next().charAt(0);
            System.out.println(name+String.valueOf(salary)+" "+gender);
            in.close();
    }
}
