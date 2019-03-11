package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

/*    @Test
    public void should_fix_me() {
        Item[] items = new Item[] { new Item("normal", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }*/
	/*    @Test
    public void should_quality_20_if_sellin_10() {
        Item[] items = new Item[] { new Item("normal", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }*/
    @Test
    public void should_quality_20_if_sellin_10() {
        Item[] items = new Item[] { new Item("normal", 8, 18) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(8, gildedRose.items[0].sellIn);
        assertEquals(18, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_10_if_sellin_0() {
        Item[] items = new Item[] { new Item("normal", 0, 10) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(0, gildedRose.items[0].sellIn);
        assertEquals(10, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_8_if_sellin_fu1() {
        Item[] items = new Item[] { new Item("normal", -1, 8) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(-1, gildedRose.items[0].sellIn);
        assertEquals(8, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_8_if_sellin_fu5() {
        Item[] items = new Item[] { new Item("normal", -5, 0) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(-5, gildedRose.items[0].sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }
    @Test
    public void should_quality_8_if_sellin_fu6() {
        Item[] items = new Item[] { new Item("normal", -6, 0) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(-6, gildedRose.items[0].sellIn);
        assertEquals(0, gildedRose.items[0].quality);
    }
}
