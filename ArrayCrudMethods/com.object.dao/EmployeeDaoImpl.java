import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    static List<Employee> elist;
    static{
        elist = new ArrayList<>();
        
        elist.add(new SalariedEmp(101, "Omkar", "9561466648", "Panel Members", "CEO", LocalDate.of(2023, 10, 6), 100000, 50000));

        elist.add(new SalariedEmp(102, "Anurag", "9156628812", "Panel Members", "VC", LocalDate.of(2023, 06, 04), 100000, 25000));

 		elist.add(new ContractEmp(201,"Nilesh","8605660627","HR","HR",LocalDate.of(2023, 02, 17),50, 100));

 		elist.add(new ContractEmp(202,"Ashish","9752465630","Team Lead","Team",LocalDate.of(2023, 11, 01),40, 90));

 		elist.add(new Vendor(301,"Harsh","9876543210","Tea Vendor","Vendor",LocalDate.of(2023, 10, 10),10, 50));
    }

    @Override
    public void save(Employee e){
        elist.add(e);
    }

    @Override
    public boolean removeById(int did) {
        return true;
    }
    
}
