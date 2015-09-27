// Generated from C:\Users\Marcus\Downloads\comp2\T1\src\t1\LA.g4 by ANTLR 4.2.2
package t1;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LAParser}.
 */
public interface LAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LAParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(@NotNull LAParser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(@NotNull LAParser.Chamada_atribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LAParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LAParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(@NotNull LAParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(@NotNull LAParser.Op_multiplicacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(@NotNull LAParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(@NotNull LAParser.Intervalo_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(@NotNull LAParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(@NotNull LAParser.Parcela_logicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LAParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LAParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(@NotNull LAParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(@NotNull LAParser.Outros_termos_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(@NotNull LAParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(@NotNull LAParser.Ponteiros_opcionaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(@NotNull LAParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(@NotNull LAParser.Tipo_basicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull LAParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull LAParser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(@NotNull LAParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(@NotNull LAParser.Op_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(@NotNull LAParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(@NotNull LAParser.Outros_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(@NotNull LAParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(@NotNull LAParser.Outros_fatoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull LAParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull LAParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull LAParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull LAParser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(@NotNull LAParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(@NotNull LAParser.Mais_expressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(@NotNull LAParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(@NotNull LAParser.Declaracao_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(@NotNull LAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(@NotNull LAParser.Parcela_nao_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(@NotNull LAParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(@NotNull LAParser.Mais_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(@NotNull LAParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(@NotNull LAParser.Op_naoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(@NotNull LAParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(@NotNull LAParser.Mais_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LAParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LAParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(@NotNull LAParser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(@NotNull LAParser.Chamada_partesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(@NotNull LAParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(@NotNull LAParser.RegistroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(@NotNull LAParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(@NotNull LAParser.Outros_fatores_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(@NotNull LAParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(@NotNull LAParser.Declaracoes_locaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#decl_local}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local(@NotNull LAParser.Decl_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#decl_local}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local(@NotNull LAParser.Decl_localContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(@NotNull LAParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(@NotNull LAParser.Mais_variaveisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LAParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LAParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(@NotNull LAParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(@NotNull LAParser.Argumentos_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(@NotNull LAParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(@NotNull LAParser.Var_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(@NotNull LAParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(@NotNull LAParser.Outros_termosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(@NotNull LAParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(@NotNull LAParser.Parcela_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull LAParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull LAParser.ConstantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(@NotNull LAParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(@NotNull LAParser.Outras_parcelasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LAParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LAParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(@NotNull LAParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(@NotNull LAParser.Exp_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(@NotNull LAParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(@NotNull LAParser.Tipo_basico_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull LAParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull LAParser.VariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(@NotNull LAParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(@NotNull LAParser.Decl_local_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(@NotNull LAParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(@NotNull LAParser.Numero_intervaloContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(@NotNull LAParser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(@NotNull LAParser.Mais_selecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull LAParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull LAParser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(@NotNull LAParser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(@NotNull LAParser.Mais_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(@NotNull LAParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(@NotNull LAParser.Tipo_estendidoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull LAParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull LAParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull LAParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull LAParser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(@NotNull LAParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(@NotNull LAParser.Op_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(@NotNull LAParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(@NotNull LAParser.Exp_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull LAParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull LAParser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(@NotNull LAParser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(@NotNull LAParser.Mais_constantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(@NotNull LAParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(@NotNull LAParser.Op_adicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull LAParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull LAParser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(@NotNull LAParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(@NotNull LAParser.SelecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LAParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LAParser.IdentificadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LAParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LAParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LAParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LAParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(@NotNull LAParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(@NotNull LAParser.Senao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull LAParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull LAParser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(@NotNull LAParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(@NotNull LAParser.Parametros_opcionalContext ctx);
}