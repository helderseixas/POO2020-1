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

		Livro memoriaPostumas = new Livro();
		memoriaPostumas.nome = "Memória Póstumas de Brás Cubas";
		memoriaPostumas.anoPublicacao = 1881;
		memoriaPostumas.autor = "Machado de Assis";
		memoriaPostumas.generos = "Romance, Ficção";
		memoriaPostumas.editora = "Oxford University Press";
		memoriaPostumas.isbn = "9788496356979";
		memoriaPostumas.preco = 27.92f;
		
		Livro cortico  = new Livro();
		cortico.nome = "O cortiço";
		cortico.anoPublicacao = 1890;
		cortico.autor = "Aluísio Azevedo";
		cortico.generos = "Romance,Ficção, Literatura do naturalismo";
		cortico.editora = "B. L. Garnier";
		cortico.isbn = "9788888302423";
		cortico.preco = 26.10f;
	}	
}
