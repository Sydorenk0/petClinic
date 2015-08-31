package ua.alex.dao.impl;

import ua.alex.dao.BaseDao;
import ua.alex.dao.DoctorDao;
import ua.alex.data.Doctor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 18.08.2015.
 */
public class DoctorDaoMysql extends BaseDao implements DoctorDao {


    public Doctor getById(int id) {
        Connection connection = null;
        Statement statement = null;
        Doctor doctor = new Doctor();


        try {
            connection = getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM doctor WHERE id = '"+ id + "'";
            System.out.println("sql = " + sql);
            ResultSet resultSet = statement.executeQuery(sql);

            resultSet.next();
            doctor.setId(resultSet.getInt("id"));
            doctor.setFirstName(resultSet.getString("firstName"));
            doctor.setLastName(resultSet.getString("lastName"));
            doctor.setSpecializ(resultSet.getString("specializ"));

            System.out.println(doctor.getId());
            System.out.println(doctor.getFirstName());
            System.out.println(doctor.getLastName());
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
        if ("".equals(doctor.getId())) {
            return null;
        } else {
            return doctor;
        }
    }

    public List<Doctor> getAll() {
        Connection connection = null;
        Statement statement = null;
        List<Doctor> result = new LinkedList<Doctor>();

        try {
            connection = getConnection();
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT  * FROM  doctor");

            while (resultSet.next()) {
                Doctor doctor = new Doctor();
                doctor.setId(resultSet.getInt("id"));
                doctor.setFirstName(resultSet.getString("firstName"));
                doctor.setLastName(resultSet.getString("lastName"));
                doctor.setSpecializ(resultSet.getString("specializ"));

                result.add(doctor);
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

    public void saveOrUpdate(Doctor doctor) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();

            if (doctor.getId() !=0) {
                String sql = "UPDATE doctor SET firstName = '" + doctor.getFirstName() + "'," +
                        " lastName = '" + doctor.getLastName() + "'," +
                        " specializ = '" + doctor.getSpecializ() + "' WHERE id= '"+doctor.getId() +"'";
                System.out.println(sql);
                statement.execute(sql);
            } else {
            String sql = "INSERT INTO doctor (firstName, lastName, specializ) VALUE " +
                    "('" + doctor.getFirstName() +"', '" + doctor.getLastName() + "', " +
                    "'" + doctor.getSpecializ() + "')";
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




    public void delete(Doctor id) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = getConnection();
            statement =connection.createStatement();

            statement.execute("DELETE FROM  doctor WHERE id = '"+id.getId() +"'");

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
