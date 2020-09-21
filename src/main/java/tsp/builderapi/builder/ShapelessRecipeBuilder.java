package tsp.builderapi.builder;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.ArrayList;
import java.util.List;

/**
 * ShapelessRecipeBuilder for 1.16.3
 *
 * @version 1.0.0
 * @author TheSilentPro
 * @since 9-21-2020
 */
public class ShapelessRecipeBuilder {

    private final ShapelessRecipe shapelessRecipe;
    private String group;
    private final List<ItemStack> ingredients = new ArrayList<>();

    /**
     * Creates a ShapelessRecipeBuilder Object with given {@link NamespacedKey} and {@link ItemStack}
     *
     * @param key Unique key for the recipe
     * @param result Item result
     */
    public ShapelessRecipeBuilder(NamespacedKey key, ItemStack result) {
        this.shapelessRecipe = new ShapelessRecipe(key, result);
    }

    /**
     * Sets the recipe group
     *
     * @param group The recipe group
     */
    public ShapelessRecipeBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Adds an ingredient
     *
     * @param item The item to add as ingredient
     */
    public ShapelessRecipeBuilder addIngredient(ItemStack item) {
        ingredients.add(item);
        return this;
    }

    /**
     * Builds the recipe
     *
     * @return The finished recipe
     */
    public ShapelessRecipe build() {
        shapelessRecipe.setGroup(group);
        ingredients.forEach(shapelessRecipe::addIngredient);
        return shapelessRecipe;
    }

}
