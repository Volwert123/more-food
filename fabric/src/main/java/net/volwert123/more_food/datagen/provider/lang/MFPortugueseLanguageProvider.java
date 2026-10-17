package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFPortugueseLanguageProvider extends FabricLanguageProvider {
    public MFPortugueseLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "pt_br", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Cenoura de ferro");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Cenoura de diamante");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Cenoura de esmeralda");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Cenoura cozida");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Pedaços de cenoura");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Sopa de cenoura");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Pão de cenoura");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Torta de cenoura");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Cenoura com chocolate");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Maçã de ferro");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Maçã de diamante");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Maçã de esmeralda");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Maçã cozida");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Pedaços de maçã");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Sopa de maçã");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Pão de maçã");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Torta de maçã");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Maçã com chocolate");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Alga de ferro");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Alga dourada");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Alga de diamante");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Alga de esmeralda");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Pedaços de alga");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Sopa de alga");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Alga desidratada com chocolate");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Batata de ferro");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Batata dourada");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Batata de diamante");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Batata de esmeralda");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Pedaços de batata");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Sopa de batata");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Pão de batata");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Bagas doces com chocolate");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Phantom cozido");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Pedaços de phantom");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Sopa de phantom");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Baiacu cozido");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Pedaços de baiacu");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Sopa de baiacu");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Sopa de abóbora");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pão de abóbora");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Bambu cozido");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Pedaços de bambu");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Sopa de bambu");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Fatia de melancia de ferro");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Fatia de melancia dourada");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Fatia de melancia de diamante");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Fatia de melancia de esmeralda");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Coelho cozido de ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Coelho cozido dourado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Coelho cozido de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Coelho cozido de esmeralda");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Frango cozido de ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Frango cozido dourado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Frango cozido de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Frango cozido de esmeralda");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Carneiro cozido de ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Carneiro cozido dourado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Carneiro cozido de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Carneiro cozido de esmeralda");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Costeleta de porco cozida de ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Costeleta de porco cozida dourada");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Costeleta de porco cozida de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Costeleta de porco cozida de esmeralda");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Bife de ferro");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Bife dourado");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Bife de diamante");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Bife de esmeralda");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Arroz");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Tigela de arroz com frango");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Tigela de arroz com salmão");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Tigela de arroz com bacalhau");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Tigela de arroz com legumes");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Arroz-doce");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Arroz-doce com mel");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi de bambu");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Sushi de cenoura");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi de beterraba");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Sushi de salmão");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Ovo cozido");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Bacon cru");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Bacon frito");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Ovo com bacon frito");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Chocolate");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Barra de chocolate");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Cenouras");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Algas");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Batatas");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Maçãs");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Fatias de melancia");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Coelhos cozidos");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Frangos cozidos");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Carneiros cozidos");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Costeletas de porco cozidas");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Bifes");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Bacon frito");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Bacon cru");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Ovos cozidos");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Arroz");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Sementes de arroz");
    }
}
