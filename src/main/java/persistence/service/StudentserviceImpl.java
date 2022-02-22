package persistence.service;

import model.StudentModel;
import persistence.dao.StudenDaoImpl;
import persistence.dao.StudentDao;

import java.util.List;

public class StudentserviceImpl implements StudentService{

    private StudentDao studentDao = new StudenDaoImpl();

    @Override
    public List<StudentModel> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public void addStudent(StudentModel model) { studentDao.addStudent(model); }

    @Override
    public void updateStudent(StudentModel model) { studentDao.updateStudent(model); }

    @Override
    public void deleteStudent(Integer id) { studentDao.deleteStudent(id); }
}
