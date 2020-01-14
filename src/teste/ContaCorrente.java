package teste;

public class ContaCorrente extends ContaBancaria {
    Double chequeEspecial = 2000.0;


    @Override
    public void transferencia(ContaInter destino, Double valor) {
        if (valor > 0 && valor <= 2000 && valor <= (saldo+chequeEspecial)) {
            this.saque(valor);
            destino.deposito(valor);
        }
    }

    @Override
    public void saque(Double valor) {
        if (valor > 0 && valor <= 2000 && valor <= (saldo+chequeEspecial)) {
            this.saldo -= valor;
        }
    }

    public void pagamento (Double valor) {
            this.saque(valor);
        }

    }

