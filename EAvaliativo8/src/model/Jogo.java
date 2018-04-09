package model;

public class Jogo {
    protected Jogador p1;
    private Computador c1;
    private Computador c2;
    private int rodada;
    private int limitePlay;

    /**
     * Instacia um jogo com dois Computadores, definindo o confronto unitario ou melhor de 3
     * @param limitePlay inteiro
     */
    public Jogo(int limitePlay) {
        this.c1 = new Computador("Windows");
        this.c2 = new Computador("Linux");
        this.rodada = 0;
        setLimitePlay(limitePlay);
    }

    /**
     * Instancia um jogo com Humano e Computador, definindo o confronto unitario ou melhor de 3
     * @param p1 Jogador
     * @param limitePlay inteiro
     */
    public Jogo(Jogador p1, int limitePlay) {
        setJogador(p1);
        this.c1 = new Computador("R2D2");
        this.rodada = 0;
        setLimitePlay(limitePlay);
    }

    /**
     * Limita quantidade de confronto entre 1 ou 3, caso seja informado algum valor inválido, por default sera considerado
     * um confronto melhor de 3
     *
     * @param limitePlay inteiro definindo quantidade de rodadas
     */
    private void setLimitePlay(int limitePlay) {
        this.limitePlay = limitePlay == 1 ? limitePlay : 3;
    }

    /**
     * Informa a rodada de confronto
     * @return inteiro
     */
    public int getRodada() {
        return this.rodada;
    }

    /**
     * Informa se excedeu a quantidade de rodadas
     * @return <code>true</code> caso não tenha excedido as rodadas ou <code>false</code> caso tenha excedido.
     */
    public boolean podeJogar() {
        return this.rodada < this.limitePlay;
    }

    /**
     * Realiza a rodada entre os Computadores, retornando o vencedor da partida
     * @return Jogador vencedor
     */
    public Jogador confronto() {
        Jogador vencedor = null;
        this.c1.setCoisa(this.c1.randCoisa());
        this.c2.setCoisa(this.c2.randCoisa());
        this.rodada++;
        if(this.c1.getCoisa().coisando(this.c2.getCoisa())) {
            vencedor = this.c1;
        }else if(this.c2.getCoisa().coisando(this.c1.getCoisa())) {
            vencedor = this.c2;
        }
        return vencedor;
    }

    /**
     * Realiza a rodada entre o Humano e Computador, retornando o vencedor da partida
     * @param coisa Coisa informada pelo Humano
     * @return Jogador vencedor
     */
    public Jogador confronto(Coisa coisa) {
        Jogador vencedor = null;
        this.p1.setCoisa(coisa);
        this.c1.setCoisa(c1.randCoisa());
        this.rodada++;
        if(this.p1.getCoisa().coisando(this.c1.getCoisa())) {
            vencedor = this.p1;
        }else if(this.c1.getCoisa().coisando(this.p1.getCoisa())) {
            vencedor = this.c1;
        }
        return vencedor;
    }

    /**
     * Define o Jogador do jogo
     * @param p1
     */
    protected void setJogador(Jogador p1) {
        this.p1 = p1;
    }

}
