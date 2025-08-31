package com.example.employeemvc.service;

import com.example.employeemvc.model.Department;
import com.example.employeemvc.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository repo;

    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department save(Department dept) {
        return repo.save(dept);
    }

    public List<Department> getAll() {
        return repo.findAll();
    }

    public Department getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Department not found"));
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}