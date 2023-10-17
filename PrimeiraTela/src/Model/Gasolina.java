package Model;

public class Gasolina {
	public float CalcGasolina(float Preco, float Dinheiro) {
		float LitroGas = Dinheiro / Preco;
		return LitroGas;
	}

}
