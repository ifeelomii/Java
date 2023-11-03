import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String phno;
    private String dept;
    private String desg;
    private LocalDate doj;

    
    public Employee() {
        
    }

    public Employee(int id, String name, String phno, String dept, String desg, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.dept = dept;
        this.desg = desg;
        this.doj = doj;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhno() {
        return phno;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
    public LocalDate getDoj() {
        return doj;
    }
    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", dept=" + dept + ", desg=" + desg
                + ", doj=" + doj + "]";
    }

    
    
}
