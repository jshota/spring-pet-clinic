package springpetclinic.models;

import java.io.Serializable;

/**
 * @author j.h on 7/20/20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
