package ru.garipov.MyFirstSpringBootAppH2DB.dao;

import org.springframework.stereotype.Repository;
import ru.garipov.MyFirstSpringBootAppH2DB.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineDAO {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);
    Discipline getDiscipline(int id);
    void deleteDiscipline(int id);
}
