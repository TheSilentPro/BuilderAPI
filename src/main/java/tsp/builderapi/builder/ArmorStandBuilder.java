package tsp.builderapi.builder;

import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

/**
 * ArmorStandBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
public class ArmorStandBuilder {

    private final ArmorStand entity;

    public ArmorStandBuilder(ArmorStand entity) {
        this.entity = entity;
    }

    public ArmorStandBuilder setVisible(boolean b) {
        entity.setVisible(b);
        return this;
    }

    public ArmorStandBuilder setCanMove(boolean b) {
        entity.setCanMove(b);
        return this;
    }

    public ArmorStandBuilder setArms(boolean b) {
        entity.setArms(b);
        return this;
    }

    public ArmorStandBuilder setBasePlate(boolean b) {
        entity.setBasePlate(b);
        return this;
    }

    public ArmorStandBuilder setCanTick(boolean b) {
        entity.setCanTick(b);
        return this;
    }

    public ArmorStandBuilder setBodyPose(EulerAngle eulerAngle) {
        entity.setBodyPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setDisabledSlots(EquipmentSlot... equipmentSlots) {
        entity.setDisabledSlots(equipmentSlots);
        return this;
    }

    public ArmorStandBuilder setHeadPose(EulerAngle eulerAngle) {
        entity.setHeadPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setItem(EquipmentSlot slot, ItemStack item) {
        entity.setItem(slot, item);
        return this;
    }

    public ArmorStandBuilder setLeftArmPose(EulerAngle eulerAngle) {
        entity.setLeftArmPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setLeftLegPose(EulerAngle eulerAngle) {
        entity.setLeftLegPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setRightArmPose(EulerAngle eulerAngle) {
        entity.setRightArmPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setRightLegPose(EulerAngle eulerAngle) {
        entity.setRightLegPose(eulerAngle);
        return this;
    }

    public ArmorStandBuilder setMarker(boolean b) {
        entity.setMarker(b);
        return this;
    }

    public ArmorStandBuilder setSmall(boolean b) {
        entity.setSmall(b);
        return this;
    }

    public ArmorStandBuilder addDisabledSlots(EquipmentSlot... slots) {
        entity.addDisabledSlots(slots);
        return this;
    }

    public ArmorStandBuilder setEquipmentLock(EquipmentSlot slot, ArmorStand.LockType type) {
        entity.addEquipmentLock(slot, type);
        return this;
    }

    public ArmorStand build() {
        return entity;
    }

}
