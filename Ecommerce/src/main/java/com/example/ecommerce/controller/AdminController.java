package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Admin;
import com.example.ecommerce.repo.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/admins")
    List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @PostMapping("/admins")
    Admin newAdmin(@RequestBody Admin newAdmin) {
        return adminRepository.save(newAdmin);
    }

    @GetMapping("/admins/{id}")
    Admin one(@PathVariable int id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

    @PutMapping("/admins/{id}")
    Admin replaceAdmin(@RequestBody Admin newAdmin, @PathVariable int id) {
        return adminRepository.findById(id)
                .map(admin -> {
                    admin.setEmail(newAdmin.getEmail());
                    admin.setUsername(newAdmin.getUsername());
                    admin.setPassword(newAdmin.getPassword());
                    admin.setLastLogin(newAdmin.getLastLogin());
                    return adminRepository.save(admin);
                })
                .orElseGet(() -> {
                    newAdmin.setId(id);
                    return adminRepository.save(newAdmin);
                });
    }

    @DeleteMapping("/admins/{id}")
    void deleteAdmin(@PathVariable int id) {
        adminRepository.deleteById(id);
    }
}
