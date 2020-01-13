package teste;

public interface ContaInter {
        Double saldo();
        void transferencia(ContaInter destino, Double valor);
        void saque(Double valor);
        void deposito(Double valor);
    }
