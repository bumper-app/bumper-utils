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
package com.bumper.utils.pojo.changeset;

import com.bumper.utils.pojo.File;
import com.bumper.utils.pojo.interfaces.SolrSerializable;
import java.util.List;

/**
 *
 * @author math
 */
public class Change implements SolrSerializable {

    private int id;
    private List<String> changes;
    private String position;
    private int insertion;
    private int deletion;
    private File file;

    /**
     *
     */
    public Change() {
    }

    /**
     *
     * @param bumperID
     */
    public Change(int bumperID) {
        this.id = bumperID;
    }

    /**
     *
     * @param bumperID
     * @param changes
     * @param position
     * @param insertion
     * @param deletion
     * @param file
     */
    public Change(int bumperID, List<String> changes, String position, int insertion, int deletion, File file) {
        this.id = bumperID;
        this.changes = changes;
        this.position = position;
        this.insertion = insertion;
        this.deletion = deletion;
        this.file = file;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param bumperID
     */
    public void setId(int bumperID) {
        this.id = bumperID;
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
    public int getInsertion() {
        return insertion;
    }

    /**
     *
     * @param insertion
     */
    public void setInsertion(int insertion) {
        this.insertion = insertion;
    }

    /**
     *
     * @return
     */
    public int getDeletion() {
        return deletion;
    }

    /**
     *
     * @param deletion
     */
    public void setDeletion(int deletion) {
        this.deletion = deletion;
    }

    /**
     *
     * @return
     */
    public File getFile() {
        return file;
    }

    /**
     *
     * @param file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Change other = (Change) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toSolrXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
