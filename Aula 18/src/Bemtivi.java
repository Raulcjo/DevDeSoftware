
public class Bemtivi implements Anda, Voa{
	
	private int posX;
	private int posY;
	private int altura;
	
	public Bemtivi() {
		
	}
	
	public Bemtivi(int posX, int posY, int altura) {
		this.posX = posX;
		this.posY = posY;
		this.altura = altura;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void subir(int altura) {
		this.altura += altura;
	}

	public void descer(int altura) {
		this.altura -= altura;
	}

	public void avancar(int x, int y) {
		posX += x;
		posY += y;
	}

	public void recuar(int x, int y) {
		posX -= x;
		posY -= y;
	}

}
