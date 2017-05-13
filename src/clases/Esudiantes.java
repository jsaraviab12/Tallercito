/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Esudiantes {
 private String codigo;
 private String pNombre;
 private String sNombre;
private String pApellido;
private String sApellido;
private String email;
private String direccion;
private String nacimiento;
private Object sexo;
private Object carrera;
private Object semestre;
private Object nivel;
private String horario;

    public Esudiantes(String codigo, String pNombre, String sNombre, String pApellido, String sApellido, String email, String direccion, String nacimiento, Object sexo, Object carrera, Object semestre, Object nivel, String horario) {
        this.codigo = codigo;
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.email = email;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
        this.semestre = semestre;
        this.nivel = nivel;
        this.horario = horario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Object getSexo() {
        return sexo;
    }

    public void setSexo(Object sexo) {
        this.sexo = sexo;
    }

    public Object getCarrera() {
        return carrera;
    }

    public void setCarrera(Object carrera) {
        this.carrera = carrera;
    }

    public Object getSemestre() {
        return semestre;
    }

    public void setSemestre(Object semestre) {
        this.semestre = semestre;
    }

    public Object getNivel() {
        return nivel;
    }

    public void setNivel(Object nivel) {
        this.nivel = nivel;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
