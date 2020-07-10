package ch.zli.m223.punchclock.domain;

import javax.persistence.*;


@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;


    public Long getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departementName) {
        this.departmentName = departementName;
    }

}
