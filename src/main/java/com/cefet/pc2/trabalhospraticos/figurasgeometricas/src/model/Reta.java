package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Reta extends Renderizavel {

    private int tamanho;
    
    @Override
    public String toString() {
        return "Reta { ID = " + this.getId() + ", Tamanho = " + tamanho + "}";
    }
}
