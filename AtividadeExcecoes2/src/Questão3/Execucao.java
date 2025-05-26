package Questão3;

public class Execucao {
    public static void main(String[] args) {
        try {
            Data d1 = new Data(15, 3, 2025);
            d1.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d2 = new Data(31, 4, 2025);
            d2.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d3 = new Data(29, 2, 2025);
            d3.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d4 = new Data(0, 1, 2025);
            d4.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d5 = new Data(10, 13, 2025);
            d5.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d6 = new Data(10, 10, 0);
            d6.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }

        try {
            Data d7 = new Data(30, 6, 2025);
            d7.imprimirData();
        } catch (DataException e) {
            System.out.println(e);
        }
    }
}