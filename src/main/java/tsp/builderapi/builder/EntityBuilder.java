package tsp.builderapi.builder;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.util.Vector;

/**
 * EntityBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
public class EntityBuilder {

    private Entity entity;

    public EntityBuilder(Entity entity) {
        this.entity = entity;
    }

    public EntityBuilder setCustomName(String name) {
        entity.setCustomName(colorize(name));
        return this;
    }

    public EntityBuilder setCustomNameVisible(boolean b) {
        entity.setCustomNameVisible(b);
        return this;
    }

    public EntityBuilder setGlowing(boolean b) {
        entity.setGlowing(b);
        return this;
    }

    public EntityBuilder setGravity(boolean b) {
        entity.setGravity(b);
        return this;
    }

    public EntityBuilder setInvulnerable(boolean b) {
        entity.setInvulnerable(b);
        return this;
    }

    public EntityBuilder setFallDistance(float f) {
        entity.setFallDistance(f);
        return this;
    }

    public EntityBuilder setFireTicks(int i) {
        entity.setFireTicks(i);
        return this;
    }

    public EntityBuilder setLastDamageCause(EntityDamageEvent e) {
        entity.setLastDamageCause(e);
        return this;
    }

    public EntityBuilder setPersistent(boolean b) {
        entity.setPersistent(b);
        return this;
    }

    public EntityBuilder setPortalCooldown(int i) {
        entity.setPortalCooldown(i);
        return this;
    }

    public EntityBuilder setRotation(float f1, float f2) {
        entity.setRotation(f1, f2);
        return this;
    }

    public EntityBuilder setSilent(boolean b) {
        entity.setSilent(b);
        return this;
    }

    public EntityBuilder setTicksLived(int i) {
        entity.setTicksLived(i);
        return this;
    }

    public EntityBuilder setVelocity(Vector v) {
        entity.setVelocity(v);
        return this;
    }

    public EntityBuilder setMetadata(String s, MetadataValue metadataValue) {
        entity.setMetadata(s, metadataValue);
        return this;
    }

    public EntityBuilder addPassenger(Entity entity) {
        entity.addPassenger(entity);
        return this;
    }

    public Entity build() {
        return entity;
    }

    /**
     * Colorize a string
     *
     * @param string The string to colorize
     * @return Colorized string
     */
    private String colorize(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}
