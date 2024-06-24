package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walmart.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

}