class Livro{
	String nome;
	int anoPublicacao;
	String autor;
	String generos;
	String editora;
	String isbn;
	float preco;
	int unidadesAcervo = 1;
	int unidadesEmprestadas;
	
	void adicionarNovasUnidades(int quantidade){
		unidadesAcervo += quantidade;	
	}
	
	String recuperarDados(){
	String dados = "";
	dados+= "Nome:" + nome + "\n" +
	"Ano de publicação:" + anoPublicacao + "\n" + 
	"Autor:" + autor + "\n" + 
	"Generos:" + generos + "\n" +
	"Editora:" + editora + "\n" +
	"ISBN:" + isbn + "\n" +
	"Preço:" + preco + "\n" +
	"Unidades no acervo:" + unidadesAcervo + "\n"+
	"Unidade emprestadas:" + unidadesEmprestadas;
	
	return dados;
	}

	boolean emprestar(){
		if (unidadesAcervo > unidadesEmprestadas){
			unidadesEmprestadas++;
			return true;		
		}
		else{
			return false;		
		}
	}
	boolean devolver(){
		unidadesEmprestadas--;
		return true;
	}

}
