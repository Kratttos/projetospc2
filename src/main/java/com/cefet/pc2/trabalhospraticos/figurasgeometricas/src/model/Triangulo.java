package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import java.util.Objects;

public class Triangulo extends FigurasGeometricas {

    private int lado1;
    private int lado2;
    private int lado3;

    //Ainda vou fazer a verificação se os valores entrados podem de fato ser um triangulo
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(int[] lados) {
        this.setLados(lados);
    }

    public int[] getLados() {
        return new int[]{lado1, lado2, lado3};
    }

    public void setLados(int[] lados) {
        this.lado1 = lados[0];
        this.lado2 = lados[1];
        this.lado3 = lados[2];
    }

    @Override
    public int calcularArea() {
        int s = (lado1 + lado2 + lado3) / 2;
        System.out.println(s);
        double a = Math.sqrt(
                (s * (s - lado1)) * (s - lado2) * (s - lado3)
        );
        return (int) Math.round(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return lado1 == triangulo.lado1 && lado2 == triangulo.lado2 && lado3 == triangulo.lado3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, lado3);
    }

    @Override
    public int calcularPerimetro() {
        return lado3 + lado2 + lado1;
    }

    @Override
    public String toString() {
        return "Triangulo { ID = " + this.getId() + " lado1 = " + lado1 + " lado2 =  " + lado2 + " lado3 = " + lado3 + " } : Meu perimetro é " + this.calcularPerimetro()
                + " e minha area é " + this.calcularArea();
    }
}
