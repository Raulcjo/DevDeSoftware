import java.util.ArrayList;

public class TestaForma {
	public static void main(String [] args) {
		ArrayList<Form> forms =  new ArrayList<Form>();
		Retangulo r1 = new Retangulo(1,2);
		Retangulo r2 = new Retangulo(3,4);
		forms.add(r1);
		forms.add(r2);
		Circulo c1 = new Circulo(15);
		Circulo c2 = new Circulo(8);
		forms.add(c1);
		forms.add(c2);
		
		for(int i = 0; i < forms.size(); i++) {
			System.out.println("Forma ["+ i +"]");
			System.out.println("Área: " + forms.get(i).calcularArea());
			System.out.println("Perímetro: " + forms.get(i).calcularPerimetro());
			
		}
		
	}
}
