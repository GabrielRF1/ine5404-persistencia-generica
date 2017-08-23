/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.comandas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin
 */
public class Comanda {
    protected Cliente cliente;
    protected List<Pedido> pedidos;
    
    public Comanda(Cliente cliente) {
        this.cliente = cliente;
        pedidos=new ArrayList<>();
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public double getTotal(){
          double tot=0;
          for(Pedido p:pedidos){
              tot+=p.getValor();
          }
        return tot;
    }
}
