package com.capgemini.capstore.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.Orders;
import com.capgemini.capstore.dao.IReturnDao;


@Service("service")
public class IReturnMoneySerImpl implements IReturnService {


	@Autowired
	public IReturnDao returnDao;
	
	public IReturnDao getReturnDao() {
		return returnDao;
	}

	public void setReturnDao(IReturnDao returnDao) {
		this.returnDao = returnDao;
	}
	
	@Override
	public double refundMoney(String product_id) {
		return returnDao.refundMoney(product_id);
	}

	

	
	

	
}


	
