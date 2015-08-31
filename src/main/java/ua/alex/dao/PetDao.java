package ua.alex.dao;

import ua.alex.data.Pet;

import java.util.List;

/**
 * Created by Alex on 18.08.2015.
 */
public interface PetDao {

    Pet getById(int id);

    List<Pet> getAll();

    void saveOrUpdate(Pet pet);

    void delete(Pet id);
}
