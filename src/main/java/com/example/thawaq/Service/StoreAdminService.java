package com.example.thawaq.Service;

import com.example.thawaq.Model.StoreAdmin;
import com.example.thawaq.Repository.StoreAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreAdminService {           //CRUD Made By Abdulaziz Alharbi
    private final StoreAdminRepository storeAdminRepository;

    public List<StoreAdmin> getAllStoreAdmins() {
        return storeAdminRepository.findAll();
    }

    public StoreAdmin getStoreAdminById(Integer id) {
        return storeAdminRepository.findStoreAdminById(id);
    }
}
