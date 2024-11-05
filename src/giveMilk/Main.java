package giveMilk;

import giveMilk.models.Animal;
import giveMilk.models.Fazenda;
import giveMilk.models.Tanque;

public class Main {
	public static void main(String[] args) {
		
		Fazenda fazenda = new Fazenda("QueroLeite", "Xique-Xique - BA");
		
		Tanque tanque1 = new Tanque(1, 20);
		Tanque tanque2 = new Tanque(2, 15);
		fazenda.registrarTanque(tanque1);
		fazenda.registrarTanque(tanque2);
		
		Animal animal1 = new Animal(1, "Nelore", "Fernando", 5, 10);
		Animal animal2 = new Animal(2, "Nelore", "Davi", 3, 10);
		Animal animal3 = new Animal(3, "Nelore", "Olenildo", 4, 30);
		
		fazenda.registrarAnimal(animal1);
		fazenda.registrarAnimal(animal2);
		fazenda.registrarAnimal(animal3);
		
		fazenda.distribuirLeiteNosTanques();  
	}
}
