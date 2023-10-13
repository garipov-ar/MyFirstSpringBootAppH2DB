package ru.garipov.MyFirstSpringBootAppH2DB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.garipov.MyFirstSpringBootAppH2DB.dao.DisciplineDAO;
import ru.garipov.MyFirstSpringBootAppH2DB.entity.Discipline;

import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {
    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines() {
        return disciplineDAO.getAllDisciplines();
    }

    @Override
    @Transactional
    public Discipline getDiscipline(int id) {
        return disciplineDAO.getDiscipline(id);
    }

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineDAO.saveDiscipline(discipline);
    }

    @Override
    @Transactional
    public boolean deleteDiscipline(int id) {
        disciplineDAO.deleteDiscipline(id);
        return false;
    }
}

