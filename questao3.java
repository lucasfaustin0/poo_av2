public class Animais {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro(),
                new Gato(),
                new Passaro()
        };
        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}
abstract class Animal {
    public abstract void emitirSom();
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Cachorro: Au au!");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Gato: Miau!");
    }
}

class Passaro extends Animal {
    public void emitirSom() {
        System.out.println("Pássaro: Piu piu!");
    }
}

