package tsp.builderapi.builder;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.*;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

/**
 * LivingEntityBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
public class LivingEntityBuilder {

    private final LivingEntity entity;

    public LivingEntityBuilder(LivingEntity entity) {
        this.entity = entity;
    }

    public LivingEntityBuilder setHealth(double health) {
        entity.setHealth(health);
        return this;
    }

    public LivingEntityBuilder setMaxHealth(double maxHealth) {
        entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(new AttributeModifier("GENERIC_MAX_HEALTH", maxHealth, AttributeModifier.Operation.ADD_NUMBER));
        return this;
    }

    public LivingEntityBuilder setAI(boolean b) {
        entity.setAI(b);
        return this;
    }

    public LivingEntityBuilder setCanPickupItems(boolean b) {
        entity.setCanPickupItems(b);
        return this;
    }

    public LivingEntityBuilder setArrowCooldown(int i) {
        entity.setArrowCooldown(i);
        return this;
    }

    public LivingEntityBuilder setArrowsInBody(int i) {
        entity.setArrowsInBody(i);
        return this;
    }

    public LivingEntityBuilder setArrowsStuck(int i) {
        entity.setArrowsStuck(i);
        return this;
    }

    public LivingEntityBuilder setCollidable(boolean b) {
        entity.setCollidable(b);
        return this;
    }

    public LivingEntityBuilder setGliding(boolean b) {
        entity.setGliding(b);
        return this;
    }

    public LivingEntityBuilder setInvisible(boolean b) {
        entity.setInvisible(b);
        return this;
    }

    public LivingEntityBuilder setJumping(boolean b) {
        entity.setJumping(b);
        return this;
    }

    public LivingEntityBuilder setKiller(Player player) {
        entity.setKiller(player);
        return this;
    }

    public LivingEntityBuilder setLastDamage(double d) {
        entity.setLastDamage(d);
        return this;
    }

    public LivingEntityBuilder setLeashHolder(Entity e) {
        entity.setLeashHolder(e);
        return this;
    }

    public LivingEntityBuilder setMaximumAir(int i) {
        entity.setMaximumAir(i);
        return this;
    }

    public LivingEntityBuilder setMaximumNoDamageTicks(int i) {
        entity.setMaximumNoDamageTicks(i);
        return this;
    }

    public LivingEntityBuilder setNoDamageTicks(int i) {
        entity.setNoDamageTicks(i);
        return this;
    }

    public LivingEntityBuilder setRemainingAir(int i) {
        entity.setRemainingAir(i);
        return this;
    }

    public LivingEntityBuilder setRemoveWhenFarAway(boolean b) {
        entity.setRemoveWhenFarAway(b);
        return this;
    }

    public LivingEntityBuilder setShieldBlockingDelay(int i) {
        entity.setShieldBlockingDelay(i);
        return this;
    }

    public LivingEntityBuilder setSwimming(boolean b) {
        entity.setSwimming(b);
        return this;
    }

    public LivingEntityBuilder setAbsorptionAmount(double d) {
        entity.setAbsorptionAmount(d);
        return this;
    }

    public LivingEntityBuilder setHelmet(ItemStack item) {
        entity.getEquipment().setHelmet(item);
        return this;
    }

    public LivingEntityBuilder setChestplate(ItemStack item) {
        entity.getEquipment().setChestplate(item);
        return this;
    }

    public LivingEntityBuilder setLeggings(ItemStack item) {
        entity.getEquipment().setLeggings(item);
        return this;
    }

    public LivingEntityBuilder setBoots(ItemStack item) {
        entity.getEquipment().setBoots(item);
        return this;
    }

    public LivingEntityBuilder setItemInMainHand(ItemStack item) {
        entity.getEquipment().setItemInMainHand(item);
        return this;
    }

    public LivingEntityBuilder setItemInOffHand(ItemStack item) {
        entity.getEquipment().setItemInOffHand(item);
        return this;
    }

    public LivingEntityBuilder setHelmetDropChance(float f) {
        entity.getEquipment().setHelmetDropChance(f);
        return this;
    }

    public LivingEntityBuilder setChestplateDropChance(float f) {
        entity.getEquipment().setChestplateDropChance(f);
        return this;
    }

    public LivingEntityBuilder setLeggingsDropChance(float f) {
        entity.getEquipment().setLeggingsDropChance(f);
        return this;
    }

    public LivingEntityBuilder setBootsDropChance(float f) {
        entity.getEquipment().setBootsDropChance(f);
        return this;
    }

    public LivingEntityBuilder setItemInMainHandDropChance(float f) {
        entity.getEquipment().setItemInMainHandDropChance(f);
        return this;
    }

    public LivingEntityBuilder setItemInOffHandDropChance(float f) {
        entity.getEquipment().setItemInOffHandDropChance(f);
        return this;
    }

    public LivingEntityBuilder setItem(EquipmentSlot slot, ItemStack item) {
        entity.getEquipment().setItem(slot, item);
        return this;
    }

    public LivingEntityBuilder setArmorContents(ItemStack... items) {
        entity.getEquipment().setArmorContents(items);
        return this;
    }

    public LivingEntityBuilder clearEquipment() {
        entity.getEquipment().clear();
        return this;
    }

    public LivingEntityBuilder setAge(int i) {
        if (!(entity instanceof Ageable)) return this;
        ((Ageable) entity).setAge(i);
        return this;
    }

    public LivingEntityBuilder setAge(Age age) {
        if (!(entity instanceof Ageable)) return this;
        ((Ageable) entity).setAge(age.bukkitAge);
        return this;
    }

    public LivingEntityBuilder setAgeLock(boolean b) {
        if (!(entity instanceof Breedable)) return this;
        ((Breedable) entity).setAgeLock(b);
        return this;
    }

    public LivingEntityBuilder setBreed(boolean b) {
        if (!(entity instanceof Breedable)) return this;
        ((Breedable) entity).setBreed(b);
        return this;
    }

    public LivingEntity build() {
        return entity;
    }

    public enum Age {

        BABY(0),
        ADULT(1);

        private final int bukkitAge;

        Age(int bukkitAge) {
            this.bukkitAge = bukkitAge;
        }

    }

}
