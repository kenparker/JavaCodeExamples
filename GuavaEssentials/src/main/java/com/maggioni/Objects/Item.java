package com.maggioni.Objects;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/**
 *
 * http://www.javacodegeeks.com/2011/09/google-guava-libraries-essentials.html
 */
public class Item {

    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = Preconditions.checkNotNull(id, "id must not be null");
        this.name = Preconditions.checkNotNull(name, "name must not be null");
        Preconditions.checkArgument(name.length() > 6, "name must be longer than 6 chars");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getName());
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("id", getId()).add("name", getName()).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Item)) {
            return false;
        }
        Item other = (Item) o;
        return Objects.equal(getId(), other.getId()) && Objects.equal(getName(), other.getName());
    }
}
