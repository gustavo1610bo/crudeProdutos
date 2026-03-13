package com.example.crudeProdutos.Controller;

import com.example.crudeProdutos.Models.ProdutoModels;
import com.example.crudeProdutos.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModels criar(ProdutoModels produtoModels){
        return produtoService.adicionar(produtoModels);
    }

    @GetMapping
    public List<ProdutoModels> buscarTodos(){
        return produtoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtoService.deletar(id);
    }

    @PutMapping("/{id}")
    public ProdutoModels atualizar(@PathVariable Long id,@RequestBody ProdutoModels produtoModels){
        return produtoService.atualizar(id, produtoModels);
    }



}
