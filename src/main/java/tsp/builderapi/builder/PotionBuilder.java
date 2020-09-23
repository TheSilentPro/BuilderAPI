package tsp.builderapi.builder;

import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;

import com.google.common.annotations.Beta;

/**
 * PotionBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
@Beta
public class PotionBuilder {

    private final ItemStack item;
    private final PotionMeta meta;
    private PotionType type = PotionType.AWKWARD;
    private boolean upgraded = false;
    private boolean extended = false;
    private Color color;

    public PotionBuilder(ItemStack item) {
        this.item = item;
        if (!(item.getItemMeta() instanceof PotionMeta)) {
            throw new IllegalArgumentException("Item must be of type potion");
        }
        this.meta = (PotionMeta) item.getItemMeta();
    }

    public PotionBuilder setType(PotionType type) {
        this.type = type;
        return this;
    }

    public PotionBuilder setExtended(boolean b) {
        extended = b;
        return this;
    }

    public PotionBuilder setUpgraded(boolean b) {
        upgraded = b;
        return this;
    }

    public PotionBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public PotionBuilder addCustomEffect(PotionEffect effect, boolean b) {
        meta.addCustomEffect(effect, b);
        return this;
    }

    public ItemStack build() {
        meta.setBasePotionData(new PotionData(type, extended, upgraded));
        meta.setColor(color);
        item.setItemMeta(meta);
        return item;
    }

}
