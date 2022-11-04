public class MallardDuck extends Duck{
    public MallardDuck(FlyBehaviour flyBehaviour){
        super(flyBehaviour); // To check what it does - Calls the constructor of the parent class(Duck)
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
