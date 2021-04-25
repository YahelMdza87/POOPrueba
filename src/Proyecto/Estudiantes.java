/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Yahel M
 */
public class Estudiantes extends Materias{
    int Matricula;
    String Nombre;
    double promedio;
    public Estudiantes(int matricula, String nombre){
        this.Matricula = matricula;
        this.Nombre = nombre;
        
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
