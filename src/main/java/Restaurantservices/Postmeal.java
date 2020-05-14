package Restaurantservices;

import org.sql2o.Connection;

import java.util.List;
import java.util.Objects;

public class Postmeal  extends Animal{
    public static final String DATABASE_TYPE = "Post";

    public  Postmeal(String name, String description, String cook){
        this.name = name;
        this.description = description;
        this.cook = cook;
        type = DATABASE_TYPE;
    }

    public String getDescriptio(){

        return description;
    }
    public String getCook(){
        return cook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postmeal animal = (Postmeal ) o;
        return id == animal.id &&
                description.equals(animal.description) &&
                cook.equals(animal.cook) &&
                name.equals(animal.name) &&
                type.equals(animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, cook, name, id, type);
    }

    public static List<Postmeal> all(){
        String sql = "SELECT * FROM animals WHERE type='Post'";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(Postmeal.class);
        }
    }

    public void save(){

        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals (name,type,health,age) VALUES (:name,:type,:description,:cook);";
            this.id = (int) con.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("type",this.type)
                    .addParameter("description",this.description)
                    .addParameter("cook",this.cook)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static Postmeal find(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Postmeal animal = con.createQuery(sql)
                    .addParameter("id", id)
                    .throwOnMappingFailure(false)
                    .executeAndFetchFirst(Postmeal.class);
            return animal;
        }
    }
}

