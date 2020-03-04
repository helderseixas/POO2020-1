class Biblioteca{
  public static void main(String args[]){

    Autor machadoAssis = new Autor();
    machadoAssis.nomeCitacao = "ASSIS";
    machadoAssis.nomeInicial = "Machado de";

    Autor aluisioAzevedo = new Autor();
    aluisioAzevedo.nomeCitacao = "AZEVEDO";
    aluisioAzevedo.nomeInicial = "Aluísio";

    Editora abril = new Editora();
    abril.nome = "Editora Abril";
    abril.cidade = "São Paulo";

    Livro domCasmurro = new Livro();
    domCasmurro.nome = "Dom Casmurro";
    domCasmurro.anoPublicacao = 1899;
    domCasmurro.autor = machadoAssis;
    domCasmurro.generos = "Romance, Ficção, Memórias, Realismo Literário";
    domCasmurro.editora = abril;
    domCasmurro.isbn = "8572322647";
    domCasmurro.preco = 26.10f;

    Livro memoriasPostumas = new Livro();
    memoriasPostumas.nome = "Memórias Póstumas de Brás Cubas";
    memoriasPostumas.anoPublicacao = 1881;
    memoriasPostumas.autor = machadoAssis;
    memoriasPostumas.generos = "Romance, Ficção";
    memoriasPostumas.editora = abril;
    memoriasPostumas.isbn = "9788496356979";
    memoriasPostumas.preco = 27.92f;

    Livro oCortico = new Livro();
    oCortico.nome = "O Cortiço";
    oCortico.anoPublicacao = 1890;
    oCortico.autor = aluisioAzevedo;
    oCortico.generos = "Romance, Ficção, Literatura do Naturalismo";
    oCortico.editora = abril;
    oCortico.isbn = "9788888302423";
    oCortico.preco = 26.10f;

    System.out.println(domCasmurro.nome + " Acervo = " + domCasmurro.unidadesAcervo);

    boolean livroFoiEmprestado = domCasmurro.emprestarLivro();
    System.out.println("Livro foi emprestado: " +livroFoiEmprestado);
    System.out.println(domCasmurro.nome+ " Quantidade emprestadas = " +domCasmurro.getUnidadesEmprestadas());

    livroFoiEmprestado = domCasmurro.emprestarLivro();
    System.out.println("Livro foi emprestado: " +livroFoiEmprestado);
    System.out.println(domCasmurro.nome+ " Quantidade emprestadas = " +domCasmurro.getUnidadesEmprestadas());

  }
}
