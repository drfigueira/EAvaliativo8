package view;

import model.*;

import javax.swing.*;

public class Main {
    public static String APP_NAME = "JOKEMPÔ";
    public static String PEDRA = "PEDRA";
    public static String PAPEL = "PAPEL";
    public static String TESOURA = "TESOURA";

    public static void main(String[] args) {
        Jogo game;
        int menu;
        Jogador win;
        int confronto;

        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, APP_NAME + "\n1. WINDOWS VS LINUX\n" +
                    "2. Humano VS R2D2\n3. Humano VS MATRIX\n0. Sair"));
            switch (menu) {
                case 1:
                    confronto = defineConfronto();
                    game = new Jogo(confronto);
                    while(game.podeJogar()) {
                        win = game.confronto();
                        if(win != null) {
                            JOptionPane.showMessageDialog(null, "VENCEDOR DA RODADA: " + game.getRodada() + " - " + win.toString());
                        }else {
                            JOptionPane.showMessageDialog(null,"RODADA: " + game.getRodada() + " - EMPATE");
                        }
                    }
                    break;
                case 2:
                    confronto = defineConfronto();
                    game = new Jogo(new Humano(JOptionPane.showInputDialog("Qual seu nome?")), confronto);
                    while(game.podeJogar()) {
                        win = game.confronto(escolhe());
                        if (win != null) {
                            JOptionPane.showMessageDialog(null,"VENCEDOR DA RODADA: " + game.getRodada() + " - " + win.toString());
                        } else {
                            JOptionPane.showMessageDialog(null,"RODADA: " + game.getRodada() + " - EMPATE");
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "ERROR 404");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Jogo encerrado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
            }

        }while(menu != 0 && JOptionPane.showConfirmDialog(null, "Continuar?", APP_NAME,
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);



    }

    public static int defineConfronto() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "1. Confronto unitário\n2. Melhor de 3"));
    }

    public static Coisa escolhe() {
        Coisa coisa = null;
        if(JOptionPane.showConfirmDialog(null, "Escolhe? Pedra", PEDRA,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            coisa = new Pedra();
        }else if(JOptionPane.showConfirmDialog(null, "Escolhe? Papel", PAPEL,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            coisa = new Papel();
        }else if(JOptionPane.showConfirmDialog(null, "Escolhe? Tesoura", TESOURA,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            coisa = new Tesoura();
        }
        return coisa;
    }
}
