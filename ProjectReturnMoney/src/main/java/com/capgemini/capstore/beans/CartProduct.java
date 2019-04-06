package com.capgemini.capstore.beans;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "mycartproduct")
public class CartProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CartProductId;
	@OneToOne
	private Product product;
	private int Quantity;
	@ManyToOne
	private Cart mycart;
	public CartProduct(int cartProductId, Product product, int quantity) {
		super();
		CartProductId = cartProductId;
		this.product = product;
		Quantity = quantity;
	}
	public CartProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCartProductId() {
		return CartProductId;
	}
	public void setCartProductId(int cartProductId) {
		CartProductId = cartProductId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartProduct [CartProductId=" + CartProductId + ", product=" + product + ", Quantity=" + Quantity + "]";
	}
	
	
	
	

}
