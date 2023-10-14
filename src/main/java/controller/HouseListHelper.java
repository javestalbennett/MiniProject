package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.HouseList;


/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 14, 2023
 */
public class HouseListHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("HouseList");
	
	public void insertItem(HouseList hl) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(hl);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<HouseList> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<HouseList> allItems = em.createQuery("SELECT i FROM HouseList i").getResultList();
		return allItems;
	}
	
	public void deleteItem(HouseList toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HouseList> typedQuery = em.createQuery("select hl from HouseList hl where hl.address = :selectedAddress and hl.city = :selectedCity", HouseList.class);
		
		//Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedAddress", toDelete.getAddress());
		typedQuery.setParameter("selectedCity", toDelete.getCity());
		
		//we only want one result
		typedQuery.setMaxResults(1);
		
		//get the result and save it into a new list item
		HouseList result = typedQuery.getSingleResult();
		
		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public HouseList searchForItemById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		HouseList found = em.find(HouseList.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(HouseList toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<HouseList> searchForItemByAddress(String addressString) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HouseList> typedQuery = em.createQuery("select hl from HouseList hl where hl.address = :selectedAddress", HouseList.class);
		typedQuery.setParameter("selectedAddress", addressString);
		List<HouseList> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<HouseList> searchForItemByCity(String cityName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<HouseList> typedQuery = em.createQuery("select hl from HouseList hl where hl.city = :selectedCity", HouseList.class);
		typedQuery.setParameter("selectedCity", cityName);
		List<HouseList> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;

	}
	
	public void cleanUp(){
		emfactory.close();
		}
}
