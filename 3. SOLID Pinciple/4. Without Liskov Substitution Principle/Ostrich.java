public class Ostrich implements Bird{

    @Override
    public boolean canFly() {
        throw new UnsupportedOperationException("Ostrich Cannot Fly");
    }

    @Override
    public boolean haveEyes() {
        return true;
    }
    
}
