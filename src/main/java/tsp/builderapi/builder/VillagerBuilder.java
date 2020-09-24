package tsp.builderapi.builder;

import com.destroystokyo.paper.entity.villager.Reputation;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.MerchantRecipe;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * VillagerBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
public class VillagerBuilder {

    private final Villager entity;

    public VillagerBuilder(Villager villager) {
        entity = villager;
    }

    public VillagerBuilder setProfession(Villager.Profession profession) {
        entity.setProfession(profession);
        return this;
    }

    public VillagerBuilder setReputation(UUID uuid, Reputation reputation) {
        entity.setReputation(uuid, reputation);
        return this;
    }

    public VillagerBuilder setReputations(Map<UUID, Reputation> map) {
        entity.setReputations(map);
        return this;
    }

    public VillagerBuilder setExperience(int i) {
        entity.setVillagerExperience(i);
        return this;
    }

    public VillagerBuilder setLevel(int i) {
        entity.setVillagerLevel(i);
        return this;
    }

    public VillagerBuilder setRestockToday(int i) {
        entity.setRestocksToday(i);
        return this;
    }

    public VillagerBuilder setVillagerType(Villager.Type type) {
        entity.setVillagerType(type);
        return this;
    }

    public VillagerBuilder setRecipe(int i, MerchantRecipe recipe) {
        entity.setRecipe(i, recipe);
        return this;
    }

    public VillagerBuilder setRecipes(List<MerchantRecipe> list) {
        entity.setRecipes(list);
        return this;
    }

    public Villager build() {
        return entity;
    }

}
