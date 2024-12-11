package org.example;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("José", "12345678900"));
        conta1.setNumero(123);
        conta1.setAgencia(222);

        conta1.imprimirInformacoesBancarias();

        conta1.realizarDeposito(150);
        conta1.imprimirInformacoesBancarias();

        conta1.realizarSaque(50);
        conta1.imprimirInformacoesBancarias();
    }
}