package bbabank;

public interface AcessoInterno {
	
	//os metodos não tem comportamento, apenas assinatura.
	
	/**
	 * @param String usuario >> pode informar um usuario valido.
	 * @param String senha >> pode informar uma senha com até 255 caracteres alfanumerico
	 * @return verdadeiro quando a senha estiver correta.
	 */
	
	public boolean autenticarSistema(String usuario, String senha);
	
	
	/**		
	 * @param senhaAntiga >> informa a senha antiga.
	 * @param senhaNova >> informa a nova senha do usuario.
	 * @return verdadeiro quando a senha antiga estiver correta e a senha nova tiver 8 ou menos caracteres.
	 */
		
	public boolean mudarSenha (String senhaAntiga, String senhaNova);
	
	/**
	 * @param usuarioAntigo >> informa o usuario antigo
	 * @param usuarioNovo >> informa o novo usuario.
	 * @return verdadeiro quando o usuario antigo estiver correto e o novo usuario tiver 12 ou menos caracteres.
	 */
	
	public boolean mudarUsuario (String usuarioAntigo, String usuarioNovo);
	
	
	
}
