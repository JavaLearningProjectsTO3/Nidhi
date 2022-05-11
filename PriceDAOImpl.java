package one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PriceDAOImpl implements PriceDAO {

	EntityManager entityManager;
	
	public PriceDAOImpl() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();
	}
	
	@Override
	public List<Price> findAllPrice() {
		// TODO Auto-generated method stub
		TypedQuery<Price> query = entityManager.createQuery("from Price",Price.class);
		return query.getResultList();
	}
	
	//
	//Test Class for PriceDAOImpl begins here...............please find below
	/*public void loadAllPriceTest() {
		List<Price> priceList = priceDAO.findAllPrice();
		
		for (Price price : priceList) 
	
		{
			System.out.println(price.getProductId()+
					" "+price.getProductStdPrice()+
					" "+price.getProductMinPrice()+
					" "+price.getProductStartDate()+
					" "+price.getProductEndDate());
			System.out.println("####################################");
			
			List<Product> prodList = Price.getProductId();
			
			for (Product prod : prodList) 
				
			{
				System.out.println("Product ID          : "+prod.getProductId());
				System.out.println("Product Description : "+prod.getProductDescription());
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	
			} 
	*/
}
