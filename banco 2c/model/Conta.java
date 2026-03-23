package model;
public class Conta {
    private int numero; //numero da conta (int)
    private String titular; //titular (texto)
    private double saldo; //saldo (double)

    //iniciar saldo com 0
    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;


    }
    //Depositar somente valores 
    // positivos
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    //retirar somente se tiver
    //saldo disponivel
    public void sacar(double valor){
        if (valor > 0 && saldo <=valor) {
            saldo -= valor;
        }
    }



    //geta

    //ToString()
}
