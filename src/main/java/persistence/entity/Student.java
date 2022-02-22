package persistence.entity;

import model.StudentModel;

import javax.persistence.*;

@Entity
@Table (name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idstudent;

    @Column(name = "name")
    private String namestudent;

    @Column(name = "surname")
    private String surnamestudent;

    public void getStudent (StudentModel model){
        namestudent = model.getName();
        surnamestudent = model.getSurname();
    }

    public Student() {
    }

    public Integer getIdstudent() { return idstudent; }

    public void setIdstudent(Integer idstudent) { this.idstudent = idstudent; }

    public String getNamestudent() { return namestudent; }

    public void setNamestudent(String namestudent) { this.namestudent = namestudent; }

    public String getSurnamestudent() { return surnamestudent; }

    public void setSurnamestudent(String surnamestudent) { this.surnamestudent = surnamestudent; }
}
