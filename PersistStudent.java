import java.io.Serializable;

public class PersistStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    public PersistStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
