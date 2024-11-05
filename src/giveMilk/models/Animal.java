package giveMilk.models;

public class Animal {
	
	private int ID;
	private String raca;
	private String nome;
	private int idade;
	private double producao;
	private boolean produzLeite = true;
	
	public Animal(int iD, String raca, String nome, int idade, double producao) {
		super();
		ID = iD;
		this.raca = raca;
		this.nome = nome;
		this.idade = idade;
		this.producao = producao;
	}
	
	public double registrarProducao() {
		if(this.produzLeite == true) {
			double producaoDiariaTotal =+ this.producao;
			System.out.println("A produção diaria total da vaca "+ this.nome + " foi: "+producaoDiariaTotal);
			return producaoDiariaTotal;
		}else {
			System.out.println("Não vai ter leitinho quente hoje!");
			return 0;
		}
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getProducao() {
		return producao;
	}

	public void setProducao(double producao) {
		this.producao = producao;
	}

	public boolean isProduzLeite() {
		return produzLeite;
	}

	public void setProduzLeite(boolean produzLeite) {
		this.produzLeite = produzLeite;
	}	
	
	
}
