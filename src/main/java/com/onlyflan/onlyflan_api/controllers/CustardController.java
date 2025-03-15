package com.onlyflan.onlyflan_api.controllers;

import com.onlyflan.onlyflan_api.dao.CustardDao;
import com.onlyflan.onlyflan_api.models.Custard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CustardController {

    protected CustardDao custardDao;

    @Autowired
    public CustardController(CustardDao custardDao) {
        this.custardDao = custardDao;
    }

    @GetMapping("/custards")
    public List<Custard> getAll() {
        return custardDao.findAll();
    }

    @GetMapping("custards/{name}")
    public ResponseEntity<Custard> get(@PathVariable String name) {

        Optional<Custard> optionalCustard = custardDao.findByName(name);

        if (optionalCustard.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(optionalCustard.get(), HttpStatus.OK);
    }
    @GetMapping("custards/{id}")
    public ResponseEntity<Custard> get(@PathVariable Long id) {

        Optional<Custard> optionalCustard = custardDao.findById(id);

        if (optionalCustard.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(optionalCustard.get(), HttpStatus.OK);
    }


}
