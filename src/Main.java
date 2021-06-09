//136509 Muthoka Trevor Ndinda ICS B
import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {

        String Name1,Name2,Type1,Type2;
        int yom1,yom2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First name:");
        Name1=input.toString();
        Watch watch1=new Watch();
        watch1.Watch(Name1);
        watch1.setType("Analogue");
        watch1.setYom(2013);
        watch1.getName();
        watch1.getType();
        watch1.getAge();
        watch1.showDetails();

        System.out.println("Enter the second name: ");
        Name2=input.nextLine();
        System.out.println("Enter the type of watch: ");
        Type2= input.nextLine();
        System.out.println("Enter the Year of Manufacturing: ");
        yom2= input.nextInt();
        Watch watch2=new Watch();
        watch2.Watch(Name2,Type2,yom2);
        watch2.getName();
        watch2.getType();
        watch2.getAge();
        watch2.showDetails();

    }
}
