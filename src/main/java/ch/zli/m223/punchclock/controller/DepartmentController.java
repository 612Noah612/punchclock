package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Department;
import ch.zli.m223.punchclock.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public class DepartmentController {

   DepartmentServiceService departmentService;



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartments() {
        return departmentService.findAll();
    }
}
