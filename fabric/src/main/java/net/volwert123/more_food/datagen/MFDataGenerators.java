package net.volwert123.more_food.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.volwert123.more_food.datagen.provider.MFLootTableProvider;
import net.volwert123.more_food.datagen.provider.MFModelProvider;
import net.volwert123.more_food.datagen.provider.MFRecipeProvider;
import net.volwert123.more_food.datagen.provider.MFTagsProvider;
import net.volwert123.more_food.datagen.provider.lang.MFChineseLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFEnglishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFFrenchLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFGermanLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFItalianLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFJapaneseLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFKoreanLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFPolishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFPortugueseLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFRussianLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFSpanishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFSwedishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFTurkishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFUkrainianLanguageProvider;

public class MFDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MFLootTableProvider::new);
        pack.addProvider(MFModelProvider::new);
        pack.addProvider(MFRecipeProvider::new);
        pack.addProvider(MFTagsProvider.Items::new);
        pack.addProvider(MFTagsProvider.Blocks::new);

        pack.addProvider(MFEnglishLanguageProvider::new);
        pack.addProvider(MFFrenchLanguageProvider::new);
        pack.addProvider(MFGermanLanguageProvider::new);
        pack.addProvider(MFRussianLanguageProvider::new);
        pack.addProvider(MFSpanishLanguageProvider::new);
        pack.addProvider(MFChineseLanguageProvider::new);
        pack.addProvider(MFPortugueseLanguageProvider::new);
        pack.addProvider(MFPolishLanguageProvider::new);
        pack.addProvider(MFUkrainianLanguageProvider::new);
        pack.addProvider(MFKoreanLanguageProvider::new);
        pack.addProvider(MFJapaneseLanguageProvider::new);
        pack.addProvider(MFItalianLanguageProvider::new);
        pack.addProvider(MFTurkishLanguageProvider::new);
        pack.addProvider(MFSwedishLanguageProvider::new);
    }
}
