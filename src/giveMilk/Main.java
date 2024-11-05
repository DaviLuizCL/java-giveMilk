package giveMilk;

import java.util.ArrayList;
import java.util.List;

import giveMilk.models.Animal;
import giveMilk.models.Fazenda;
import giveMilk.models.Tanque;

public class Main {
	public static void main(String[] args) {
		
		Fazenda fazenda = new Fazenda("QueroLeite", "Xique-Xique - BA");
		
		Tanque tanque = new Tanque(1, 20, 2, 2025, fazenda);
		
		Animal animal = new Animal(1, "Nelore", "Fernando", 22, 2);
		Animal animal2 = new Animal(1, "Nelore", "Davi", 22, 10);
		Animal animal3 = new Animal(1, "Nelore", "Olenildo", 22, 6);
		
		fazenda.registrarAnimal(animal);
		fazenda.registrarAnimal(animal2);
		fazenda.registrarAnimal(animal3);
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(animal);
		animalList.add(animal2);
		animalList.add(animal3);
		
		tanque.armazenarLeite(fazenda);
		
		Animal animal4 = new Animal(1, "Nelore", "Heitor", 22, 1);
		
		animalList.add(animal4);
		
		fazenda.producaoTotalFazenda(animalList);

		tanque.armazenarLeite(fazenda);
		
		tanque.removerleite(10, tanque);
	}
}
