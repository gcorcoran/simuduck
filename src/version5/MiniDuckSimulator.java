package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {

            
            Quacker duck[] = {new MallardDuck(new Quack(), new FlyWithWings()),
                              new RubberDuck(new Squeak())
            };
            
            for (Quacker ducker : duck) {
                
                ducker.performQuack();
                
            }
            
            

            
	}

}
