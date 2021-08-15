package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.model.enums;

public enum OpcoesSubMenu implements Opcoes {

    //Teste da Gambiarra
    CRIAR("Novo (Criar/Adicionar novo item )", OpcoesSubMenu.definirNumero()),
    ALTERAR("Editar (Selecionar Id e Editar)", OpcoesSubMenu.definirNumero()),
    EXCLUIR("Excluir (Excluir Id)", OpcoesSubMenu.definirNumero()),
    LISTAR("Listar (Listar Itens do Tipo)", OpcoesSubMenu.definirNumero()),
    MOSTRAR("Mostrar (Listar detalhes de 1 Itens)", OpcoesSubMenu.definirNumero()),
    SAIR("Sair","X");


    private String text;
    private String tecla;
    private static int numero;

    OpcoesSubMenu(String text, String tecla) {
        this.text = text;
        this.tecla = tecla;
    }

    private static final String definirNumero() {
        return (OpcoesSubMenu.numero+=1) + "";
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public String getTecla() {
        return this.tecla;
    }
}
