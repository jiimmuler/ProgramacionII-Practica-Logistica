public abstract class Vehiculo implements IConectable {
    private int id;
    private static int nextId=0;

    public Vehiculo(){
        setId();
    }

    public int getId(){
        return id;
    }

    private void setId(){
        this.id=getNextId();
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }

    public abstract void patronMovimiento();
}
