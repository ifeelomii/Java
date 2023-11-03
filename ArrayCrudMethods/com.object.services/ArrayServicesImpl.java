import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ArrayServicesImpl implements ArrayServices {
    EmployeeDao edao;
    public void EmployeeServiceImpl() {
	edao=new EmployeeDaoImpl();
	}

    /*  Adding New Employee  */
    @Override
    public void addNewEmployee(int ch){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        String name = sc.nextLine();
        System.out.println("Enter Employee Phone number");
        String phno = sc.nextLine();
        System.out.println("Enter Employee Desg");
        String desg = sc.nextLine();
        System.out.println("Enter Employee Dept");
        String dept = sc.nextLine();
        System.out.println("Enter Employee DOJ");
        String doj = sc.nextLine();
        LocalDate ldt=LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Employee e =null;
        if(ch==1){
            System.out.println("Enter Salary");
            double sal = sc.nextDouble();
            System.out.println("Enter Bonus");
            double bonus = sc.nextDouble();
            e = new SalariedEmp(id,name,phno,desg,dept,ldt,sal,bonus);
        }
        else if (ch==2) {
            System.out.println("Enter no of hours");
            int hrs = sc.nextInt();
            System.out.println("Enter rate per hour");
            int rate = sc.nextInt();
            e = new ContractEmp(id,name,phno,desg,dept,ldt,hrs,rate);
        }
        else if (ch==3){
            System.out.println("Enter no of labours");
            int lb = sc.nextInt();
            System.out.println("Enter total amount");
            int amt = sc.nextInt();
            e = new Vendor(id,name,phno,desg,dept,ldt,lb,amt);
        }
        else
        System.out.println("Invalid choice: ");        

        edao.save(e);
    }

    /* Delete Employee By ID */
    @Override
    public boolean deleteById(int did){
        return edao.removeById(did);
    }
}
