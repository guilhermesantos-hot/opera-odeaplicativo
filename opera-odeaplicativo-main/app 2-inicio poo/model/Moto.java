 package model;

public class Moto {

    private String marca;
    private String modelo;
    private int ano;

    public Moto() {
        this.marca = "Yamaha";
        this.modelo = "factor";
        this.ano = 2022;
    }

    public Moto(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void saudacao() {
        System.out.println("Olá, " + marca + "!" + "Qual é o" + modelo + "ano.");
    }

     public  String getMarca() {
    return marca;
    }
    public string getModelo() {
    return modelo;
     }

    public int getAno() {
    return ano
    }
    public void setMarca(String marca) {
    this.marca = marca;
    }
    public void setModelo (String modelo) {
    this.modelo = modelo;
    }
     public void setAno (int ano) {
    this.ano = ano;
    }

     @Override
    public String toString() {
    return "Moto [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
    }

}