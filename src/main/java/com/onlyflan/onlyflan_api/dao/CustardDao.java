package com.onlyflan.onlyflan_api.dao;

import com.onlyflan.onlyflan_api.models.Custard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustardDao extends JpaRepository<Custard, Long> {

    Optional<Custard> findByName(String name);
}
