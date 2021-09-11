package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Trapezio extends Quadrilateros {

    private int baseMenor;
    private int ladoEsquerdo;
    private int ladoDireito;

    public Trapezio(int maiorBase, int altura, int baseMenor, int ladoDireito, int ladoEsquerdo) {
        super(maiorBase, altura);
        this.baseMenor = baseMenor;
        this.ladoDireito = ladoDireito;
        this.ladoEsquerdo = ladoEsquerdo;
    }


    @Override
    public int calcularArea() {
        return ((this.getBase() + baseMenor) * this.getAltura()) / 2;
    }

    @Override
    public int calcularPerimetro() {
        return this.getBase() + this.getAltura() + ladoDireito + ladoEsquerdo;
    }

    @Override
    public String toString() {
        return "Trapezio { ID = " + this.getId() + ", menor base = " + this.baseMenor + ", maior base = "
                + this.getBase() + ", altura = " + this.getAltura() + ", lado direito = " + this.ladoDireito
                + ", lado esquerdo = " + this.ladoEsquerdo + " } : Minha area é: " + this.calcularArea() +
                " e meu perimetro é: " + this.calcularPerimetro();
    }
}
