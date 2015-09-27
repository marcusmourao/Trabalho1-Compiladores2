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
public class VerificadorDeTipos {
    public static String verificaTipo(LAParser.ExpressaoContext ctx) {
        String tipoExp = verificaTipo(ctx.termo_logico());
        if(ctx.outros_termos_logicos() == null) {
            return tipoExp;
        } else {
            for(LAParser.Termo_logicoContext termo : ctx.outros_termos_logicos().termo_logico()) {
                String tipoOutroTermo = verificaTipo(termo);
                tipoExp = regraTipos(tipoExp, tipoOutroTermo);
            }
        }
        return tipoExp;
    }

    public static String verificaTipo(LAParser.Termo_logicoContext ctx) {
        return null;
    }

    private static String regraTipos(String tipoExp, String tipoOutroTermo) {
        if(tipoExp.equals(tipoOutroTermo)) {
            return tipoExp;
        } else if(tipoExp.equals("inteiro") && tipoOutroTermo.equals("real") ||
                tipoExp.equals("real") && tipoOutroTermo.equals("inteiro")) {
            return "real";
        } else {
            return "tipo_incompativel";
        }
    }
}
