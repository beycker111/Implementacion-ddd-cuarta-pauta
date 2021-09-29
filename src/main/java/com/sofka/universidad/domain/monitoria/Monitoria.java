package com.sofka.universidad.domain.monitoria;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.events.*;
import com.sofka.universidad.domain.monitoria.values.*;
import com.sofka.universidad.domain.programa.values.ProgramaId;

import java.util.List;
import java.util.Objects;

public class Monitoria extends AggregateEvent<MonitoriaId> {

    protected Nombre nombre;
    protected Area area;
    protected SalarioHora salarioHora;
    protected RequisitoMonitoria requisitoMonitoria;
    protected ProgramaId programaId;

    //Raul dijo que el constructor debe tener lo de requisitos materia
    public Monitoria(MonitoriaId entityId, Nombre nombre, Area area, SalarioHora salarioHora) {
        super(entityId);
        appendChange(new MonitoriaCreada(nombre, area, salarioHora)).apply();
    }

    private Monitoria(MonitoriaId entityId){
        super(entityId);
        subscribe(new MonitoriaChange(this));
    }

    //NO ENTIENDO ESTO
    public static Monitoria from(MonitoriaId entityId, List<DomainEvent> events){
        var monitoria = new Monitoria(entityId);
        events.forEach(monitoria::applyEvent);
        return monitoria;
    }

    public void agregarRequisitoMonitoria(RequisitoMonitoriaId entityId, Materia materia, Semestre semestre, Promedio promedio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(materia);
        Objects.requireNonNull(semestre);
        Objects.requireNonNull(promedio);
        appendChange(new RequisitoMonitoriaAgregada(entityId, materia, semestre, promedio)).apply();
    }

    public void asociarPrograma(ProgramaId programaId){
        appendChange(new ProgramaAsociado(programaId)).apply();
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreMonitoriaCambiado(nombre)).apply();
    }

    public void cambiarArea(Area area){
        appendChange(new AreaCambiada(area)).apply();
    }

    public void cambiarSalarioHora(SalarioHora salarioHora){
        appendChange(new SalarioHoraCambiado(salarioHora)).apply();
    }

    public void aumentarSalarioHora(Integer aumento){
        appendChange(new SalarioHoraAumentado(this.salarioHora, aumento)).apply();
    }

    public void ActualizarMateriaRequerida(Materia materia){
        appendChange(new MateriaRequeridaActualizada(materia)).apply();
    }

    public void ActualizarSemestreRequerido(Semestre semestre){
        appendChange(new SemestreRequeridoActualizado(semestre)).apply();
    }

    public void ActualizarPromedioRequerido(Promedio promedio){
        appendChange(new PromedioRequeridoActualizado(promedio)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Area area() {
        return area;
    }

    public SalarioHora salarioHora() {
        return salarioHora;
    }

    public RequisitoMonitoria requisitoMonitoria() {
        return requisitoMonitoria;
    }

    public ProgramaId programaId() {
        return programaId;
    }

    public void enviarAlerta(String mensaje) {
        appendChange(new MensajeEnviado(mensaje)).apply();
    }
}
