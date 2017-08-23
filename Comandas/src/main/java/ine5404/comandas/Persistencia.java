/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author martin
 */
public class Persistencia<E> {

    //implemente uma classe para gravar e recuperar uma Comanda e um GerenciadorDeUsuarios
    public void SalvarEmDisco(String name, E elemento) throws FileNotFoundException, IOException {
        FileOutputStream arquivo = new FileOutputStream(name);
        ObjectOutputStream saida = new ObjectOutputStream(arquivo);
        saida.writeObject(elemento);
        saida.close();
    }

    public E RecuperarObjeto(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream(name);
        ObjectInputStream entrada = new ObjectInputStream(arquivo);
        return (E) entrada.readObject();
        
    }
    
}
