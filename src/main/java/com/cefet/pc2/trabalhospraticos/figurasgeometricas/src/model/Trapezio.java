package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezio trapezio = (Trapezio) o;
        return baseMenor == trapezio.baseMenor && ladoEsquerdo == trapezio.ladoEsquerdo && ladoDireito == trapezio.ladoDireito;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseMenor, ladoEsquerdo, ladoDireito);
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getLadoEsquerdo() {
        return ladoEsquerdo;
    }

    public void setLadoEsquerdo(int ladoEsquerdo) {
        this.ladoEsquerdo = ladoEsquerdo;
    }

    public int getLadoDireito() {
        return ladoDireito;
    }

    public void setLadoDireito(int ladoDireito) {
        this.ladoDireito = ladoDireito;
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
