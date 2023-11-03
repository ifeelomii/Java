import java.time.LocalDate;

public class Vendor extends Employee{
    private int lb;
    private int amt;    

    Vendor(){
        super();
    }

    Vendor(int id,String name,String phno,String desg,String dept,LocalDate ldt,int lb,int amt){
        super(id, name, phno, dept, desg, ldt);
        this.lb=lb;
        this.amt=amt;
    }

    public int getLb() {
        return lb;
    }

    public void setLb(int lb) {
        this.lb = lb;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "Vendor [lb=" + lb + ", amt=" + amt + "]";
    }

}
