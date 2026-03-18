# Exercício 03: Gerenciamento de Pedidos

## Enunciado
 Crie um serviço RESTful em Spring Boot para gerenciar pedidos. O objetivo é praticar mapeamento JPA com tipos de data/hora e operações CRUD.

## Entidade: Pedido

| Atributo   | Tipo          | Descrição                                             |
| :---       | :---          | :---                                                  |
| id         | Long          | Identificador único (chave primária, auto-gerado)     |
| data       | LocalDateTime | Data e hora do pedido                                 |
| valorTotal | BigDecimal    | Valor total do pedido                                 |
| status     | String        | Status do pedido (ex: PENDENTE, CONFIRMADO, ENTREGUE) |

## Requisitos
1. Crie uma entidade JPA chamada Pedido com os atributos especificados
2. Configure o nome da entidade JPA como Pedido
3. Configure o nome da tabela no banco como tb_pedido
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /pedidos — criar novo pedido
* GET /pedidos — listar todos os pedidos
* GET /pedidos/{id} — buscar pedido por ID
* DELETE /pedidos/{id} — deletar pedido por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
