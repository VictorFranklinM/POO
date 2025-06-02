package Questão5;

public class Teste {
    public static void main(String[] args) {
        Motorizado aviao = new Aviao();
        Motorizado carro = new Carro();

        aviao.ligarMotor();
        aviao.abastecer(2000);

        carro.ligarMotor();
        carro.abastecer(40);

        Conduzivel aviao2 = new Aviao();
        Conduzivel carro2 = new Carro();
        Conduzivel bicicleta = new Bicicleta();

        aviao2.curvar(30);
        carro2.curvar(45);
        bicicleta.curvar(90);
    }
}
