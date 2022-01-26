package com.freecode.redditclone.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.freecode.redditclone.model.Ids.Cita_UsuarioId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.EmbeddedId;

@Data
@Entity
public class Cita_Usuario  {

    @EmbeddedId
    private Cita_UsuarioId cita_UsuarioId=new Cita_UsuarioId();
    
    @MapsId("cita_id")
    @OneToOne(fetch=LAZY)
    @JoinColumn(name="cita_id",referencedColumnName="cita_id")
    private Cita cita;
    @MapsId("Historial_id")
    @OneToOne(fetch=LAZY)
    @JoinColumn(name="Historial_id",referencedColumnName="historial_id")
    private Historial historial;
    
}