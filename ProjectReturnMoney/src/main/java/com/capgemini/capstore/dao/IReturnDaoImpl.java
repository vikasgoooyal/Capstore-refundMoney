package com.capgemini.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.Order;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Orders;
import com.capgemini.capstore.beans.Product;


@Transactional
@Repository("repo")
public class IReturnDaoImpl implements IReturnDao{

	@PersistenceContext
	EntityManager entityManager;


 public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public IReturnDaoImpl() {
		super();
		
	}

	
	public double refundMoney(String product_id) {
	//	System.out.println(product_id);
	
		
		String orderId = (String) entityManager.createNativeQuery("select p.order_id from orders_product p where p.prod_id=:product_id").setParameter("product_id", product_id).getSingleResult();
		//System.out.println(orderId);
		Product product=entityManager.find(Product.class, product_id);
		double price=product.getPrice();
		//System.out.println(price);
		
		Orders order = entityManager.find(Orders.class, orderId);
		long AccNumber = order.getPayment_acc_no();
		
		String status = order.getOrderStatus();

	//	String orStatus = (String) entityManager.createNativeQuery("select p.status from Orders p where p.order_id =: orderId").setParameter("", value)
		
	//	System.out.println(AccNumber);
		
		if(status.equalsIgnoreCase("Returned"))
		{
		System.out.println(price + " has been credited to "+ AccNumber+" for oredr id" + orderId);
		
		
		product.setAvailable_quantity(product.getAvailable_quantity()+1);
		}
		else
		{
			System.out.println("you are not eligible for return");
		}
		return 0;
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		
		
		
		
		Product prod=new Product();
		Orders order=new Orders();
		Query prod1= entityManager.createQuery("Select o.prod_id from orders_product o where o.order_id=:oid").setParameter("oid", order_id);
		Object pidf=prod1.getSingleResult();
		
          String or1=order.getOrderStatus();
          if(or1.equals("returned"))
          {
        	  if(order.getPaymentOptions().equals("NETBANKING")) {
           	  prod.getPrice();
           	  
        	  }
        	  
          }
          double price=prod.getPrice();
          orders.getOrder_id();
           String payment=order.getPaymentOptions();
       
		
		//Orders o1= new Orders();
		//String ostatus=o1.getOrderStatus();
		System.out.println(" find");
		Query oid =entityManager.createNativeQuery("SELECT o.ORDER_ID from ORDERS o where o.STATUS='Returned'");
		//String ostatus = (String) entityManager.createNativeQuery("Select status from orders where order_id := oid ").getSingleResult();
		
		String orderId=oid;
		
		
		
		
			System.out.println(orderId+"ddddddddddddddddddddddd");
		System.out.println("before find");
			
		
			String prodId = (String) entityManager.createNativeQuery("select prod_id from orders_product  where order_id =:oid").setParameter("oid",order_id).getSingleResult();
			double price = (double) entityManager.createQuery("select p.price from Product p where p.prod_id =:prodId").setParameter("prodId", prodId).getSingleResult();
			
			return price;
			
			
			
			
			Query prod1= entityManager.createQuery("Select p from Product p where p.order_id=:oid").setParameter("oid", order_id);
			Query 
			Object pidf=prod1.getSingleResult();
			
			
		
		
		
		
	
		}

*/
	

	

}


