abstract class Countable {
    abstract void count();
}

// Bird.java
class Bird extends Countable {
    private String name;
    private int num;

    Bird(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void fly() {
        System.out.println(num + "마리 " + name + "가 날아간다.");
    }

    @Override
    public void count() {
        System.out.println(name + "가 " + num + "마리 있다.");
    }
}

// Tree.java
class Tree extends Countable {
    private String name;
    private int num;

    Tree(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void ripen() {
        System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
    }

    @Override
    public void count() {
        System.out.println(name + "가 " + num + "그루 있다.");
    }
}

// CountTest.java
public class CountableAbstractClass {
    public static void main(String[] args) {
        Countable[] countables = {
                new Bird("뻐꾸기", 5),
                new Bird("독수리", 2),
                new Tree("사과나무", 10),
                new Tree("밤나무", 7)
        };

        for (Countable c : countables) {
            c.count();
        }

        for (Countable c : countables) {
            if (c instanceof Bird) {
                ((Bird) c).fly();
            } else if (c instanceof Tree) {
                ((Tree) c).ripen();
            }
        }
    }
}
