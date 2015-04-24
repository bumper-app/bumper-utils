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

import com.bumper.utils.pojo.People;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author math
 */
public abstract class AbstractChangeset implements Serializable {

    /**
     *
     */
    protected int id;

    /**
     *
     */
    protected People commiter;

    /**
     *
     */
    protected Date commitDate;

    /**
     *
     */
    protected String commitMessage;

    /**
     *
     */
    protected String commitRevision;

    /**
     *
     */
    protected Set<Change> changes;

    /**
     *
     */
    protected ChangesetType changesetType;

    /**
     *
     */
    public AbstractChangeset() {
    }

    /**
     *
     * @param bumperId
     * @param commiter
     * @param commitDate
     * @param commitMessage
     * @param commitRevision
     * @param changes
     * @param changesetType
     */
    public AbstractChangeset(int bumperId, People commiter, Date commitDate, String commitMessage, String commitRevision, Set<Change> changes, ChangesetType changesetType) {
        this.id = bumperId;
        this.commiter = commiter;
        this.commitDate = commitDate;
        this.commitMessage = commitMessage;
        this.commitRevision = commitRevision;
        this.changes = changes;
        this.changesetType = changesetType;
    }

    /**
     *
     * @param commiter
     * @param commitDate
     * @param commitMessage
     * @param commitRevision
     * @param changes
     * @param changesetType
     */
    public AbstractChangeset(People commiter, Date commitDate, String commitMessage, String commitRevision, Set<Change> changes, ChangesetType changesetType) {
        this.commiter = commiter;
        this.commitDate = commitDate;
        this.commitMessage = commitMessage;
        this.commitRevision = commitRevision;
        this.changes = changes;
        this.changesetType = changesetType;
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
     * @param bumperId
     */
    public void setId(int bumperId) {
        this.id = bumperId;
    }

    /**
     *
     * @return
     */
    public People getCommiter() {
        return commiter;
    }

    /**
     *
     * @param commiter
     */
    public void setCommiter(People commiter) {
        this.commiter = commiter;
    }

    /**
     *
     * @return
     */
    public Date getCommitDate() {
        return commitDate;
    }

    /**
     *
     * @param commitDate
     */
    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    /**
     *
     * @return
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     *
     * @param commitMessage
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     *
     * @return
     */
    public String getCommitRevision() {
        return commitRevision;
    }

    /**
     *
     * @param commitRevision
     */
    public void setCommitRevision(String commitRevision) {
        this.commitRevision = commitRevision;
    }

    /**
     *
     * @return
     */
    public Set<Change> getChanges() {
        return changes;
    }

    /**
     *
     * @param changes
     */
    public void setChanges(Set<Change> changes) {
        this.changes = changes;
    }

    /**
     *
     * @return
     */
    public ChangesetType getChangesetType() {
        return changesetType;
    }

    /**
     *
     * @param changesetType
     */
    public void setChangesetType(ChangesetType changesetType) {
        this.changesetType = changesetType;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "AbstractChangeset{" + "bumperId=" + id + ", commiter=" + commiter + ", commitDate=" + commitDate + ", commitMessage=" + commitMessage + ", commitRevision=" + commitRevision + ", changes=" + changes + ", changesetType=" + changesetType + '}';
    }

}
