/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public List<String> getSimbolos(){
        List<String> atributos = new ArrayList<String>();
        for(int i=0; i< simbolos.size();i++){
            atributos.add("." + simbolos.get(i).getNome());
        }
        return atributos;
    }
    
    public List<EntradaTabelaDeSimbolos> getSimbolos2(){
        List<EntradaTabelaDeSimbolos> atributos = new ArrayList<EntradaTabelaDeSimbolos>();
        for(int i=0; i< simbolos.size();i++){
            atributos.add(simbolos.get(i));
        }
        return atributos;
    }
    
    
    public String getEscopo(){
        return this.escopo;
        }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    }
    
    public String GetTipoSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        return "SEM_TIPO";
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
