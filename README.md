# BuilderAPI
Builder APIs for easier development <br>
[![](https://jitpack.io/v/TheSilentPro/BuilderAPI.svg)](https://jitpack.io/#TheSilentPro/BuilderAPI)

# Installation
There are 3 methods to access these builders (Only choose one):
 1) Copy each class individually and paste them in your plugin
 2) **Shade this project using JitPack (Recommended)**
 3) Download it from the [Releases page](https://github.com/TheSilentPro/BuilderAPI/releases) and add it to your plugin (You will also need to add it in your server `plugins` folder!)

# Example Usages
Notice: 
 - These are just some example usages of the Builder's, it does not cover them fully.
 - You can either use the builders statically using `BuilderAPI.buildX(...);` or you can access them individually.

## Static
Full list in [BuilderAPI](https://github.com/TheSilentPro/BuilderAPI/blob/master/src/main/java/tsp/builderapi/BuilderAPI.java)

## ItemBuilder
```
        ItemStack item = new ItemBuilder(Material.PAPER)
                .setName("&bTest Item")
                .setAmount(2)
                .setLore("&eThis is a test item", "&ein order to test the", "&eItemBuilder class for developers.")
                .setGlow(true)
                .build();
```
Result: Glowing (enchanted) x2 Paper with the name `Test Item` and given lore above (each parameter is a new lore line).

```
        ItemStack item = new ItemBuilder(Material.PLAYER_HEAD)
                .setName("&5&lDeveloper")
                .setUnbreakable(true)
                .setLore("&7Head of the &5Developer&7.")
                .setOwner(Bukkit.getOfflinePlayer(UUID.fromString("f16df3ef-06b8-443e-9166-fba6689585b4")))
                .build();
```
Result: Unbreakable player head with the owner as an offline player

*You must call `#build();` at the end of the chain in order to get the ItemStack!*

## EntityBuilder
```
        new EntityBuilder(player.getWorld().spawn(player.getLocation(), Snowball.class))
                .setVelocity(new Vector(0, 20, 0))
                .build();
```
Result: This will launch a Snowball at the players location and y=+20
```
        new EntityBuilder(player.getWorld().spawn(player.getLocation(), Arrow.class))
                .setGravity(false)
                .build();
```
Result: This will spawn a no-gravity Arrow at the players location and will not fall

## LivingEntityBuilder
```
        new LivingEntityBuilder((LivingEntity) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE))
                .setHelmet(new ItemStack(Material.DIAMOND_HELMET))
                .setMaxHealth(500)
                .setHealth(400)
                .build();
```
Result: This will spawn a zombie with a diamond helmet and 400HP (max 500)

*You don't need to call `#build();`, the chain may end anywhere!*

## Contributing
If you have any improvements you would like to add, [Fork](https://docs.github.com/en/github/getting-started-with-github/fork-a-repo) this project and open a [Pull Request.](https://github.com/TheSilentPro/BuilderAPI/pulls) <br>
If you have any issues with the project you may open an [Issue.](https://github.com/TheSilentPro/BuilderAPI/issues)

## License
This project is licensed under the [GNU General Public License v3.0](https://github.com/TheSilentPro/BuilderAPI/blob/master/LICENSE)
