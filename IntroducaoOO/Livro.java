class Livro{
  String nome;
  int anoPublicacao;
  Autor autor;
  String generos;
  Editora editora;
  String isbn;
  float preco;
  int unidadesAcervo = 1;
  private int unidadesEmprestadas = 0;

  void adicionarNovasUnidades(int quantidade){
    unidadesAcervo += quantidade;
  }

  String recuperarDados(){
    String dados = "";

    dados += "Nome: " +nome+ "\n";
    dados += "Ano de publicação: " +anoPublicacao+ "\n";
    dados += "Autor: " +autor.nomeInicial+" "+autor.nomeCitacao+ "\n";
    dados += "Gêneros: " +generos+ "\n";
    dados += "Editora: " +editora.nome+ "\n";
    dados += "ISBN: " +isbn+ "\n";
    dados += "Preço: " +preco+ "\n";
    dados += "Unidades no acervo: " +unidadesAcervo+ "\n";
    dados += "Unidades emprestadas: " +unidadesEmprestadas+ "\n";

    return dados;
  }

  public int getUnidadesEmprestadas(){
    return unidadesEmprestadas;
  }

  boolean emprestarLivro(){
    if(unidadesAcervo > unidadesEmprestadas){
      unidadesEmprestadas++;
      return true;
    }else{
      return false;
    }
  }

  boolean devolverLivro(){
    if(unidadesEmprestadas > 0){
      unidadesEmprestadas--;
      return true;
    }
    else{
      return false;
    }
  }

  String recuperarReferenciaBibliografica(){
    String referencia = "";
    referencia += autor.nomeCitacao+", "+autor.nomeInicial+". ";
    referencia += nome+ ". ";
    referencia += editora.cidade+": ";
    referencia += editora.nome+", ";
    referencia += anoPublicacao+ ".";

    return referencia;
  }
}
