package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFSwedishLanguageProvider extends FabricLanguageProvider {
    public MFSwedishLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "sv_se", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Järnmorot");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Diamantmorot");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Smaragdmorot");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Tillagad morot");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Morotsbitar");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Morotssoppa");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Morotsbröd");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Morotspaj");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Chokladmorot");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Järnäpple");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Diamantäpple");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Smaragdäpple");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Tillagat äpple");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Äppelbitar");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Äppelsoppa");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Äppelbröd");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Äppelpaj");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Chokladäpple");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Järnkelp");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Gyllene kelp");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Diamantkelp");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Smaragdkelp");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Kelpbitar");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Kelpsoppa");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Torkad chokladkelp");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Järnpotatis");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Gyllene potatis");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Diamantpotatis");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Smaragdpotatis");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Potatisbitar");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Potatissoppa");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Potatisbröd");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Chokladsöta bär");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Tillagad fantom");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Fantombitar");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Fantomsoppa");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Tillagad blåsfisk");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Blåsfiskbitar");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Blåsfisksoppa");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Pumpasoppa");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pumpabröd");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Tillagad bambu");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Bambubitar");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Bambusoppa");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Järnmelonskiva");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Gyllene melonskiva");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamantmelonskiva");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Smaragdmelonskiva");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Tillagad järnkanin");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Gyllene tillagad kanin");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Tillagad diamantkanin");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Tillagad smaragdkanin");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Tillagad järnkyckling");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Gyllene tillagad kyckling");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Tillagad diamantkyckling");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Tillagad smaragdkyckling");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Tillagat järnfårkött");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Gyllene tillagat fårkött");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Tillagat diamantfårkött");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Tillagat smaragdfårkött");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Tillagad järnfläskkotlett");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Gyllene tillagad fläskkotlett");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Tillagad diamantfläskkotlett");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Tillagad smaragdfläskkotlett");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Järnstek");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Gyllene stek");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamantstek");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Smaragdstek");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Ris");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Risskål med kyckling");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Risskål med lax");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Risskål med torsk");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Risskål med grönsaker");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Rispudding");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Rispudding med honung");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Bambusushi");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Morotssushi");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Rödbetssushi");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Laxsushi");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Tillagat ägg");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Rå bacon");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Tillagad bacon");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Ägg med bacon");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Choklad");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Chokladkaka");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Morötter");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Kelp");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Potatisar");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Äpplen");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Melonskivor");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Tillagade kaniner");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Tillagade kycklingar");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Tillagat fårkött");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Tillagade fläskkotletter");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Stekar");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Tillagad bacon");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Rå bacon");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Tillagade ägg");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Ris");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Risfrön");
    }
}
