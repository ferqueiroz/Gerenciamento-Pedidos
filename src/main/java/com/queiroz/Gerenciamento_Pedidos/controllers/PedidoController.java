package com.queiroz.Gerenciamento_Pedidos.controllers;

import com.queiroz.Gerenciamento_Pedidos.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
}
