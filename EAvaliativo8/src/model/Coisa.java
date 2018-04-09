package model;

public abstract class Coisa {
    protected String nomeCoisa;

    /**
     * Define nome para Coisa
     * @param nomeCoisa
     */
    protected void setNomeCoisa(String nomeCoisa) {
        this.nomeCoisa = nomeCoisa.toUpperCase();
    }

    public abstract String toString();

    public abstract boolean coisando(Coisa coisa);

}