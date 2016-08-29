package com.example.dikshant.masterflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "BuyUcoin","http://www.buyucoin.com/index.html"));
        addItem(new DummyItem("2", "About","http://www.buyucoin.com/about.html"));
        addItem(new DummyItem("3", "Contact US","http://www.buyucoin.com/contactus.html"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String item_name;
        public String url;

        public DummyItem(String id, String item_name, String url) {
            this.item_name = item_name;
            this.url = url;
        }

        @Override
        public String toString() {
            return url;
        }
    }
}
