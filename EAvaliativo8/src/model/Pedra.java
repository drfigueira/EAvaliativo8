package model;

public class Pedra extends Coisa {

    /**
     * Instancia a coisa Pedra
     */
    public Pedra() {
        setNomeCoisa("pedra");
    }

    /**
     * Verifica se Pedra ganha de Tesoura
     * @param coisa
     * @return <code>true</code> caso coisa seja Tesoura ou <code>false</code> caso não seja Tesoura.
     */
    public boolean coisando(Coisa coisa) {
        return coisa instanceof Tesoura? true : false;
    }

    @Override
    public String toString() {
        return this.nomeCoisa.toString();
    }

}