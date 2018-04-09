package model;

public class Humano extends Jogador {

    /**
     * Instancia Humano com Coisa
     * @param nome
     * @param coisa
     */
    public Humano(String nome, Coisa coisa) {
        setNome(nome);
        setCoisa(coisa);
    }

    /**
     * Instancia Humano sem Coisa
     * @param nome
     */
    public Humano(String nome) {
        setNome(nome);
    }

}