import java.util.Scanner;

public class EmployeeRegistration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmailValidator validator= new  EmailValidator();
        System.out.print("enter Employee ID : ");
        int id= scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter employee name : ");
        String name= scanner.nextLine();
        System.out.print("enter employee email : ");
        String email= scanner.nextLine();

        scanner.close();

        if(validator.isValidEmail(email)){
            if(validator.isCompanyMail(email)){
                Employee employee=new Employee(id,name,email);
                employee.displayDetails();
            }else{
                System.out.println("this need to be valid company email");
            }

        }else{
            System.out.println("invalid email");
        }
    }
}
