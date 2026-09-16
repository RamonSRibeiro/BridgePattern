# Padrão Bridge — Veículos e Motores

Implementação do padrão de projeto **Bridge**, separando a hierarquia de veículos da hierarquia de motores, permitindo combinar qualquer veículo com qualquer tipo de motor sem explosão de subclasses.

## Estrutura

**Hierarquia de veículos** (abstração)
- `Veiculo` — classe abstrata, possui uma referência a `Motor`
- `Carro` — herda de `Veiculo`
- `Moto` — herda de `Veiculo`

**Hierarquia de motores** (implementação)
- `Motor` — interface, define o método `ligar()`
- `MotorCombustao` — implementa `Motor`
- `MotorEletrico` — implementa `Motor`

## Como funciona

`Veiculo` não depende de `MotorCombustao` nem de `MotorEletrico` diretamente — apenas da interface `Motor`. Isso permite montar, por exemplo, um `Carro` com `MotorEletrico` ou uma `Moto` com `MotorCombustao`, sem precisar criar uma subclasse para cada combinação.

```
Veiculo (abstrata)          Motor (interface)
├── Carro                   ├── MotorCombustao
└── Moto                    └── MotorEletrico

Veiculo -- possui um --> Motor
```

## Exemplo de uso

```python
carro = Carro(MotorEletrico())
carro.acelerar()

moto = Moto(MotorCombustao())
moto.acelerar()
```

## Diagrama

O diagrama de classes completo (UML) está disponível em `diagrama.png`.
