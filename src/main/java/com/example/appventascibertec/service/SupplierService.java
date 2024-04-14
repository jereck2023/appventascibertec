package com.example.appventascibertec.service;

import com.example.appventascibertec.model.bd.Supplier;
import com.example.appventascibertec.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SupplierService implements ISupplierService{
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> listSuppliers() {
        return supplierRepository.findAll();
    }
}
