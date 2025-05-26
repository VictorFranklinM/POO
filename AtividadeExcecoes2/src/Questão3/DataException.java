package Questão3;

public class DataException extends Exception {
    private int dia, mes, ano;

    public DataException(int dia, int mes, int ano, String mensagem) {
        super(mensagem);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data inválida: "+dia+"/"+mes+"/"+ano+" "+getMessage();
    }
}
