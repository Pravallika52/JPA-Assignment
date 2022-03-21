/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment2;
import com.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Address;



public class Library {
	EntityManager entityManager;
    
    public Library() {
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("CustomerPU");
    	entityManager=factory.createEntityManager();
    }
    
    public void saveAddress(Address address) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(address);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public void saveCustomer(Customer customer) {
    	entityManager.getTransaction().begin();
    	entityManager.persist(customer);
    	entityManager.flush();
    	entityManager.getTransaction().commit();
    }
    public static void main(String[] args) {
    	Address address=new Address();
    	address.setCity("Vizag");
    	address.setState("AP");
    	Customer customer=new Customer();
    	customer.setCustomerName("Peter");
    	customer.setCustomerEmail("peterhvbsd@gmail.com");
    	customer.setCustomerAddress(address);
    	Library lib=new Library();
    	lib.saveAddress(address);
    	lib.saveCustomer(customer);


    }    
}