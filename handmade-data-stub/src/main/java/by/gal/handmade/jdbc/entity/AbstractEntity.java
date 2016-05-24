package by.gal.handmade.jdbc.entity;

import by.gal.handmade.api.entity.IActivityType;
import by.gal.handmade.api.entity.IEntity;

import java.util.UUID;

/**
 * Created by den on 24.5.16.
 */
public abstract class AbstractEntity implements IEntity {
    private UUID id;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }
}
