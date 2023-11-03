import java.time.LocalDate;

public class ContractEmp extends Employee {
    private int hrs;
    private int rate;


    public ContractEmp() {
        super();
    }


    public ContractEmp(int id,String name,String phno,String desg,String dept,LocalDate ldt,int hrs, int rate) {
        super(id,name,phno,desg,dept,ldt);
        this.hrs = hrs;
        this.rate = rate;
    }


    public int getHrs() {
        return hrs;
    }


    public void setHrs(int hrs) {
        this.hrs = hrs;
    }


    public int getRate() {
        return rate;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "ContractEmp [hrs=" + hrs + ", rate=" + rate + "]";
    }
    
}
