package Questão3;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) throws DataException {
        if (ano < 1) {
            throw new DataException(dia, mes, ano, "(O ano deve ser maior ou igual a 1)");
        }

        if (mes < 1 || mes > 12) {
            throw new DataException(dia, mes, ano, "(O mês deve estar entre 1 e 12)");
        }

        int maxDias;
        
        switch (mes) {
            case 2:
                maxDias = 28;
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                maxDias = 30;
                break;
                
            default:
                maxDias = 31;
        }

        if (dia < 1 || dia > maxDias) {
            throw new DataException(dia, mes, ano, "(Dia inválido para o mês informado)");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimirData() {
        System.out.println("Data válida: "+dia+"/"+mes+"/"+ano);
    }
}
