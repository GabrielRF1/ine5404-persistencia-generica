/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author martin
 */
public class GerenciadorDeUsuarios {
    Map<String, String> mapaLoginSenha;

    public GerenciadorDeUsuarios() {
    mapaLoginSenha = new HashMap<>();
    }

    
    
    
    //implementar uma mapa de login e senhas
    
    public void addLoginSenha(String login, String senha){
        mapaLoginSenha.put(senha, login);
    }
    
    public boolean autenticar(String login, String senha){
      boolean existe=false;  
        String user=mapaLoginSenha.get(senha);
        if(user.equals(login)){
        existe=true;
        }
        return existe;
    }
}
