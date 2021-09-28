import java.lang.reflect.Constructor;
import java.util.*;
public class Poised {
    // Main method
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // Ask user to input details of project
        // inputs the details in project
        System.out.print("Please enter the Project number : " );
        int projectNum = input.nextInt();
        System.out.print("Project Name : ");
        String projectName = input.next();
        System.out.print("Building Type : ");
        String buildingType = input.next();
        System.out.print("Project Address : ");
        String projectAddress = input.next();
        System.out.print("ERF Number : ");
        int erfNum = input.nextInt();
        System.out.print("Total Fee : ");
        int totalFee = input.nextInt();
        System.out.print("Amount Paid to Date : ");
        int paidToDate = input.nextInt();
        System.out.print("Due Date : ");
        int dueDate = input.nextInt();
        System.out.print("Architect : ");
        String architect = input.next();
        System.out.print(" Contractor : ");
        String contractor = input.next();
        System.out.print("Customer : ");
        String customer = input.next();

        // Call the project and print out the details
        project v1 = new project(projectNum, projectName, buildingType, projectAddress, erfNum, totalFee, paidToDate, dueDate, architect, contractor, customer);
        System.out.println(v1.toString());

        // Ask user to input details of architect
        // inputs the details in architect
        System.out.print("Please enter the Architect's Name : " );
        String name = input.next();
        System.out.print("Architect's Telephone number : ");
        int telephoneNum = input.nextInt();
        System.out.print("Architect's Email Address : ");
        String emailAddress = input.next();
        System.out.print("Architect's Postal Address : ");
        String postAddress = input.next();

        // Call the class architect and print out the details
        architect a1 = new architect(name, telephoneNum, emailAddress, postAddress);
        System.out.println(a1.toString());

        // Ask user to input details of the contractor
        // Inputs the details in the class contractor
        System.out.print("Please enter the Contractor's Name : " );
        String nameCon = input.next();
        System.out.print("Contractor's Telephone number : ");
        int telephoneNumCon = input.nextInt();
        System.out.print("Contractor's Email Address : ");
        String emailAddressCon = input.next();
        System.out.print("Contractor's Postal Address : ");
        String postAddressCon = input.next();

        // Call the class contractor and print out the details
        contractor c1 = new contractor(nameCon, telephoneNumCon, emailAddressCon, postAddressCon);
        System.out.println(c1.toString());

        // Ask user to input details of customer
        // Inputs the details in class customer
        System.out.print("Please enter the Customer's Name : " );
        String nameCus = input.next();
        System.out.print("Customer's Telephone number : ");
        int telephoneNumCus = input.nextInt();
        System.out.print("Customer's Email Address : ");
        String emailAddressCus = input.next();
        System.out.print("Customer's Postal Address : ");
        String postAddressCus = input.next();

        // Call the class customer and print out the details
        customer c2 = new customer(nameCus, telephoneNumCus, emailAddressCus, postAddressCus);
        System.out.println(c2.toString());
    }
}
