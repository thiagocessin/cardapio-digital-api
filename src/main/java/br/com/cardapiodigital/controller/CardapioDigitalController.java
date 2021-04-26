package br.com.cardapiodigital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardapiodigital.dto.PedidoDTO;
import br.com.cardapiodigital.dto.ProdutoCardapioDTO;
import br.com.cardapiodigital.dto.RestauranteDTO;

@RestController
@RequestMapping("cardapios")
public class CardapioDigitalController {
//
//	// PEDIDOS
//	@GetMapping("/pedidos")
//	public List<PedidoDTO> listarPedidos() {
//		return new ArrayList<PedidoDTO>();
//	}
//
//	@GetMapping("/pedidos/{id}")
//	public List<PedidoDTO> listarPedidoById() {
//		return new ArrayList<PedidoDTO>();
//	}
//
//	@PostMapping("/pedidos")
//	@ResponseStatus(HttpStatus.CREATED)
//	public PedidoDTO criarPedido(@RequestBody PedidoDTO pedido) {
//		return pedido;
//	}
//
//	@PutMapping("/pedidos/{id}")
//	public PedidoDTO atualizarPedido(@RequestBody PedidoDTO pedido) {
//		return pedido;
//	}
//
//	@DeleteMapping("/pedidos/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void apagarPedido(@PathVariable Long id) {
//
//	}
//
//	// PRODUTO CARDAPIO
//	@GetMapping("/produtos/{id-restaurante}")
//	public List<ProdutoCardapioDTO> listarProdutoCardapio() {
//		return new ArrayList<ProdutoCardapioDTO>();
//	}
//
//	@GetMapping("/produtos/{id-prod-cardapio}")
//	public List<ProdutoCardapioDTO> listarProdutoCardapioById() {
//		return new ArrayList<ProdutoCardapioDTO>();
//	}
//
//	@PostMapping("/produtos")
//	@ResponseStatus(HttpStatus.CREATED)
//	public ProdutoCardapioDTO criarProdutoCardapio(@RequestBody ProdutoCardapioDTO produto) {
//		return produto;
//
//	}
//
//	@PutMapping("{id-prod-cardapio}")
//	public ProdutoCardapioDTO atualizarProdutoCardapio(@RequestBody ProdutoCardapioDTO produto) {
//		return produto;
//	}
//
//	@DeleteMapping("{id-prod-cardapio}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void apagarProdutoCardapio(@PathVariable Long id) {
//
//	}
//
//	// RESTAURANTE
//	@GetMapping("listarRestaurantes")
//	public List<RestauranteDTO> listarRestaurantes() {
//		return new ArrayList<RestauranteDTO>();
//	}
//
//	@GetMapping("{id-restaurante}")
//	public List<RestauranteDTO> listarRestaurantesById() {
//		return new ArrayList<RestauranteDTO>();
//	}
//
//	@PostMapping("criarRestaurante")
//	@ResponseStatus(HttpStatus.CREATED)
//	public RestauranteDTO criarRestaurante(@RequestBody RestauranteDTO restaurante) {
//		return restaurante;
//
//	}
//
//	@PutMapping("{id-restaurante}")
//	public RestauranteDTO atualizarRestaurante(@RequestBody RestauranteDTO restaurante) {
//		return restaurante;
//	}
//
//	@DeleteMapping("{id-restaurante}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void apagarRestaurante(@PathVariable Long id) {
//
//	}

}
