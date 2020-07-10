package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Department;
import ch.zli.m223.punchclock.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
//Controller der Abteilungen
public class DepartmentController {

   DepartmentService departmentService;


    //Diese Methode gibt alle Abteilungen an
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartments() {
        return departmentService.findAll();
    }
}
