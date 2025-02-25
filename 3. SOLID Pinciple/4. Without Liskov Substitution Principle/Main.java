public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        System.out.println("Ostrich have "+(ostrich.haveEyes()?"Eyes":"no Eyes"));
        System.out.println("Ostrich can fly or not"+(ostrich.canFly()?"yes":"No"));
    }
}
