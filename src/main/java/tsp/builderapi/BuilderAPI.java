package tsp.builderapi;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import tsp.builderapi.builder.*;

/**
 * BuilderAPI provides builders for easier development and chain-like building of Objects
 *
 * @author TheSilentPro
 * @version 1.1.0
 */
public class BuilderAPI {

    public static LivingEntity buildLivingEntity(LivingEntityBuilder builder) {
        return builder.build();
    }

    public static Entity buildEntity(EntityBuilder builder) {
        return builder.build();
    }

    public static ItemStack buildItem(ItemBuilder builder) {
        return builder.build();
    }

    public static ItemStack buildPotion(PotionBuilder builder) {
        return builder.build();
    }

    public static ItemStack buildBook(BookBuilder builder) {
        return builder.build();
    }

    public static Villager buildVillager(VillagerBuilder builder) {
        return builder.build();
    }

    @Deprecated
    public static ShapelessRecipe buildShapelessRecipe(ShapelessRecipeBuilder builder) {
        return builder.build();
    }

    @Deprecated
    public static ShapedRecipe buildShapedRecipe(ShapedRecipeBuilder builder) {
        return builder.build();
    }

}
