package model;

public abstract class Jogador {
    private String nome;
    private Coisa coisa;

    /**
     * Defini nome para Jogador
     * @param nome
     */
    protected void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    /**
     * Define Coisa para Jogador
     * @param coisa
     */
    public void setCoisa(Coisa coisa) {
        this.coisa = coisa != null? coisa : new Pedra();
    }

    /**
     * Retorna Coisa de Jogador
     * @return
     */
    public Coisa getCoisa() {
        return this.coisa;
    }

    @Override
    public String toString() {
        return this.nome.toString();
    }

}
