public class LiskovSubstitution {
}

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Pheonix implements FlyingBird {

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }
}

class Chicken implements Bird {

    @Override
    public void eat() {

    }
}
