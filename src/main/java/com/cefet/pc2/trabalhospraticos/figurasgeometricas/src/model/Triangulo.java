package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Triangulo extends FigurasGeometricas {

    private int lado1;
    private int lado2;
    private int lado3;

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
        return "Triangulo { ID = " + this.getId() + ", Lado 1 = " + lado1 + ", Lado 2 =  " + lado2 + ", Lado 3 = " + lado3 + " } : Meu perimetro é " + this.calcularPerimetro()
                + " e minha area é " + this.calcularArea();
    }
}
