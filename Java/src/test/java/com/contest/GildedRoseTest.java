package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_quality_19_9_fix_me() {
        Item[] items = new Item[] { new Item("normal", 9, 19) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_0_fu6_fix_me() {
        Item[] items = new Item[] { new Item("normal", -6, 0) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(-6, (gildedRose.items[0]).sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_50_40_fix_me() {
        Item[] items = new Item[] { new Item("normal", 40, 50) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(40, (gildedRose.items[0]).sellIn);
        assertEquals(50, gildedRose.items[0].quality);
    }
}
