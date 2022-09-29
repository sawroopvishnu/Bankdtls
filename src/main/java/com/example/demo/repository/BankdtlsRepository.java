package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BankdtlsEntity;

@Repository
public interface BankdtlsRepository extends JpaRepository<BankdtlsEntity, Integer> {

}