package animal;

public class Cat extends Whale {

    @Override
    public String getName() {
        return "Я не кот, я кит";
    }

    @Override
    public Cat getChild() {
        return new Cat();
    }

}
