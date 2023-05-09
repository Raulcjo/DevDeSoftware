
public class Retangulo extends Form{
	
	private double base;
	
	private double altura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return base*altura;
	}

	public double calcularPerimetro() {
		return 2*(base+altura);
	}

	
}
