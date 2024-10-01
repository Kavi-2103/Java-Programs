package task_5;
abstract class Person{
	abstract void eat();
	abstract void exercise();
}
class Athlete extends Person{
	String name;
	public Athlete(String name) {
		this.name=name;
	}
	void eat() {
		System.out.println(name+" eat's healthy food with lots of nutritions and vitamins");
	}
	void exercise() {
		System.out.println(name+" exercise's regularly and maintain's good diet");
	}
}
class LazyPerson extends Person{
	String name;
	public LazyPerson(String name) {
		this.name=name;
	}
	void eat() {
		System.out.println(name+" eat's lot of snacks and street food");
	}
	void exercise() {
		System.out.println(name+" exercise's rarely and lazing around by time passing");
	}
}
public class HealthAbstraction {

	public static void main(String[] args) {
		Person athlete=new Athlete("Aravind");
		Person lazyperson=new LazyPerson("Ram");
		athlete.eat();
		athlete.exercise();
		System.out.println();
		lazyperson.eat();
		lazyperson.exercise();
	}

}
