public class InterfaceSegregation {
}

interface Worker {
    void work();
    void eat();
}
interface eatable{
    void eat();
}
interface workable{
    void work();
}

interface powerable{
    void charge();
}
class HumanWorker implements eatable, workable {

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}

class RobotWorker implements workable , powerable{

    @Override
    public void work() {

    }

    @Override
    public void charge() {

    }
}
