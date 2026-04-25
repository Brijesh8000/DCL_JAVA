package hierarachiclal;

public class Test {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.name="Biru";
		t.type="Wild";
		t.animalDetail();
		t.roar();
		t.hunt();
		
		Cow c=new Cow();
		c.name="Mira";
		c.type="Domestic";
		c.animalDetail();
		c.moo();
		c.eat();
		
	}

}
