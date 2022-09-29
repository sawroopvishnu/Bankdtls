package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankdtlsEntity;
import com.example.demo.repository.BankdtlsRepository;

@Service
public class BankdtlsService {
	
	@Autowired
	 private BankdtlsRepository repo;
	
	 public void AddBank(BankdtlsEntity e) {
		 repo.save(e);
	 }

	 //create method 
	 public List<BankdtlsEntity> getAllbankdata()
	 {
		 return repo.findAll();
	 }


	public Optional<BankdtlsEntity> findById(Integer id) {
		// TODO Auto-generated method stub
		Optional<BankdtlsEntity> empid= repo.findById(id);
		return empid ;
	}

   // create method 


	 
}
