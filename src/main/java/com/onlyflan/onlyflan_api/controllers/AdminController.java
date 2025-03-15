package com.onlyflan.onlyflan_api.controllers;

import com.onlyflan.onlyflan_api.dao.AdminDao;
import com.onlyflan.onlyflan_api.models.Admin;
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
public class AdminController {

    protected AdminDao adminDao;

    @Autowired
    public AdminController(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

//    @GetMapping("/admins")
//    public List<Admin> getAll() {
//        return adminDao.findAll();
//    }
//
//    @GetMapping("admins/{name}")
//    public ResponseEntity<Admin> get(@PathVariable String name) {
//
//        Optional<Admin> optionalAdmin = adminDao.findByName(name);
//
//        if (optionalAdmin.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(optionalAdmin.get(), HttpStatus.OK);
//    }
    @GetMapping("admins/{id}")
    public ResponseEntity<Admin> get(@PathVariable Long id) {

        Optional<Admin> optionalAdmin = adminDao.findById(id);

        if (optionalAdmin.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(optionalAdmin.get(), HttpStatus.OK);
    }


}
