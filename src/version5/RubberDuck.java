package version5;

public class RubberDuck implements Quacker {
	
    QuackBehavior quackBehavior;
    
	public RubberDuck(QuackBehavior qb) {
		
            this.quackBehavior = qb;
            
	}
        
        
	
	public void display() {
		System.out.println("I'm a Rubber Duck");
	}

    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        
        this.quackBehavior = qb;
        
    }

    @Override
    public void performQuack() {
        this.quackBehavior.quack();
    }
	

}
