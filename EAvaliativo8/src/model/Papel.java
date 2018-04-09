package model;

public class Papel extends Coisa {

    /**
     * Instancia a coisa Papel
     */
    public Papel() {
        setNomeCoisa("papel");
    }

    /**
     * Verifica se Papel ganha de Pedra
     * @param coisa
     * @return <code>true</code> caso coisa seja Pedra ou <code>false</code> caso não seja Pedra.
     */
    public boolean coisando(Coisa coisa) {
        return coisa instanceof Pedra? true : false;
    }

    @Override
    public String toString() {
        return this.nomeCoisa.toString();
    }

}