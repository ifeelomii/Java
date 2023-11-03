import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            ArrayServicesImpl obj = new ArrayServicesImpl();
            System.out.println("Enter \n 1. Add new Employee\n 2. delete employee by id\n 3. modify salary");
            System.out.print(" 4. Display all\n 5. display by id\n 6. sort by salary\n 7. sort by name\n 8.exit\n choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Salaried Employee\n 2.Contract Employee\n3. Vendor");
                    int ch=sc.nextInt();
                    obj.addNewEmployee(ch);

                    break;
                case 2:
                    System.out.println("Enter Id to delete");
                    int did = sc.nextInt();
                    boolean flag = obj.deleteById(did);
                    if(flag){
                        System.out.println("Deleted succesfully: ");
                    }
                    else{
                        System.out.println("Record not found");
                    }
                default:
                    break;
            }
        }while(choice!=8);
        sc.close();
    }
}