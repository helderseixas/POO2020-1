class Livro{
	private String nome;
	private int anoPublicacao;
	private Autor autor;
	private String generos;
	private Editora editora;
	private String isbn;
	private float preco;
	private int unidadesAcervo;
	private int unidadesEmprestadas;

	private static int totalLivrosBiblioteca = 0;
	
	public Livro(String nome, Autor autor, Editora editora, int anoPublicacao){
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.unidadesAcervo = 1;
		this.unidadesEmprestadas = 0;
		
		totalLivrosBiblioteca++;
	}

	public String getNome(){
		return nome;
	}	

	public int getUnidadesAcervo(){
		return unidadesAcervo;
	}

	public int getUnidadesEmprestadas(){
		return unidadesEmprestadas;
	}

	public static int getTotalLivrosBiblioteca(){
		return Livro.totalLivrosBiblioteca;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setAnoPublicacao(int anoPublicacao){
		this.anoPublicacao = anoPublicacao;
	}
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public void setGeneros(String generos){
		this.generos = generos;
	}
	
	public void setEditora(Editora editora){
		this.editora = editora;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public void setPreco(float preco){
		if(preco > 0.0){
			this.preco = preco;
		}
	}	

	public void adicionarNovasUnidades(int quantidade){
		if(quantidade > 0){
			unidadesAcervo += quantidade;
			totalLivrosBiblioteca += quantidade;
		}
	}

	public String recuperarDados(){
		String dados = "";

		dados += "Nome: " +nome+ "\n";
		dados += "Ano de publicação: " +anoPublicacao+ "\n";
		dados += "Autor: " +autor.getNomeInicial()+" "+autor.getNomeCitacao()+ "\n";
		dados += "Gêneros: " +generos+ "\n";
		dados += "Editora: " +editora.getNome()+ "\n";
		dados += "ISBN: " +isbn+ "\n";
		dados += "Preço: " +preco+ "\n";
		dados += "Unidades no acervo: " +unidadesAcervo+ "\n";
		dados += "Unidades emprestadas: " +unidadesEmprestadas+ "\n";

		return dados;
	}

	public boolean emprestarLivro(){
		if(unidadesAcervo > unidadesEmprestadas){
			unidadesEmprestadas++;
			return true;
		}else{
			return false;
		}
	}

	public boolean devolverLivro(){
		if(unidadesEmprestadas > 0){
			unidadesEmprestadas--;
			return true;
		}else{
			return false;
		}
	}

	public String recuperarReferenciaBibliografica(){
		String referencia = "";
		referencia += autor.getNomeCitacao()+", "+autor.getNomeInicial()+". ";
		referencia += nome+ ". ";
		referencia += editora.getCidade()+": ";
		referencia += editora.getNome()+", ";
		referencia += anoPublicacao+ ".";

		return referencia;
	}
}
