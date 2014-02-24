package version5;

public class MallardDuck implements Flyer, Quacker {
	
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;
    
    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
	
    @Override
    public void display() {
            System.out.println("I'm a Mallard Duck");
    }

    @Override
    public void performQuack() {
        this.quackBehavior.quack();
    }
    
    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    
    @Override
    public void performFly() {
        this.flyBehavior.fly();
    }
    
    @Override
    public void setFlyBehavior(FlyBehavior qb) {
        this.flyBehavior = qb;
    }
	
}
