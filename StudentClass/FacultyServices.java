public class FacultyServices extends School{
    private String phno;
    private int sal;

    // Getters
    public String getPhno(){
        return this.phno;
    }

    public int getSal(){
        return this.sal;
    }

    //Setters
    public void setPhno(String phno){
        this.phno=phno;
    }

    public void setSal(int sal){
        this.sal=sal;
    }

    FacultyServices(){
        this("0000",999);
    }
    FacultyServices(String phno, int sal){
        this.phno=phno;
        this.sal=sal;
    }

    @Override
    public String toString() {
        return super.toString()+("FacultyServices [phno=" + phno + ", sal=" + sal + "]");
    }

    
    
}
