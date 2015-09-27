/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public TabelaDeSimbolos getTabelaDoSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return ts;
            }
        }
        return null;
    }
    
    public String getTipoDoSimbolo(String nome){
        TabelaDeSimbolos auxiliar = this.getTabelaDoSimbolo(nome);
        String tipo = auxiliar.GetTipoSimbolo(nome);
        return tipo;
    
    }
    

    public TabelaDeSimbolos existeTabela(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.getEscopo().equals(nome)) {
                return ts;
            }
        }
        return null;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
}