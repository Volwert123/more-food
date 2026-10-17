package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFUkrainianLanguageProvider extends FabricLanguageProvider {
    public MFUkrainianLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Залізна морква");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Діамантова морква");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Смарагдова морква");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Смажена морква");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Шматочки моркви");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Морквяний суп");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Морквяний хліб");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Морквяний пиріг");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Шоколадна морква");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Залізне яблуко");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Діамантове яблуко");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Смарагдове яблуко");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Печене яблуко");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Шматочки яблука");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Яблучний суп");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Яблучний хліб");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Яблучний пиріг");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Шоколадне яблуко");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Залізна ламінарія");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Золота ламінарія");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Діамантова ламінарія");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Смарагдова ламінарія");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Шматочки ламінарії");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Суп з ламінарії");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Шоколадна сушена ламінарія");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Залізна картопля");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Золота картопля");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Діамантова картопля");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Смарагдова картопля");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Шматочки картоплі");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Картопляний суп");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Картопляний хліб");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Шоколадні солодкі ягоди");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Смажений фантом");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Шматочки фантома");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Суп з фантома");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Смажений скелезуб");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Шматочки скелезуба");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Суп зі скелезуба");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Гарбузовий суп");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Гарбузовий хліб");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Смажений бамбук");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Шматочки бамбука");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Бамбуковий суп");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Залізна скибка кавуна");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Золота скибка кавуна");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Діамантова скибка кавуна");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Смарагдова скибка кавуна");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Залізна смажена кролятина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Золота смажена кролятина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Діамантова смажена кролятина");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Смарагдова смажена кролятина");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Залізна смажена курятина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Золота смажена курятина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Діамантова смажена курятина");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Смарагдова смажена курятина");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Залізна смажена баранина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Золота смажена баранина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Діамантова смажена баранина");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Смарагдова смажена баранина");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Залізна смажена свинина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Золота смажена свинина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Діамантова смажена свинина");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Смарагдова смажена свинина");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Залізний стейк");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Золотий стейк");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Діамантовий стейк");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Смарагдовий стейк");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Рис");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Миска рису з куркою");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Миска рису з лососем");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Миска рису з тріскою");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Миска рису з овочами");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Рисовий пудинг");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Рисовий медовий пудинг");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Суші з бамбуком");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Суші з морквою");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Суші з буряком");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Суші з лососем");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Варене яйце");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Сирий бекон");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Смажений бекон");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Варене яйце з беконом");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Шоколад");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Плитка шоколаду");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Морква");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Ламінарія");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Картопля");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Яблука");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Скибки кавуна");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Смажена кролятина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Смажена курятина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Смажена баранина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Смажена свинина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Стейки");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Смажений бекон");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Сирий бекон");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Суші");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Варені яйця");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Рис");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Насіння рису");
    }
}
