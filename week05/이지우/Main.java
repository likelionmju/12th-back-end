
public class Main {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Lotto lotto2 = new Lotto();
		Lottos lottos = new Lottos();
		lotto.add(1);
		lotto.add(2);
		lotto.add(3);
		
		if(lotto.check_duplication(4))
			System.out.println("print duplicate");
		
		lotto.add(5);
		lotto.add(6);
		lottos.add(lotto);
		
		lotto2.add(5);
		lotto2.add(6);
		lotto2.add(7);
		lotto2.add(8);
		lotto2.add(9);
		lotto2.add(10);
		lottos.add(lotto2);
		lottos.print();
	}

}
