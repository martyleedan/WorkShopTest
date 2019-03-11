package com.contest;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	if (items[0].sellIn >= -5)
    	{items[0].sellIn = items[0].quality - 10;}
    	else if (items[0].sellIn < -5) {
        	items[0].quality = 0;
        }
    }
}