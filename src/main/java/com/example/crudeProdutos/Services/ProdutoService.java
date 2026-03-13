package com.example.crudeProdutos.Services;

import com.example.crudeProdutos.Models.ProdutoModels;
import com.example.crudeProdutos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //add
    public ProdutoModels adicionar(ProdutoModels produtoModels){
        return produtoRepository.save(produtoModels);
    }

    //bucar
    public List<ProdutoModels> buscarTodos(){
        return produtoRepository.findAll();
    }

    //deletar
    public void deletar(Long id){
         produtoRepository.deleteById(id);
    }

    //atualizar
    public ProdutoModels atualizar(Long id, ProdutoModels produtoModels){
        ProdutoModels novo = produtoRepository.findById(id).get();
        novo.setNome(produtoModels.getNome());
        novo.setPreco(produtoModels.getPreco());
        novo.setQuantidadeEmEstoque(produtoModels.getQuantidadeEmEstoque());
        return produtoRepository.save(novo);
    }

}
