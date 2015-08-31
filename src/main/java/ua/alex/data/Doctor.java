package ua.alex.data;

/**
 * Created by Alex on 18.08.2015.
 */
public class Doctor  {
    public int  id;
    public String firstName;
    public String lastName;
    public String specializ;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public  void  setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSpecializ(){
        return specializ;
    }

    public void setSpecializ(String specializ){
        this.specializ = specializ;
    }
}
