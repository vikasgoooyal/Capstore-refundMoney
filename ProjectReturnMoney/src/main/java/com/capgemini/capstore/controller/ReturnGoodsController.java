package com.capgemini.capstore.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.dao.IReturnDao;
import com.capgemini.capstore.service.IReturnMoneySerImpl;
import com.capgemini.capstore.service.IReturnService;


@Controller
public class ReturnGoodsController {
	
	@Autowired
	private IReturnMoneySerImpl priceRet;
	
	
	@RequestMapping(value="/")
	public String refundMoneyFunc()
	{
		priceRet.refundMoney("P1002");
		return "Returned";
	}


} 