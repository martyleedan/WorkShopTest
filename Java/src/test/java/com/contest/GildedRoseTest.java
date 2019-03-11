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
}
