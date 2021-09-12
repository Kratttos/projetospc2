package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circulo extends FigurasGeometricas {

    private int raio;

    @Override
    public int calcularArea() {
        return (int) (Math.PI * (raio * raio));
    }

    @Override
    public int calcularPerimetro() {
        return (int) ((2 * Math.PI) * this.raio);
    }

    @Override
    public String toString() {
         return "Circulo { ID = "+getId ()+ ", Diametro = "+(2*this.raio)+", Raio = "+this.raio + " } : " +
                 "minha area é " + calcularArea() + " é meu perimetro é "+ calcularPerimetro()+".";
    }
}
