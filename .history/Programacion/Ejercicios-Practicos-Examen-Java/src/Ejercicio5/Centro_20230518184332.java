public class Centro {
    public String nombreCentro;
    public Profesor conjuntoProfesores;
    public Alumnos conjuntoAlumnos;
    public CiclosFormativos conjuCiclosFormativos;
    public Alumnos[] alumno;
    public Profesor[] profesor;

    public Centro(String nombreCentro, String conjuCiclosFormativos) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public Profesor getConjuntoProfesores() {
        return conjuntoProfesores;
    }

    public void setConjuntoProfesores(Profesor conjuntoProfesores) {
        this.conjuntoProfesores = conjuntoProfesores;
    }

    public Alumnos getConjuntoAlumnos() {
        return conjuntoAlumnos;
    }

    public void setConjuntoAlumnos(Alumnos conjuntoAlumnos) {
        this.conjuntoAlumnos = conjuntoAlumnos;
    }

    public CiclosFormativos getConjunFormativos() {
        return conjuCiclosFormativos;
    }
    public void setConjuCiclosFormativos(CiclosFormativos conjuCiclosFormativos){
        this.conjuCiclosFormativos = conjuCiclosFormativos;
    }

    public Alumnos[] getAlumnos(){
        return alumno;
    }

    public Profesor[] profesor(){
        return profesor;
    }

}
