package com.queiroz.Gerenciamento_Pedidos.services;

import com.queiroz.Gerenciamento_Pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
}
