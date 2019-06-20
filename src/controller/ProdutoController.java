package controller;

import java.util.List;

import model.Produto;

public interface ProdutoController {
	public void adicionarProduto(Produto produto);
	public void atualizarProduto(long id, Produto produto);
	public void removerProduto(long id);
	public List<Produto> pesquisarProdutosPorNome(String nome);
}
