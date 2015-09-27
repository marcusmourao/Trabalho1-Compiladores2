/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t1;

/**
 *
 * @author Marcus
 */
public class GeradorDeCodigo extends LABaseListener {

    @Override
    public void enterCmd(LAParser.CmdContext ctx) {
        if(ctx.tipoCmd.equals("leia")) {
            System.out.println("scanf(&"+ctx.identificador().txt+");");
        }
    }

  
    
    
    
}
