package model;

import java.util.Random;

public class Computador extends Jogador {

    /**
     * Instancia Computador definindo aleatoriamente uma Coisa
     * @param nome
     */
    public Computador(String nome) {
        this.setNome(nome);
        this.setCoisa(randCoisa());
    }

    /**
     * Gera aleatoriamente uma Coisa
     * @return Coisa
     */
    public Coisa randCoisa() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        Coisa coisa;
        if(n == 1) {
            coisa = new Papel();
        }else if(n == 2) {
            coisa = new Tesoura();
        }else {
            coisa = new Pedra();
        }
        return coisa;
    }


}