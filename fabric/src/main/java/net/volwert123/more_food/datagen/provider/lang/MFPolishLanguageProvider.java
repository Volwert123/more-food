package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFPolishLanguageProvider extends FabricLanguageProvider {
    public MFPolishLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "pl_pl", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Żelazna marchewka");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Diamentowa marchewka");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Szmaragdowa marchewka");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Pieczona marchewka");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Kawałki marchewki");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Zupa marchewkowa");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Chleb marchewkowy");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Placek marchewkowy");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Czekoladowa marchewka");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Żelazne jabłko");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Diamentowe jabłko");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Szmaragdowe jabłko");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Pieczone jabłko");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Kawałki jabłka");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Zupa jabłkowa");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Chleb jabłkowy");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Placek jabłkowy");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Czekoladowe jabłko");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Żelazny wodorost");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Złoty wodorost");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Diamentowy wodorost");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Szmaragdowy wodorost");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Kawałki wodorostu");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Zupa z wodorostów");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Suszone wodorosty w czekoladzie");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Żelazny ziemniak");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Złoty ziemniak");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Diamentowy ziemniak");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Szmaragdowy ziemniak");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Kawałki ziemniaka");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Zupa ziemniaczana");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Chleb ziemniaczany");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Słodkie jagody w czekoladzie");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Pieczony fantom");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Kawałki fantoma");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Zupa z fantoma");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Pieczona rozdymka");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Kawałki rozdymki");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Zupa z rozdymki");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Zupa dyniowa");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Chleb dyniowy");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Pieczony bambus");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Kawałki bambusa");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Zupa bambusowa");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Żelazny kawałek arbuza");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Złoty kawałek arbuza");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamentowy kawałek arbuza");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Szmaragdowy kawałek arbuza");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Żelazny pieczony królik");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Złoty pieczony królik");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Diamentowy pieczony królik");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Szmaragdowy pieczony królik");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Żelazny pieczony kurczak");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Złoty pieczony kurczak");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Diamentowy pieczony kurczak");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Szmaragdowy pieczony kurczak");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Żelazna pieczona baranina");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Złota pieczona baranina");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Diamentowa pieczona baranina");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Szmaragdowa pieczona baranina");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Żelazna pieczona wieprzowina");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Złota pieczona wieprzowina");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Diamentowa pieczona wieprzowina");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Szmaragdowa pieczona wieprzowina");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Żelazna pieczona wołowina");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Złota pieczona wołowina");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamentowa pieczona wołowina");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Szmaragdowa pieczona wołowina");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Ryż");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Miska ryżu z kurczakiem");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Miska ryżu z łososiem");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Miska ryżu z dorszem");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Miska ryżu z warzywami");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Pudding ryżowy");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Pudding ryżowy z miodem");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Bambusowe sushi");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Marchewkowe sushi");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Buraczane sushi");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Łososiowe sushi");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Gotowane jajko");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Surowy boczek");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Pieczony boczek");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Jajko z boczkiem");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Czekolada");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Tabliczka czekolady");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Marchewki");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Wodorosty");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Ziemniaki");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Jabłka");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Kawałki arbuza");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Pieczone króliki");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Pieczone kurczaki");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Pieczona baranina");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Pieczona wieprzowina");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Pieczona wołowina");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Pieczony boczek");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Surowy boczek");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Gotowane jajka");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Ryż");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Nasiona ryżu");
    }
}
