
public class TesteAnda {
	public static void main(String[] args) {

		Tartaruga t1 = new Tartaruga();
		Tartaruga t2 = new Tartaruga();
		t1.avancar(5, 6);
		t2.avancar(2, 3);

		Bemtivi b1 = new Bemtivi();
		Bemtivi b2 = new Bemtivi();
		b1.subir(4);
		b1.avancar(1, 3);

		b2.avancar(1, 2);
		b2.subir(3);

		System.out.println("Tartaruga 1 está na posição: " + t1.getPosX() + "," + t1.getPosY());

	}
}
