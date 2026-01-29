package ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Entity.Employee;


public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee emp = new Employee();
		emp.setEid(101);
		emp.setName("Amaan");
		emp.setEmail("Amaan@gmail.com");
		emp.setSalary(7000);

		et.begin();
		em.persist(emp);
		et.commit();

		System.out.println("saved");

	}
}
