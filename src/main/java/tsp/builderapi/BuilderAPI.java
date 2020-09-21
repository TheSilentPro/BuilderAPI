package tsp.builderapi;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import tsp.builderapi.builder.*;

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

    public static ShapelessRecipe buildShapelessRecipe(ShapelessRecipeBuilder builder) {
        return builder.build();
    }

    public static ShapedRecipe buildShapedRecipe(ShapedRecipeBuilder builder) {
        return builder.build();
    }

}
