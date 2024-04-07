package com.example.Payment.service;

import com.example.Payment.data.Admin;
import com.example.Payment.data.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository){
        this.adminRepository=adminRepository;
    }

    public Optional<Admin> loginAdmin(String username, String password) {
        return adminRepository.findByUsername(username)
                .filter(user -> user.getPassword().equals(password));
    }
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }


}
