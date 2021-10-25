package Question16;

public class UsingCloneable implements Cloneable {
    int id;
    String name;
    UsingCloneable(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        UsingCloneable s = new UsingCloneable(1998, "Harsh Vardhan");
        System.out.println(s.id + " " + s.name);
        try {
            UsingCloneable s1;
            s1 = (UsingCloneable)s.clone();
            System.out.println(s1.id + " " + s1.name);
        }catch (Exception e) {
            System.out.println(s);
        }
    }
}
