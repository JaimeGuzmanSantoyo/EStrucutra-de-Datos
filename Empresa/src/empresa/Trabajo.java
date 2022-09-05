/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author josej
 */
public class Trabajo {
    
    private int NumeroTrabajo;
    private String Nombre;
     private String ApellidoPaterno;
     private String ApellidoMaterno;
     private int HorasExtra;
     private double sueldoBase;
     private int AñoIngreso;

    public Trabajo() {
    }

    public Trabajo(int NumeroTrabajo, String Nombre, String ApellidoPaterno, String ApellidoMaterno, int HorasExtra, double sueldoBase, int AñoIngreso) {
        this.NumeroTrabajo = NumeroTrabajo;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.HorasExtra = HorasExtra;
        this.sueldoBase = sueldoBase;
        this.AñoIngreso = AñoIngreso;
    }

    public void setNumeroTrabajo(int NumeroTrabajo) {
        this.NumeroTrabajo = NumeroTrabajo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setHorasExtra(int HorasExtra) {
        this.HorasExtra = HorasExtra;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setAñoIngreso(int AñoIngreso) {
        this.AñoIngreso = AñoIngreso;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "NumeroTrabajo=" + NumeroTrabajo + ", Nombre=" + Nombre + ", ApellidoPaterno=" + ApellidoPaterno + ", ApellidoMaterno=" + ApellidoMaterno + ", HorasExtra=" + HorasExtra + ", sueldoBase=" + sueldoBase + ", A\u00f1oIngreso=" + AñoIngreso + '}';
    }
     
    
public static final double monto_H_Extra=276.5;
public static final double prestacion=0.03;

public double CalcularSueldo(){
    double total = 0.0;
    total = sueldoBase+(monto_H_Extra*HorasExtra);
return total;
    
    
}


}
