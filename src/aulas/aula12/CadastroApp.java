package aulas.aula12;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        
        Transacao t1 = new Transacao(1, "Saque", 40.0 , LocalDateTime.now(), "Cancelado");
        Transacao t2 = new Transacao(2, "Depósito", 70.0, LocalDateTime.now(), "Finalizado");
        Transacao t3 = new Transacao(3, "Saque", 100.000, LocalDateTime.now(), "Cancelado");

        List <Transacao> listaTransacoes = new ArrayList<>();
        listaTransacoes.add(t1);
        listaTransacoes.add(t2);
        listaTransacoes.add(t3);

        ContaBancaria conta = new ContaBancaria(4, "Isabela", "678910", "001", 210, 100.000, "Corrente", listaTransacoes);

        System.out.println("Conta Bancaria");
        System.out.println("Id: " + conta.id);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número: " + conta.numero);
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("Limite: " + conta.limite);
        System.out.println("Tipo: " + conta.tipo);
        System.out.println("Lista Bancaria: ");

        for (Transacao contaBancaria : conta.transacoes) {
            System.out.println("Id: "+ contaBancaria.id);
            System.out.println("Tipo: " + contaBancaria.tipo);
            System.out.println("Valor: " + contaBancaria.valor);
            System.out.println("Status: " + contaBancaria.status);
        }

    }
    
}
