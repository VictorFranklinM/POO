import java.time.LocalTime;

public class Relogio {
	private LocalTime tempo;
	
	public void inicializar(int hora, int minuto, int segundo) {
		this.tempo = LocalTime.of(hora, minuto, segundo);
		System.out.println(this.tempo);
	}
	
	public void inicializar(int hora, int minuto) {
		inicializar(hora,minuto,1);
	}
	
	public void inicializar(int hora) {
		inicializar(hora,1,1);
	}
}
