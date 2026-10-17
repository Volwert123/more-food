package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFSpanishLanguageProvider extends FabricLanguageProvider {
    public MFSpanishLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "es_es", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Zanahoria de hierro");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Zanahoria de diamante");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Zanahoria de esmeralda");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Zanahoria cocinada");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Trozos de zanahoria");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Sopa de zanahoria");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Pan de zanahoria");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Tarta de zanahoria");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Zanahoria con chocolate");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Manzana de hierro");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Manzana de diamante");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Manzana de esmeralda");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Manzana cocinada");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Trozos de manzana");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Sopa de manzana");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Pan de manzana");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Tarta de manzana");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Manzana con chocolate");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Alga de hierro");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Alga dorada");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Alga de diamante");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Alga de esmeralda");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Trozos de alga");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Sopa de alga");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Alga deshidratada con chocolate");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Patata de hierro");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Patata dorada");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Patata de diamante");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Patata de esmeralda");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Trozos de patata");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Sopa de patata");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Pan de patata");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Bayas dulces con chocolate");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Fantasma cocinado");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Trozos de fantasma");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Sopa de fantasma");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Pez globo cocinado");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Trozos de pez globo");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Sopa de pez globo");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Sopa de calabaza");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pan de calabaza");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Bambú cocinado");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Trozos de bambú");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Sopa de bambú");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Rodaja de sandía de hierro");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Rodaja de sandía dorada");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Rodaja de sandía de diamante");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Rodaja de sandía de esmeralda");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Conejo cocinado de hierro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Conejo cocinado dorado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Conejo cocinado de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Conejo cocinado de esmeralda");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Pollo cocinado de hierro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Pollo cocinado dorado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Pollo cocinado de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Pollo cocinado de esmeralda");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Cordero cocinado de hierro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Cordero cocinado dorado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Cordero cocinado de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Cordero cocinado de esmeralda");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Chuleta de cerdo cocinada de hierro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Chuleta de cerdo cocinada dorada");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Chuleta de cerdo cocinada de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Chuleta de cerdo cocinada de esmeralda");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Filete de hierro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Filete dorado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Filete de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Filete de esmeralda");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Arroz");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Cuenco de arroz con pollo");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Cuenco de arroz con salmón");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Cuenco de arroz con bacalao");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Cuenco de arroz con verduras");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Arroz con leche");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Arroz con leche y miel");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi de bambú");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Sushi de zanahoria");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi de remolacha");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Sushi de salmón");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Huevo cocinado");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Panceta cruda");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Panceta cocinada");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Huevo con panceta cocinada");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Chocolate");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Tableta de chocolate");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Zanahorias");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Algas");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Patatas");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Manzanas");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Rodajas de sandía");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Conejos cocinados");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Pollos cocinados");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Corderos cocinados");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Chuletas de cerdo cocinadas");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Filetes");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Panceta cocinada");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Panceta cruda");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Huevos cocinados");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Arroz");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Semillas de arroz");
    }
}
