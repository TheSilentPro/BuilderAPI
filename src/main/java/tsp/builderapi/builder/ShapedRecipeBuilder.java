package tsp.builderapi.builder;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.util.HashMap;
import java.util.Map;

/**
 * ShapedRecipeBuilder for 1.16.3
 *
 * @version 1.0.0
 * @author TheSilentPro
 * @since 9-21-2020
 */
public class ShapedRecipeBuilder {

    private final ShapedRecipe shapedRecipe;
    private String[] shape;
    private String group;
    private final Map<Character, ItemStack> ingredients = new HashMap<>();

    /**
     * Creates a ShapedRecipeBuilder Object with given {@link NamespacedKey} and {@link ItemStack}
     *
     * @param key Unique key for the recipe
     * @param result Item result
     */
    public ShapedRecipeBuilder(NamespacedKey key, ItemStack result) {
        this.shapedRecipe = new ShapedRecipe(key, result);
    }

    /**
     * Sets the recipe group
     *
     * @param group The recipe group
     */
    public ShapedRecipeBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Adds an ingredient
     *
     * @param item The item to add as ingredient
     */
    public ShapedRecipeBuilder addIngredient(char c, ItemStack item) {
        ingredients.put(c, item);
        return this;
    }

    /**
     * Sets the shape of the recipe
     *
     * @param shape The shape of the recipe
     */
    public ShapedRecipeBuilder setShape(String... shape) {
        this.shape = shape;
        return this;
    }

    /**
     * Builds the recipe
     *
     * @return The finished recipe
     */
    public ShapedRecipe build() {
        shapedRecipe.setGroup(group);
        ingredients.forEach(shapedRecipe::setIngredient);
        return shapedRecipe.shape(shape);
    }

}
