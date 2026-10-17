package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFTurkishLanguageProvider extends FabricLanguageProvider {
    public MFTurkishLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "tr_tr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Demir Havuç");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Elmas Havuç");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Zümrüt Havuç");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Pişmiş Havuç");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Havuç Parçaları");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Havuç Çorbası");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Havuçlu Ekmek");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Havuçlu Turta");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Çikolatalı Havuç");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Demir Elma");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Elmas Elma");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Zümrüt Elma");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Pişmiş Elma");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Elma Parçaları");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Elma Çorbası");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Elmalı Ekmek");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Elmalı Turta");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Çikolatalı Elma");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Demir Laminarya");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Altın Laminarya");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Elmas Laminarya");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Zümrüt Laminarya");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Laminarya Parçaları");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Laminarya Çorbası");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Çikolatalı Kurutulmuş Laminarya");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Demir Patates");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Altın Patates");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Elmas Patates");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Zümrüt Patates");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Patates Parçaları");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Patates Çorbası");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Patatesli Ekmek");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Çikolatalı Tatlı Meyveler");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Pişmiş Fantom");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Fantom Parçaları");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Fantom Çorbası");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Pişmiş Kirpi Balığı");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Kirpi Balığı Parçaları");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Kirpi Balığı Çorbası");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Balkabağı Çorbası");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Balkabaklı Ekmek");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Pişmiş Bambu");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Bambu Parçaları");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Bambu Çorbası");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Demir Karpuz Dilimi");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Altın Karpuz Dilimi");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Elmas Karpuz Dilimi");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Zümrüt Karpuz Dilimi");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Demir Pişmiş Tavşan");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Altın Pişmiş Tavşan");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Elmas Pişmiş Tavşan");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Zümrüt Pişmiş Tavşan");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Demir Pişmiş Tavuk");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Altın Pişmiş Tavuk");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Elmas Pişmiş Tavuk");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Zümrüt Pişmiş Tavuk");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Demir Pişmiş Koyun Eti");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Altın Pişmiş Koyun Eti");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Elmas Pişmiş Koyun Eti");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Zümrüt Pişmiş Koyun Eti");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Demir Pişmiş Domuz Pirzolası");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Altın Pişmiş Domuz Pirzolası");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Elmas Pişmiş Domuz Pirzolası");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Zümrüt Pişmiş Domuz Pirzolası");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Demir Biftek");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Altın Biftek");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Elmas Biftek");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Zümrüt Biftek");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Pirinç");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Tavuklu Pirinç Kasesi");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Somonlu Pirinç Kasesi");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Morinalı Pirinç Kasesi");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Sebzeli Pirinç Kasesi");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Sütlaç");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Ballı Sütlaç");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Bambulu Suşi");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Havuçlu Suşi");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Pancarlı Suşi");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Somonlu Suşi");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Pişmiş Yumurta");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Çiğ Bacon");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Pişmiş Bacon");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Baconlı Yumurta");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Çikolata");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Kalıp Çikolata");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Havuçlar");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Laminaryalar");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Patatesler");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Elmalar");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Karpuz Dilimleri");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Pişmiş Tavşanlar");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Pişmiş Tavuklar");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Pişmiş Koyun Etleri");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Pişmiş Domuz Pirzolaları");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Biftekler");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Pişmiş Bacon");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Çiğ Bacon");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Suşi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Pişmiş Yumurtalar");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Pirinç");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Pirinç Tohumları");
    }
}
