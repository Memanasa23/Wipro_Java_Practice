package com.example.employeemvc.controller;

import com.example.employeemvc.model.Employee;
import com.example.employeemvc.service.EmployeeService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees/api")
public class EmployeeApiController {

    private final EmployeeService empService;

    public EmployeeApiController(EmployeeService empService) {
        this.empService = empService;
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(empService.save(employee));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(empService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(empService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return ResponseEntity.ok(empService.save(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        empService.delete(id);
        return ResponseEntity.noContent().build();
    }
}