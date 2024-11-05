package giveMilk.models;

public class Tanque {

	private int ID;
	private int capacidadeMaxima;
	private double leiteArmazenado;
	
	public Tanque(int iD, int capacidadeMaxima) {
		this.ID = iD;
		this.capacidadeMaxima = capacidadeMaxima;
		this.leiteArmazenado = 0;
	}

	public double armazenarLeite(double quantidadeLeite) {
		double espacoDisponivel = capacidadeMaxima - leiteArmazenado;
		if (quantidadeLeite <= espacoDisponivel) {
			leiteArmazenado += quantidadeLeite;
			System.out.println("Armazenado " + quantidadeLeite + "L no tanque " + ID + ". Total no tanque: " + leiteArmazenado + "L.");
			return 0; 
		} else {
			leiteArmazenado = capacidadeMaxima;
			System.out.println("Armazenado " + espacoDisponivel + "L no tanque " + ID + ". Total no tanque: " + capacidadeMaxima + "L.");
			return quantidadeLeite - espacoDisponivel; 
		}
	}

	public void removerLeite(double quantidade) {
		if (leiteArmazenado >= quantidade) {
			leiteArmazenado -= quantidade;
			System.out.println("Foram retirados " + quantidade + "L do tanque " + ID + ". Restam " + leiteArmazenado + "L.");
		} else {
			System.out.println("A quantidade de retirada é superior ao volume de leite armazenado.");
		}
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public double getLeiteArmazenado() {
		return leiteArmazenado;
	}

	public void setLeiteArmazenado(double leiteArmazenado) {
		this.leiteArmazenado = leiteArmazenado;
	}
}
