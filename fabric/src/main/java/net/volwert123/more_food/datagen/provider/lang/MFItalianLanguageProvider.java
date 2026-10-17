package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFItalianLanguageProvider extends FabricLanguageProvider {
    public MFItalianLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "it_it", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Carota di ferro");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Carota di diamante");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Carota di smeraldo");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Carota cotta");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Pezzi di carota");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Zuppa di carote");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Pane alle carote");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Torta di carote");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Carota al cioccolato");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Mela di ferro");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Mela di diamante");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Mela di smeraldo");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Mela cotta");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Pezzi di mela");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Zuppa di mele");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Pane alle mele");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Torta di mele");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Mela al cioccolato");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Fuco di ferro");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Fuco dorato");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Fuco di diamante");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Fuco di smeraldo");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Pezzi di fuco");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Zuppa di fuco");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Fuco essiccato al cioccolato");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Patata di ferro");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Patata dorata");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Patata di diamante");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Patata di smeraldo");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Pezzi di patata");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Zuppa di patate");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Pane di patate");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Bacche dolci al cioccolato");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Phantom cotto");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Pezzi di phantom");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Zuppa di phantom");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Pesce palla cotto");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Pezzi di pesce palla");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Zuppa di pesce palla");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Zuppa di zucca");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pane alla zucca");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Bambù cotto");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Pezzi di bambù");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Zuppa di bambù");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Fetta di anguria di ferro");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Fetta di anguria dorata");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Fetta di anguria di diamante");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Fetta di anguria di smeraldo");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Coniglio cotto di ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Coniglio cotto dorato");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Coniglio cotto di diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Coniglio cotto di smeraldo");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Pollo cotto di ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Pollo cotto dorato");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Pollo cotto di diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Pollo cotto di smeraldo");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Montone cotto di ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Montone cotto dorato");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Montone cotto di diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Montone cotto di smeraldo");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Braciola di maiale cotta di ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Braciola di maiale cotta dorata");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Braciola di maiale cotta di diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Braciola di maiale cotta di smeraldo");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Bistecca di ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Bistecca dorata");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Bistecca di diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Bistecca di smeraldo");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Riso");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Ciotola di riso con pollo");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Ciotola di riso con salmone");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Ciotola di riso con merluzzo");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Ciotola di riso con verdure");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Budino di riso");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Budino di riso e miele");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi di bambù");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Sushi di carota");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi di barbabietola");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Sushi di salmone");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Uovo cotto");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Pancetta cruda");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Pancetta cotta");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Uovo con pancetta cotta");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Cioccolato");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Tavoletta di cioccolato");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carote");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Fuchi");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Patate");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Mele");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Fette di anguria");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Conigli cotti");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Polli cotti");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Montoni cotti");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Braciole di maiale cotte");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Bistecche");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Pancetta cotta");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Pancetta cruda");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Uova cotte");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Riso");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Semi di riso");
    }
}
