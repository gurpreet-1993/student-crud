public class Entity {
    String name ;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }
}
