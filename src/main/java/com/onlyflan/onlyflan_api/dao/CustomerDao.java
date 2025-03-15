package com.onlyflan.onlyflan_api.dao;

import com.onlyflan.onlyflan_api.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

}