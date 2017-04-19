package models.dao;

import models.pojo.Journal;
import models.pojo.Student;

import java.util.List;

/**
 * Created by admin on 18.04.2017.
 */
public interface JournalDao {
    public List<Journal> getAll();
    public Journal get(int id);
    public boolean update(Journal journal);
    public boolean delete(Journal journal);
}
