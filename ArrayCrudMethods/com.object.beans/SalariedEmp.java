import java.time.LocalDate;

public class SalariedEmp extends Employee {

  private double sal;
  private double bonus;

  SalariedEmp() {
    super();
  }

  SalariedEmp(
    int id,
    String name,
    String phno,
    String desg,
    String dept,
    LocalDate doj,
    double sal,
    double bonus
  ) {
    super(id, name, phno, dept, desg, doj);
    this.sal = sal;
    this.bonus = bonus;
  }

  public double getSal() {
    return sal;
  }

  public double getBonus() {
    return bonus;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public String toString() {
    return "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
  }
}
