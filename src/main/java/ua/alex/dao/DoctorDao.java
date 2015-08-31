package ua.alex.dao;

import ua.alex.data.Doctor;

import java.util.List;

/**
 * Created by Alex on 18.08.2015.
 */
public interface DoctorDao {

    Doctor getById(int id);

    List<Doctor> getAll();

    void saveOrUpdate(Doctor doctor);

    void delete(Doctor id);
}
