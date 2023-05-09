
public class Tartaruga implements Anda{

	private int posX;
	private int posY;
	
	public Tartaruga() {
		
	}
	
	public Tartaruga(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
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

	public void avancar(int x, int y) {
		posX += x;
		posY += y;
	}

	public void recuar(int x, int y) {
		posX -= x;
		posY -= y;
	}

}
