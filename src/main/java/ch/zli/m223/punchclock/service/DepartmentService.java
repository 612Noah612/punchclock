package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Department;
import ch.zli.m223.punchclock.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {

    DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
}
