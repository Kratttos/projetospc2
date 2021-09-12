package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public abstract class Quadrilateros extends FigurasGeometricas{

    private int base;
    private int altura;

    @Override
    public int calcularArea() {
       return this.base*this.altura;
    }

    @Override
    public int calcularPerimetro() {
        return (this.base+this.altura)*2;
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("@",("{ Base = "+(this.base)+", Altura = "+this.altura + "}"));
    }
}
