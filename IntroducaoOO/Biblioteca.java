class Biblioteca{
	public static void main(String args[]){
		Autor machadoAssis = new Autor("ASSIS", "Machado de");
		
		Autor aluisioAzevedo = new Autor("AZEVEDO", "Aluísio");

		Editora abril = new Editora("Editora Abril", "São Paulo");
		
		Livro domCasmurro = new Livro("Dom Casmurro", machadoAssis, abril, 1899);
		
		Livro memoriasPostumas = new Livro("Memórias Póstumas de Brás Cubas", machadoAssis, abril, 1881);
	
		Livro oCortico = new Livro("O Cortiço", aluisioAzevedo, abril, 1890);
		
		System.out.println(domCasmurro.recuperarReferenciaBibliografica());
		System.out.println(memoriasPostumas.recuperarReferenciaBibliografica());
		System.out.println(oCortico.recuperarReferenciaBibliografica());
		
		System.out.println("========================");
		
		System.out.println(domCasmurro.getNome() + " Acervo = " + domCasmurro.getUnidadesAcervo());

		boolean livroFoiEmprestado = domCasmurro.emprestarLivro();
		System.out.println("Livro foi emprestado: " +livroFoiEmprestado);
		System.out.println(domCasmurro.getNome()+ " Quantidade emprestadas = " +domCasmurro.getUnidadesEmprestadas());

		livroFoiEmprestado = domCasmurro.emprestarLivro();
		System.out.println("Livro foi emprestado: " +livroFoiEmprestado);
		System.out.println(domCasmurro.getNome()+ " Quantidade emprestadas = " +domCasmurro.getUnidadesEmprestadas());

	}
}
