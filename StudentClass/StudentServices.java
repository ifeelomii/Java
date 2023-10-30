public class StudentServices extends School {

  //Data Member Decleration
  private int prnno;
  private int marr;

  //Getter Methods
  
  public int getRno() {
    return this.prnno;
  }

  public int getMarr() {
    return this.marr;
  }

  //Setter Methods
  
  public void setRno(int prnno) {
    this.prnno = prnno;
  }

  public void setMarr(int marr) {
    this.marr = marr;
  }

  //Default Constructor
  public StudentServices() {
    prnno = 0;
    marr = 0;
  }

  //Parameterised Constructor
  public StudentServices(int rno, int marr) {
    this.prnno = rno;
    this.marr = marr;
  }

  public String toString()
  {
    return super.toString()+("StudentServices [Roll no: "+ prnno + ", Marks: "+ marr+" ]");
  }
}
