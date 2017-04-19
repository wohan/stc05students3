package models.dao;

import models.connection.Connect;
import models.pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 18.04.2017.
 */
public class StudentDaoImpl implements StudentDao {

    public List<Student> getAll() {
        Connection connection = Connect.initConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select *"+
                    " from student");

            ResultSet result = preparedStatement.executeQuery();

            List<Student> studentList = null;
            while (result.next()) {
                studentList.add(new Student(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getInt("group_id"),
                        result.getInt("age")
                ));
            }
            return studentList;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Student get(int id) {
        Connection connection = Connect.initConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select *"+
                    " from student where id=?");
            preparedStatement.setInt(1, id);

            ResultSet result = preparedStatement.executeQuery();

            result.next();
            return new Student(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("group_id"),
                    result.getInt("age")
            );

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean update(Student student) {
        Connection connection = Connect.initConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET(" +
                    " name, group_id, age)" +
                    " = (?, ?, ?)"+
                    " WHERE id = ?");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getGroup_id());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setInt(4, student.getId());
            preparedStatement.executeQuery();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Student student) {
        Connection connection = Connect.initConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Delete from student " +
                    " WHERE id = ?");
            preparedStatement.setInt(1, student.getId());
            preparedStatement.executeQuery();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
