package com.d4viddf.Tablas;

public class Departamentos {
    public int id;
    public String nombre;
    public float presupuesto;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Departamentos(int id, String nombre, float presupuesto) {
        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public Departamentos() {
    }

}
