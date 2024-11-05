package giveMilk.models;

import java.util.List;

public class Fazenda {
	
	private String nome;
	private String endereco;
	private Animal animal;  
	private Tanque tanque;  
	double totalProducao = 0;
	
	public Fazenda(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public void registrarAnimal(Animal animal) {
		System.out.println("A fazenda "+this.nome+" cadastrou a vaca "
							+animal.getNome()+" da raça: "+animal.getRaca());
	}
	
	public void registrarTanque(Tanque tanque) {
		System.out.println("A fazenda "+this.nome+" cadastrou o tanque "
							+tanque.getID()+" com capacidade de: "+tanque.getCapacidadeMaxima());
	}
	
	public double producaoTotalFazenda(List<Animal> animalList) {
		for(Animal animal : animalList) {
			totalProducao += animal.registrarProducao();
		}
		System.out.println("A produção diaria total da fazenda foi: "+totalProducao+"L de leite quentinho"); 
		return totalProducao;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}
	
}
