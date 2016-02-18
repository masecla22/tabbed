package com.keenant.tabbed;

import javax.annotation.Nullable;

public interface CustomTabList {
    /**
     * @return The maximum number of items supported.
     */
    int getMaxItems();

    /**
     * Checks for updates to the tab items (text, ping, skin) and then sends packets if necessary.
     */
    void update();

    /**
     * Checks for updates to a tab item (text, ping, skin) and then sends packets if necessary.
     * @param index
     */
    void update(int index);

    /**
     * Gets the item at the given index.
     * @param index
     * @return The item or null if it isn't present.
     */
    @Nullable
    TabItem get(int index);

    /**
     * Checks if the tab list contains an item at the given index.
     * @param index
     * @return True if it contains an item, false if not.
     */
    boolean contains(int index);

    /**
     * Adds an item to the next available index.
     * @param item
     */
    void add(TabItem item);

    /**
     * Inserts an item at the specified index.
     * @param index
     * @param item
     */
    void add(int index, TabItem item);

    /**
     * Replaces an item at the given index.
     * @param index
     * @param item
     * @return
     */
    @Nullable
    TabItem set(int index, TabItem item);

    /**
     * Removes the item that resides at the given index.
     * @param index
     * @return The item removed or null if it isn't present.
     */
    @Nullable
    TabItem remove(int index);

    /**
     * Removes the given item from the tab list.
     * @param item
     * @param <T>
     * @return
     */
    <T extends TabItem> T remove(T item);

    /**
     * Get the next available index.
     * @return The index or -1 if the list is full.
     */
    int getNextIndex();
}
