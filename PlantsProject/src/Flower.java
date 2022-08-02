public class Flower extends Plant {
   private boolean hasSmell;
   private boolean hasThorn;

   public Flower(){
       this.hasSmell=true;
       this.hasThorn=true;
   }

    public Flower(boolean hasSmell, boolean hasThorn) {
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    public boolean isHasSmell() {
        return hasSmell;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public boolean isHasThorn() {
        return hasThorn;
    }

    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    @Override
    public String toString() {
        return "Flower{" +
                " Name= "+getName()+
                " Color= "+getColor()+
                "hasSmell=" + hasSmell +
                ", hasThorn=" + hasThorn +
                '}';
    }
}
