package org.example;
/*
titular
agencia
numero
saldo
 */
public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    /*o saldo so pode ser alterado se houver saque ou deposito
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     */
    public void realizarSaque(double saque){
        if(saque <= 0){
            throw new IllegalArgumentException("O valor do saque tem que ser superior a R$0,00");
        }
        if(saldo < saque){
            throw new IllegalArgumentException("Saldo indisponível.");
        }
        saldo -= saque;
    }
    public void realizarDeposito(double deposito){
        if(deposito < 0){
            throw new IllegalArgumentException("O valor do depósito tem que ser superior a R$0,00");
        }
        saldo += deposito;
    }

    public void imprimirInformacoesBancarias(){
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Número da conta: %d%n", getNumero());
        System.out.printf("Saldo: %.2f%n", getSaldo());

    }
}
