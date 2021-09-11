package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class Renderizavel implements Serializable {

    private int id;

}
