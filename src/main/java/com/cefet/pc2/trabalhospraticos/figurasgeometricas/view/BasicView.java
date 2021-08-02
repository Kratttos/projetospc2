package com.cefet.pc2.trabalhospraticos.figurasgeometricas.view;

public abstract class BasicView extends BasicIO {

    /**
     * Retorna um inteiro
     *
     * @return retorna um inteiro maior do que 0
     */
    public int askNumberBiggerThanZero() {
        String number;
        int numberI = -50;
        do {
            number = this.askString();
            try {
                numberI = Integer.parseInt(number);
                if (numberI <= 0) {
                    this.printLine("O valor digitado deve ser maior que 0");
                }
            } catch (NumberFormatException ex) {
                this.printLine("O valor digitado deve ser um numero");
            }

        } while (numberI <= 0);

        return numberI;
    }
}
