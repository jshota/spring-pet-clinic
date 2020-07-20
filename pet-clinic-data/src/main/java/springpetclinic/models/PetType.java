package springpetclinic.models;

/**
 * @author j.h on 7/19/20
 */
public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
