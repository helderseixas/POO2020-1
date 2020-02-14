class Biblioteca{

	public static void main(String args[]){
		Livro domCasmurro = new Livro();
		domCasmurro.nome = "Dom Casmurro";
		domCasmurro.anoPublicacao = 1899;
		domCasmurro.autor = "Machado de Assis";
		domCasmurro.generos = "Romance,Ficção, Memórias, Realismo Literário";
		domCasmurro.editora = "Martin clarete";
		domCasmurro.isbn = "8572322647";
		domCasmurro.preco = 26.10f;

		Livro memoriasPostumas = new Livro();
		memoriasPostumas.nome = "Memória Póstumas de Brás Cubas";
		memoriasPostumas.anoPublicacao = 1881;
		memoriasPostumas.autor = "Machado de Assis";
		memoriasPostumas.generos = "Romance, Ficção";
		memoriasPostumas.editora = "Oxford University Press";
		memoriasPostumas.isbn = "9788496356979";
		memoriasPostumas.preco = 27.92f;
		
		Livro cortico = new Livro();
		cortico.nome = "O cortiço";
		cortico.anoPublicacao = 1890;
		cortico.autor = "Aluísio Azevedo";
		cortico.generos = "Romance,Ficção, Literatura do naturalismo";
		cortico.editora = "B. L. Garnier";
		cortico.isbn = "9788888302423";
		cortico.preco = 26.10f;
				

		System.out.println(domCasmurro.nome + " Acervo = " + domCasmurro.unidadesAcervo);
		System.out.println(memoriasPostumas.nome + " Acervo = " + memoriasPostumas.unidadesAcervo);
		System.out.println(cortico.nome + " Acervo = " + cortico.unidadesAcervo + "\n");
		
		//domCasmurro.adicionarNovasUnidades(10);
		//cortico.adicionarNovasUnidades(4);
		
		//String dados = domCasmurro.recuperarDados();
		//System.out.println(dados);
		
		boolean result = domCasmurro.emprestar();
		if (result == true){	
			System.out.println("Livro emprestado com sucesso!");
		}else{
			System.out.println("Impossível emprestar livro!");		
		}











	}	

}
