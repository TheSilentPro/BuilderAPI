package tsp.builderapi.builder;

import com.google.common.annotations.Beta;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.List;

/**
 * BookBuilder for 1.16.3
 *
 * @version 1.0
 * @author TheSilentPro
 */
@Beta
public class BookBuilder {

    private final ItemStack item;
    private final BookMeta meta;

    public BookBuilder(ItemStack item) {
        this.item = item;
        if (!(item.getItemMeta() instanceof BookMeta)) {
            throw new IllegalArgumentException("Item must be of type book");
        }
        meta = (BookMeta) item.getItemMeta();
    }

    public BookBuilder setTitle(String title) {
        meta.setTitle(title);
        return this;
    }

    public BookBuilder setAuthor(String author) {
        meta.setAuthor(author);
        return this;
    }

    public BookBuilder setPage(int i, String s) {
        meta.setPage(i, s);
        return this;
    }

    public BookBuilder setPages(String... s) {
        meta.setPages(s);
        return this;
    }

    public BookBuilder setPages(List<String> s) {
        meta.setPages(s);
        return this;
    }

    public BookBuilder setGeneration(BookMeta.Generation generation) {
        meta.setGeneration(generation);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }

}
