package com.queiroz.Gerenciamento_Pedidos.services;

import com.queiroz.Gerenciamento_Pedidos.models.PedidoModel;
import com.queiroz.Gerenciamento_Pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criar(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> listar() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscar(Long id) {
        return pedidoRepository.findById(id);
    }

    public void excluir(Long id) {
        pedidoRepository.deleteById(id);
    }
}
