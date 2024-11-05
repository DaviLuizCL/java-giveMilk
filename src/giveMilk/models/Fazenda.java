package giveMilk.models;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
	
	private String nome;
	private String endereco;
	private List<Animal> animais = new ArrayList<>();
	private List<Tanque> tanques = new ArrayList<>();
	
	public Fazenda(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public void registrarAnimal(Animal animal) {
		animais.add(animal);
		System.out.println("A fazenda " + this.nome + " cadastrou a vaca "
							+ animal.getNome() + " da raça: " + animal.getRaca());
	}
	
	public void registrarTanque(Tanque tanque) {
		tanques.add(tanque);
		System.out.println("A fazenda " + this.nome + " cadastrou o tanque "
							+ tanque.getID() + " com capacidade de: " + tanque.getCapacidadeMaxima() + "L");
	}
	
	public double producaoTotalFazenda() {
		double totalProducao = 0;
		for (Animal animal : animais) {
			totalProducao += animal.registrarProducao();
		}
		System.out.println("A produção diária total da fazenda foi: " + totalProducao + "L de leite.");
		return totalProducao;
	}

	public void distribuirLeiteNosTanques() {
		double producaoTotal = producaoTotalFazenda();
		for (Tanque tanque : tanques) {
			if (producaoTotal <= 0) break;
			producaoTotal = tanque.armazenarLeite(producaoTotal);
		}
		if (producaoTotal > 0) {
			System.out.println(producaoTotal + "L de leite excedente. Todos os tanques estão cheios.");
		}
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

	public List<Animal> getAnimais() {
		return animais;
	}

	public List<Tanque> getTanques() {
		return tanques;
	}
}
