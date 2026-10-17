package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFJapaneseLanguageProvider extends FabricLanguageProvider {
    public MFJapaneseLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ja_jp", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "鉄のニンジン");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "ダイヤモンドのニンジン");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "エメラルドのニンジン");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "焼きニンジン");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "ニンジンの小片");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "ニンジンスープ");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "ニンジンパン");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "ニンジンパイ");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "チョコニンジン");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "鉄のリンゴ");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "ダイヤモンドのリンゴ");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "エメラルドのリンゴ");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "焼きリンゴ");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "リンゴの小片");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "リンゴスープ");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "リンゴパン");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "アップルパイ");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "チョコリンゴ");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "鉄のコンブ");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "金のコンブ");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "ダイヤモンドのコンブ");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "エメラルドのコンブ");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "コンブの小片");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "コンブスープ");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "チョコ乾燥コンブ");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "鉄のジャガイモ");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "金のジャガイモ");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "ダイヤモンドのジャガイモ");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "エメラルドのジャガイモ");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "ジャガイモの小片");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "ジャガイモスープ");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "ジャガイモパン");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "チョコスイートベリー");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "焼きファントム");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "ファントムの小片");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "ファントムスープ");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "焼きフグ");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "フグの小片");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "フグスープ");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "カボチャスープ");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "カボチャパン");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "焼き竹");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "竹の小片");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "竹スープ");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "鉄のスイカの薄切り");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "金のスイカの薄切り");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "ダイヤモンドのスイカの薄切り");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "エメラルドのスイカの薄切り");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "鉄の焼き兎肉");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "金の焼き兎肉");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "ダイヤモンドの焼き兎肉");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "エメラルドの焼き兎肉");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "鉄の焼き鳥");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "金の焼き鳥");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "ダイヤモンドの焼き鳥");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "エメラルドの焼き鳥");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "鉄の焼き羊肉");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "金の焼き羊肉");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "ダイヤモンドの焼き羊肉");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "エメラルドの焼き羊肉");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "鉄の焼き豚");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "金の焼き豚");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "ダイヤモンドの焼き豚");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "エメラルドの焼き豚");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "鉄のステーキ");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "金のステーキ");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "ダイヤモンドのステーキ");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "エメラルドのステーキ");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "米");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "鶏肉丼");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "サーモン丼");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "タラ丼");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "野菜丼");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "ライスプディング");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "ハニーライスプディング");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "竹の寿司");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "ニンジンの寿司");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "ビートルートの寿司");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "サーモン寿司");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "焼きタマゴ");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "生ベーコン");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "焼きベーコン");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "ベーコンエッグ");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "チョコレート");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "板チョコ");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "ニンジン");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "コンブ");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "ジャガイモ");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "リンゴ");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "スイカの薄切り");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "焼き兎肉");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "焼き鳥");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "焼き羊肉");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "焼き豚");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "ステーキ");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "焼きベーコン");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "生ベーコン");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "寿司");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "焼きタマゴ");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "稲");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "稲の種");
    }
}
