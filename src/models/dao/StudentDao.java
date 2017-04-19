package models.dao;

import models.pojo.Student;

import java.util.List;

/**
 * Created by admin on 18.04.2017.
 */
public interface StudentDao {
    public List<Student> getAll();
    public Student get(int id);
    public boolean update(Student student);
    public boolean delete(Student student);

}
