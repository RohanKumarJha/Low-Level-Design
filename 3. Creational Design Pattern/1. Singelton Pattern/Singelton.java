public class Singelton {

    static private Singelton obj;

    private Singelton() {

    }

    public static Singelton show() {
        if(obj == null) {
            obj = new Singelton();
        } return obj;
    }
}
