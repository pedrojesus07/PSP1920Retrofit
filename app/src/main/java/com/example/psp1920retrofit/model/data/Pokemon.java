package com.example.psp1920retrofit.model.data;

public class Pokemon {

    private long id;
    private String nombre;
    private long idtype;
    private float height;
    private float weight;
    private String ability;

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idtype=" + idtype +
                ", height=" + height +
                ", weight=" + weight +
                ", ability='" + ability + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdtype() {
        return idtype;
    }

    public void setIdtype(long idtype) {
        this.idtype = idtype;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
