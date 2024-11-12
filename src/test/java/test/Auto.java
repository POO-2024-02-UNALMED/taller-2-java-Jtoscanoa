package test;
public class Auto {
	String  modelo;
	int precio;
	Asiento[] asientos;
	Asiento a;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	public int cantidadAsientos() {
		int i = 0;
		if (asientos != null) {
			for (Asiento asiento: asientos) {
				if (asiento != null) {
					i++;
				}
			}
		}
		return i;
	}
	public String verificarIntegridad() {
		if (motor == null || asientos == null) {
			return "Las piezas no son originales";
		}
		else if (asientos != null && (a.registro != registro || motor.registro != registro)){
			return "Las piezas no son originales";
		}
		return "Auto original";
	}
}
//Autor: Jose Mauricio Toscano Aguas, Universidad Nacional de Colombia Sede Medellín