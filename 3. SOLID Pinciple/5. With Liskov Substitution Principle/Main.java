public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        System.out.println("Ostrich have "+(ostrich.haveEyes()?"Eyes":"not eyes"));
        Sparrow sparrow = new Sparrow();
        System.out.println("Sparrow have "+(sparrow.haveEyes()?"Eyes":"not Eyes")+", they can "+(sparrow.canFly()?" fly":"cannot fly"));
    }
}
