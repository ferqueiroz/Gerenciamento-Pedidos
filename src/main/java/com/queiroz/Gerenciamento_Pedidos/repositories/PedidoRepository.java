package com.queiroz.Gerenciamento_Pedidos.repositories;

import com.queiroz.Gerenciamento_Pedidos.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
