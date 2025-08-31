package com.example.employeemvc.service;

import com.example.employeemvc.model.Department;
import com.example.employeemvc.model.Employee;
import com.example.employeemvc.repository.DepartmentRepository;
import com.example.employeemvc.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;
    private final DepartmentRepository deptRepo;

    public EmployeeService(EmployeeRepository repo, DepartmentRepository deptRepo) {
        this.repo = repo;
        this.deptRepo = deptRepo;
    }

    public Employee save(Employee emp) {
        if (emp.getDepartment() == null || emp.getDepartment().getId() == null) {
            throw new RuntimeException("Department is required");
        }
        Department dept = deptRepo.findById(emp.getDepartment().getId())
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + emp.getDepartment().getId()));
        emp.setDepartment(dept);
        return repo.save(emp);
    }

    public List<Employee> getAll() { return repo.findAll(); }

    public Employee getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    public List<Employee> searchByName(String name) { return repo.findByNameContaining(name); }

    public void delete(Long id) { repo.deleteById(id); }
}