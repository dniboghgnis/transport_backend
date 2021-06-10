package com.transport.transportApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.transportApp.model.Bill;
import com.transport.transportApp.repository.BillRepository;

@Service
public class BillService {
	
	@Autowired
	private BillRepository billRepository;
	
	public void add(Bill bill) {
		billRepository.save(bill);
	}

	public void updateBill(Bill bill) {
		billRepository.save(bill);
	}
	
	public void deleteBill(int id) {
		billRepository.deleteById(id);
	}
	
	public Bill findById(int id) {
		return billRepository.getOne(id);
	}
	
	public List<Bill> showAllBill(){
		
		return billRepository.findAll();
	}
}
