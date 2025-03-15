package com.onlyflan.onlyflan_api.dao;

import com.onlyflan.onlyflan_api.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

}
