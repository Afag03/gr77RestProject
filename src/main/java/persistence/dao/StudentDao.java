package persistence.dao;

import model.StudentModel;

import java.util.List;

public interface StudentDao {

    List<StudentModel> getAllStudent();

    void addStudent(StudentModel model);

    void updateStudent(StudentModel model);

    void deleteStudent(Integer id);

}
