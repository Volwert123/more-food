package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFKoreanLanguageProvider extends FabricLanguageProvider {
    public MFKoreanLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ko_kr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "철 당근");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "다이아몬드 당근");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "에메랄드 당근");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "익힌 당근");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "당근 조각");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "당근 수프");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "당근 빵");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "당근 파이");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "초콜릿 당근");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "철 사과");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "다이아몬드 사과");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "에메랄드 사과");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "익힌 사과");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "사과 조각");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "사과 수프");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "사과 빵");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "사과 파이");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "초콜릿 사과");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "철 켈프");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "황금 켈프");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "다이아몬드 켈프");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "에메랄드 켈프");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "켈프 조각");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "켈프 수프");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "초콜릿 말린 켈프");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "철 감자");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "황금 감자");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "다이아몬드 감자");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "에메랄드 감자");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "감자 조각");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "감자 수프");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "감자 빵");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "초콜릿 달콤한 열매");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "익힌 팬텀");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "팬텀 조각");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "팬텀 수프");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "익힌 복어");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "복어 조각");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "복어 수프");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "호박 수프");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "호박 빵");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "익힌 대나무");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "대나무 조각");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "대나무 수프");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "철 수박 조각");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "황금 수박 조각");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "다이아몬드 수박 조각");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "에메랄드 수박 조각");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "철 익힌 토끼고기");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "황금 익힌 토끼고기");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "다이아몬드 익힌 토끼고기");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "에메랄드 익힌 토끼고기");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "철 익힌 닭고기");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "황금 익힌 닭고기");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "다이아몬드 익힌 닭고기");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "에메랄드 익힌 닭고기");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "철 익힌 양고기");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "황금 익힌 양고기");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "다이아몬드 익힌 양고기");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "에메랄드 익힌 양고기");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "철 익힌 돼지고기");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "황금 익힌 돼지고기");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "다이아몬드 익힌 돼지고기");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "에메랄드 익힌 돼지고기");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "철 스테이크");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "황금 스테이크");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "다이아몬드 스테이크");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "에메랄드 스테이크");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "쌀");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "치킨 덮밥");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "연어 덮밥");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "대구 덮밥");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "야채 덮밥");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "쌀 푸딩");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "꿀 쌀 푸딩");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "대나무 초밥");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "당근 초밥");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "비트 초밥");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "연어 초밥");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "익힌 달걀");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "생베이컨");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "익힌 베이컨");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "익힌 베이컨 달걀");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "초콜릿");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "초콜릿 바");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "당근");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "켈프");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "감자");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "사과");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "수박 조각");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "익힌 토끼고기");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "익힌 닭고기");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "익힌 양고기");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "익힌 돼지고기");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "스테이크");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "익힌 베이컨");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "생베이컨");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "초밥");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "익힌 달걀");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "벼");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "벼 씨앗");
    }
}
