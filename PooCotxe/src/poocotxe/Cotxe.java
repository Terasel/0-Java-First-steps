package poocotxe;

public class Cotxe {

	private String color = "";
	private String marca = "";
	private String model = "";
	private int motor = 0;
	private int velocitat;
	private int id;
	static private int idSeguent = 1;
	
	public Cotxe(String marca, String model, int motor) {
		this.color = "verd";
		this.marca = marca;
		this.model = model;
		this.motor = motor;
		this.velocitat = 0;
		this.id = Cotxe.idSeguent;
		Cotxe.idSeguent = this.id + 1;
	}
	
	public Cotxe(String color, String marca, String model, int motor) {
		this.color = color;
		this.marca = marca;
		this.model = model;
		this.motor = motor;
		this.velocitat = 0;
		this.id = Cotxe.idSeguent;
		Cotxe.idSeguent = this.id + 1;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getMotor() {
		return this.motor;
	}
	
	public int getVelocitat() {
		return this.velocitat;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMotor(int motor) {
		this.motor = motor;
	}
	
	public void setVelocitat(int velocitat) {
		this.velocitat = velocitat;
	}
	
	public void accelerar() {
		this.velocitat += 10;
	}
	
	public void frenar() {
		this.velocitat -= 5;
	}
	
	public String toString() {
		return "Sóc un cotxe amb l'id " + this.id + " de color " + this.color + " de la marca " + this.marca + 
				" i del model " + this.model + " amb un motor " + this.motor + " c.c"
				+ " i circulo a " + this.velocitat + " Kh/h.";
	}
	
}
