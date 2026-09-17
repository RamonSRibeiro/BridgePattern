# Padrão Bridge - Contas Bancárias

Projeto de exemplo do padrão de projeto estrutural **Bridge**, aplicado a um sistema de contas bancárias com diferentes tipos de tarifa.

## Ideia do padrão

O Bridge separa duas coisas que mudam de forma independente:

- **Abstração**: o tipo de conta (`Conta`)
- **Implementação**: o tipo de tarifa (`TipoTarifa`)

Em vez de criar uma classe para cada combinação (ex: `ContaCorrenteBasica`, `ContaCorrentePremium`, `ContaPoupancaBasica`...), cada `Conta` guarda uma referência a um `TipoTarifa`, e as duas hierarquias podem crescer sem se misturar.

## Estrutura

```
Conta (abstrata)
 ├── ContaCorrente
 ├── ContaPoupanca
 └── ContaInvestimento

TipoTarifa (interface)
 ├── TarifaBasica
 ├── TarifaPremium
 ├── TarifaEmpresarial
 └── TarifaIsenta
```

- `Conta` guarda o `saldo` e uma referência a `TipoTarifa`.
- Cada subclasse de `Conta` implementa `calcularSaldoComTarifa()` à sua maneira:
  - `ContaCorrente` **desconta** a tarifa fixa (`valorTarifa()`) do saldo.
  - `ContaPoupanca` e `ContaInvestimento` **somam** um rendimento percentual (`percentualRendimento()`) ao saldo.
- Cada `TipoTarifa` define seu próprio valor de tarifa fixa e percentual de rendimento.

## Como usar

```java
Conta conta = new ContaCorrente(1000.0f);
conta.setTipoTarifa(new TarifaPremium());

float saldoFinal = conta.calcularSaldoComTarifa(); // 975.0
```

## Testes

Os testes (JUnit 5) cobrem todas as combinações de conta x tarifa:

- `ContaCorrenteTest`
- `ContaPoupancaTest`
- `ContaInvestimentoTest`

Para rodar (com Maven, por exemplo):

```bash
mvn test
```
