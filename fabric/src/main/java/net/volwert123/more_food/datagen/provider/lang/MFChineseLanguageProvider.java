package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFChineseLanguageProvider extends FabricLanguageProvider {
    public MFChineseLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "铁胡萝卜");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "钻石胡萝卜");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "绿宝石胡萝卜");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "熟胡萝卜");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "胡萝卜块");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "胡萝卜汤");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "胡萝卜面包");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "胡萝卜派");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "巧克力胡萝卜");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "铁苹果");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "钻石苹果");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "绿宝石苹果");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "熟苹果");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "苹果片");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "苹果汤");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "苹果面包");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "苹果派");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "巧克力苹果");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "铁海带");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "金海带");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "钻石海带");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "绿宝石海带");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "海带片");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "海带汤");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "巧克力干海带");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "铁马铃薯");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "金马铃薯");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "钻石马铃薯");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "绿宝石马铃薯");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "马铃薯块");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "马铃薯汤");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "马铃薯面包");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "巧克力甜浆果");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "熟幻翼肉");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "幻翼肉块");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "幻翼汤");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "熟河豚");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "河豚块");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "河豚汤");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "南瓜汤");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "南瓜面包");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "熟竹子");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "竹笋片");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "竹子汤");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "铁西瓜片");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "金西瓜片");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "钻石西瓜片");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "绿宝石西瓜片");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "铁熟兔肉");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "金熟兔肉");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "钻石熟兔肉");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "绿宝石熟兔肉");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "铁熟鸡肉");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "金熟鸡肉");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "钻石熟鸡肉");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "绿宝石熟鸡肉");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "铁熟羊肉");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "金熟羊肉");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "钻石熟羊肉");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "绿宝石熟羊肉");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "铁熟猪排");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "金熟猪排");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "钻石熟猪排");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "绿宝石熟猪排");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "铁牛排");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "金牛排");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "钻石牛排");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "绿宝石牛排");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "大米");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "鸡肉盖饭");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "鲑鱼盖饭");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "鳕鱼盖饭");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "蔬菜盖饭");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "大米布丁");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "蜂蜜大米布丁");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "竹子寿司");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "胡萝卜寿司");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "甜菜根寿司");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "鲑鱼寿司");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "熟鸡蛋");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "生培根");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "熟培根");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "培根煎蛋");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "巧克力");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "巧克力排");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "胡萝卜");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "海带");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "马铃薯");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "苹果");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "西瓜片");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "熟兔肉");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "熟鸡肉");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "熟羊肉");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "熟猪排");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "牛排");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "熟培根");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "生培根");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "寿司");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "熟鸡蛋");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "水稻");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "稻种");
    }
}
