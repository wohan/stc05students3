package models.dao;

import models.pojo.Lesson;
import models.pojo.Student;

import java.util.List;

/**
 * Created by admin on 18.04.2017.
 */
public interface LessonDao {
    public List<Lesson> getAll();
    public Lesson get(int id);
    public boolean update(Lesson lesson);
    public boolean delete(Lesson lesson);
}
