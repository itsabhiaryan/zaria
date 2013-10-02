package com.zaria.framework.es.systems.movement;

import com.badlogic.gdx.artemis.Aspect;
import com.badlogic.gdx.artemis.ComponentMapper;
import com.badlogic.gdx.artemis.Entity;
import com.badlogic.gdx.artemis.annotations.Mapper;
import com.badlogic.gdx.artemis.systems.EntityProcessingSystem;
import com.zaria.framework.es.components.movement.PositionComponent;
import com.zaria.framework.es.components.movement.VelocityComponent;

public class RotateSystem extends EntityProcessingSystem {

    @Mapper
    ComponentMapper<PositionComponent> positionMapper;
    @Mapper
    ComponentMapper<VelocityComponent> velocityMapper;

    @SuppressWarnings("unchecked")
    public RotateSystem() {
        super(Aspect.getAspectForAll(PositionComponent.class, VelocityComponent.class));
    }

    @Override
    protected void process(Entity e) {
        PositionComponent position = positionMapper.get(e);
        VelocityComponent velocity = velocityMapper.get(e);

        position.setAngle(velocity.getVelocity().angle());
    }

}
