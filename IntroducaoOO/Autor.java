class Autor{
	private String nomeCitacao;
	private String nomeInicial;
	
	public Autor(String nomeCitacao, String nomeInicial){
		this.nomeCitacao = nomeCitacao;
		this.nomeInicial = nomeInicial;
	}
	
	public String getNomeCitacao(){
		return nomeCitacao;
	}
	
	public String getNomeInicial(){
		return nomeInicial;
	}
}
