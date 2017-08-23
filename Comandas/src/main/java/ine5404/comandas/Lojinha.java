/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 17100518
 */
public class Lojinha {

    public static void main(String[] args) throws IOException {
        Persistencia p = new Persistencia();
        GerenciadorDeUsuarios GU = new GerenciadorDeUsuarios();
        List<Cliente> client = new ArrayList<>();
        do {
            int OP = Integer.parseInt(JOptionPane.showInputDialog("      Bom dia/tarde/noite\n--------------*-----------\n"
                    + "1-Cadatrar-se\n2-Login\nOutro-Sair\n"
                    + "--------------*-----------"));
            switch (OP) {
                case 1:
                    Cliente c;
                    String log;
                    String nome = JOptionPane.showInputDialog("Nome:");
                    int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF:"));
                    do {
                        log = JOptionPane.showInputDialog("Login:");
                        if ((GU.mapaLoginSenha.containsKey(log))) {
                            JOptionPane.showMessageDialog(null, "Login já existente");
                        }
                    } while ((GU.mapaLoginSenha.containsKey(log)));

                    String senha = JOptionPane.showInputDialog("Senha:");
                    GU.addLoginSenha(log, senha);
                    client.add(c = new Cliente(nome, cpf));
                    p.SalvarEmDisco("Cadastros", GU);
                    JOptionPane.showMessageDialog(null, "Seja bem vindo, Sr.(a)" + nome);
                    break;
                case 2:
                    break;
                default:
                    return;
            }
        } while (3 == 3);
    }
}
