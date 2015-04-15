/*
 * The MIT License
 *
 * Copyright 2015 mathieu nayrolles.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.bumper.utils.pojo.changeset;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author math
 */
public class Hunk {

    List<String> changes;
    String position;
    int insertions;
    int deletions;

    /**
     *
     * @param changes
     * @param position
     * @param insertions
     * @param deletions
     */
    public Hunk(List<String> changes, String position, int insertions, int deletions) {
        this.changes = changes;
        this.position = position;
        this.insertions = insertions;
        this.deletions = deletions;
    }

    /**
     *
     * @return
     */
    public List<String> getChanges() {
        return changes;
    }

    /**
     *
     * @param changes
     */
    public void setChanges(List<String> changes) {
        this.changes = changes;
    }

    /**
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     *
     * @return
     */
    public int getInsertions() {
        return insertions;
    }

    /**
     *
     * @param insertions
     */
    public void setInsertions(int insertions) {
        this.insertions = insertions;
    }

    /**
     *
     * @return
     */
    public int getDeletions() {
        return deletions;
    }

    /**
     *
     * @param deletions
     */
    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.changes);
        hash = 11 * hash + Objects.hashCode(this.position);
        hash = 11 * hash + this.insertions;
        hash = 11 * hash + this.deletions;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hunk other = (Hunk) obj;
        if (!Objects.equals(this.changes, other.changes)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (this.insertions != other.insertions) {
            return false;
        }
        if (this.deletions != other.deletions) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hunk{" + "changes=" + changes + ", position=" + position + ", insertions=" + insertions + ", deletions=" + deletions + '}';
    }

}
