/**
 * Copyright (C) 2015 Mathieu Nayrolles
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
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
