package Modelo;

public class CalcRetangulo {
	public float CalcularP(float Altura, float Base) {
		float PerimetroCalc = 2 * (Altura + Base);
		return PerimetroCalc;
	}
	public float CalcularA(float Altura, float Base) {
		float AlturaCalc = Altura * Base;
		return AlturaCalc;
	}
}
