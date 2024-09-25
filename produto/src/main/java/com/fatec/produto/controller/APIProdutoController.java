package com.fatec.produto.controller;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.produto.model.Produto;
@CrossOrigin("*") // desabilita o cors do spring security
@RestController
@RequestMapping("/api/v1/produtos")
public class APIProdutoController {
	Logger logger = LogManager.getLogger(this.getClass());
	

	record ProdutoDTO(String descricao, String categoria, String custo, String quantidadeNoEstoque) {
	};
	@PostMapping
	public ResponseEntity<Object> cadastrar(@RequestBody ProdutoDTO p) {
		logger.info(">>>>>> apicontroller cadastrar produto iniciado...");
		Produto produto1 = new Produto(p.descricao, p.categoria, p.custo, p.quantidadeNoEstoque);
		produto1.setId(1L);
		return ResponseEntity.status(HttpStatus.CREATED).body(produto1);
		
	}
}
