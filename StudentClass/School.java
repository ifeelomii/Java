class School {

  private int id;
  private String name;

  public int getID() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setID(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  School() {
    this.id = 0;
    this.name = "user";
  }

  School(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "School [ id=" + id + ", name=" + name + " ] ";
  }

  public static void main(String[] args) {
    School obj1 = new School();
    System.out.println(obj1);
    School obj2 = new StudentServices();
    System.out.println(obj2);
    School obj3 = new FacultyServices();
    System.out.println(obj3);

  }
}
