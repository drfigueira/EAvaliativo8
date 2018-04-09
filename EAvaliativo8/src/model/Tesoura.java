package model;

public class Tesoura extends Coisa {

    /**
     * Instancia a coisa Tesoura
     */
    public Tesoura() {
        setNomeCoisa("tesoura");
    }

    /**
     * Verifica se Tesoura ganha de Papel
     * @param coisa
     * @return <code>true</code> caso coisa seja Papel ou <code>false</code> caso não seja Papel.
     */
    public boolean coisando(Coisa coisa) {
        return coisa instanceof Papel? true : false;
    }

    @Override
    public String toString() {
        return this.nomeCoisa.toString();
    }

}