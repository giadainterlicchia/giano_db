package com.giano.dashboard.entity;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
 
// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Cliente{

    @Id
    private String codicefiscale;
    private String nome;
    private String cognome;
    private int telefono;
    private String email;
    private Ruolo ruolo;
    private String note;

    public enum Ruolo {
        DOCENTE,
        STUDENTE,
        ALTRO
        }
 
}
