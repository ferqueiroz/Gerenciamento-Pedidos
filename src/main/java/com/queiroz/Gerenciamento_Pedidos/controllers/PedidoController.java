package com.queiroz.Gerenciamento_Pedidos.controllers;

import com.queiroz.Gerenciamento_Pedidos.models.PedidoModel;
import com.queiroz.Gerenciamento_Pedidos.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoModel> criar(PedidoModel pedidoModel) {
        return ResponseEntity.status(201).body(pedidoService.criar(pedidoModel));
    }

    @GetMapping
    public ResponseEntity<List<PedidoModel>> listar() {
        return ResponseEntity.ok().body(pedidoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> buscar(@PathVariable Long id) {
        Optional<PedidoModel> livro = pedidoService.buscar(id);

        if (livro.isPresent())
            return ResponseEntity.ok().body(livro.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PedidoModel> deletar(@PathVariable Long id) {
        pedidoService.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
