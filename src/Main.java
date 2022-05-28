public class Main {
    public static void main(String[] args) {
        Cat Cats = new Cat();
        Cat Tom = new Cat("Tom",5,5,"fold");
        Cat Bars = new Cat("Bars",7,8,"pers");
        Cat Jery = new Cat("Jery",3,4,"sphynx");
        System.out.println(Tom);
        System.out.println(Bars);
        System.out.println(Jery);
        System.out.println(Tom.equals(Bars));
        System.out.println(Jery.equals(Bars));
        System.out.println(Jery.equals(Tom));
    }

}
