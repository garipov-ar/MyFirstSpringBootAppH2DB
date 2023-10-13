package ru.garipov.MyFirstSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.garipov.MyFirstSpringBootAppH2DB.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAllDisciplines();
    Discipline getDiscipline(int id);
    Discipline saveDiscipline(Discipline discipline);
    boolean deleteDiscipline(int id);
}
