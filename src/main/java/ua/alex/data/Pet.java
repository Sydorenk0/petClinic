package ua.alex.data;

/**
 * Created by Alex on 18.08.2015.
 */
public class Pet {
    public int  id;
    public String species;
    public String alias;
    public Integer age;

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAlias () {
        return alias;
    }

    public void  setAlias (String alias) {
        this.alias=alias;
    }

    public Integer getAge() {
        return  age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
