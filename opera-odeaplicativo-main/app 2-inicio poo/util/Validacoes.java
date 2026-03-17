package com.sgp.util;
public class Validacoes {



    private Validacoes(){

    }

     public static boolean marcaValido(String marca) {
        return !( marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
     }


     public static String mensagemErroMarca(string marca) {
        if (marca == null || marca.trim().isEmpty()) {
            return "A marca não pode ser nula ou vazia.";
        } else if (marca.matches(".*\\d+.*")) {
            return "A marca não pode conter números.";
        }
        return "";
      
     }


     public static boolean modeloValido(String modelo) {
        return !(modelo == null || modelo.trim().isEmpty() || modelo.matches(".*\\d+.*"));
     }


       public static String mensagemErroModelo(String modelo) {
         if (modelo == null || modelo.trim().isEmpty()) {
               return "O modelo não pode ser nulo ou vazio.";
         } else if (modelo.matches(".*\\d+.*")) {
               return "O modelo não pode conter números.";
         }
         return "";
       }

       public static boolean anoValido(int ano) {
        return ano > 1885 && ano <= java.time.Year.now().getValue();
      
       }
       public static String mensagemErroAno(int ano) {
        if (ano <= 1885) {
            return "O ano deve ser maior que 1885.";
        } else if (ano > java.time.Year.now().getValue()) {
            return "O ano não pode ser no futuro.";
        }
        return "";
       }
      
}