public interface EmployeeDao {
    
    void save(Employee e);

    boolean removeById(int did);
}
