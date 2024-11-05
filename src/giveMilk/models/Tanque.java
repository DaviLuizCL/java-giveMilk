package giveMilk.models;

public class Tanque {

	private int ID;
	private int capacidadeMaxima;
	private int quantidadeAtual;
	private int validadeLeite;
	private double leiteArmazenado;
	private Fazenda fazenda;

	public Tanque(int iD, int capacidadeMaxima, int quantidadeAtual, int validadeLeite, Fazenda fazenda) {
		super();
		ID = iD;
		this.capacidadeMaxima = capacidadeMaxima;
		this.quantidadeAtual = quantidadeAtual;
		this.validadeLeite = validadeLeite;
		this.fazenda = fazenda;
	}

	public double armazenarLeite(Fazenda fazenda) {
		leiteArmazenado =+ fazenda.totalProducao;
		if(capacidadeMaxima > leiteArmazenado) {
			System.out.println("A quantidade de leite armazenada no tanque "+ID+" foi: "+leiteArmazenado+"L.");
			return leiteArmazenado;
		}else {
			System.out.println("ERRO! A quantidade de leite máxima possível no tanque "+ID+" é "+capacidadeMaxima+"L.");
			return 0;
		}
	}
	public double removerleite(double quantidade, Tanque tanque) {
		if(tanque.leiteArmazenado < quantidade) {
			System.out.println("A quantidade de retirada é superior ao existente no tanque.");
			return 0;
		}else {
			System.out.println("Foi retirado "+ quantidade + "L do tanque " + tanque.ID);
			return tanque.leiteArmazenado =- quantidade;
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
	
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}

	public int getValidadeLeite() {
		return validadeLeite;
	}

	public void setValidadeLeite(int validadeLeite) {
		this.validadeLeite = validadeLeite;
	}

	public Fazenda getFazenda() {
		return fazenda;
	}

	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}
	
	
	
}
