package com.sgp.util;
public class Validacoes {



    private Validacoes(){

    }

     public static boolean marcaValido(String marca) {
        return !( marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
     }









}