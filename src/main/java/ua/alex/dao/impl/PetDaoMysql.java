package ua.alex.dao.impl;

import ua.alex.dao.BaseDao;
import ua.alex.dao.PetDao;
import ua.alex.data.Pet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 18.08.2015.
 */
public class PetDaoMysql extends BaseDao implements PetDao {


    public Pet getById(int id) {
        Connection connection = null;
        Statement statement = null;
        Pet pet = new Pet();


        try {
            connection = getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM pet WHERE id = '"+ id + "'";
            System.out.println("sql = " + sql);
            ResultSet resultSet = statement.executeQuery(sql);

            resultSet.next();
            pet.setId(resultSet.getInt("id"));
            pet.setSpecies(resultSet.getString("species"));
            pet.setAlias(resultSet.getString("alias"));
            pet.setAge(resultSet.getInt("age"));

            System.out.println(pet.getId());
            System.out.println(pet.getSpecies());
            System.out.println(pet.getAlias());
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        if ("".equals(pet.getId())) {
            return null;
        } else {
            return pet;
        }
    }


    public List<Pet> getAll() {
        Connection connection = null;
        Statement statement = null;
        List<Pet> result = new LinkedList<Pet>();

        try {
            connection = getConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT  * FROM  pet");

            while (resultSet.next()) {
                Pet pet = new Pet();
                pet.setId(resultSet.getInt("id"));
                pet.setSpecies(resultSet.getString("species"));
                pet.setAlias(resultSet.getString("alias"));
                pet.setAge(resultSet.getInt("age"));

                result.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (statement != null) {
                try{
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public void saveOrUpdate(Pet pet) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();

            if (pet.getId() !=0) {
                String sql = "UPDATE pet SET species = '" + pet.getSpecies() + "'," +
                        " alias = '" + pet.getAlias() + "'," +
                        " age = '" + pet.getAge() + "'WHERE id= '"+pet.getId()+"'";
                System.out.println(sql);
                statement.execute(sql);
            } else {
                String sql = "INSERT INTO pet (species, alias, age) VALUE " +
                        "('" + pet.getSpecies() +"', '" + pet.getAlias() + "', " +
                        "'" + pet.getAge() + "')";
                System.out.println(sql);
                statement.execute(sql);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void delete(Pet id) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement =connection.createStatement();

            statement.execute("DELETE FROM  pet WHERE id = '"+id.getId() +"'");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
