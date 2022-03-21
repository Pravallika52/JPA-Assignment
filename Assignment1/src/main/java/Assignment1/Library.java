/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment1;
import com.Student;
import com.Ticket;
import com.Employee;
import com.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Library {
    EntityManager entityManager;
    
    public Library() {
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("StudentPU");
    	entityManager=factory.createEntityManager();
    }
    public void saveStudent(Student student) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(student);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public void saveTicket(Ticket ticket) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(ticket);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public void saveEmployee(Employee employee) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(employee);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public void savePerson(Person person) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(person);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public static void main(String[] args) {
    	Student student=new Student();
    	student.setStudentName("peter");
    	student.setMarks(500);
    	student.setSemester(2);
    	Ticket ticket=new Ticket();
    	ticket.setSource("Vizag");
    	ticket.setDestination("Srikakulam");
    	ticket.setPrice(250);
    	ticket.setDate("02-04-2022");
    	Employee employee=new Employee();
    	employee.setEmployeeName("Peter");
    	employee.setEmployeeDepartment("HR");
    	employee.setEmployeeDesignation("Manager");
    	Person person=new Person();
    	person.setPersonName("Peter");
    	person.setPersonPhone("9878655482");
    	person.setPersonEmail("peterabc@gmail.com");
    	Library lib=new Library();
    	lib.saveStudent(student);
    	lib.saveTicket(ticket);
    	lib.saveEmployee(employee);
    	lib.savePerson(person);

    }
}
