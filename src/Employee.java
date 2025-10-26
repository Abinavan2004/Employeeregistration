public class Employee {
    private int id;
    private String name;
    private String email;

    public Employee(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    public void displayDetails(){
        System.out.println("Employee Details ");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("email : "+email);
    }
}
