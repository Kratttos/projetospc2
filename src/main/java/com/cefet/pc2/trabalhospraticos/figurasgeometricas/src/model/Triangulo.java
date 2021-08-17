package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

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
    public int calcularPerimetro() {
        return lado3 + lado2 + lado1;
    }

    @Override
    public String toString() {
        return "Triangulo { ID = " + this.getId() + " lado1 = " + lado1 + " lado2 =  " + lado2 + " lado3 = " + lado3 + " } : Meu perimetro é " + this.calcularPerimetro()
                + " e minha area é " + this.calcularArea();
    }
}
