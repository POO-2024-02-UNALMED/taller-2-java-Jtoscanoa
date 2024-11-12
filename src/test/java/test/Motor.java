package test;
//Autor: Jose Mauricio Toscano Aguas, Universidad Nacional de Colombia Sede Medellín
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	public void cambiarRegistro(int valor) {
		this.registro = valor;
	}
	public void asignarTipo(String cambioT) {
		if (cambioT == "electrico" || cambioT == "gasolina") {
		this.tipo = cambioT;
		}
	}
}
