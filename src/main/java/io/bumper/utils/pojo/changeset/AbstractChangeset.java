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

import io.bumper.utils.pojo.People;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author math
 */
public abstract class AbstractChangeset {

    List<String> files;
    List<Hunk> hunks;
    People commiter;
    Date commitDate;
    String commitMessage;
    int insertions;
    int deletions;

    /**
     *
     * @param files
     * @param hunks
     * @param commiter
     * @param commitDate
     * @param commitMessage
     * @param insertions
     * @param deletions
     */
    public AbstractChangeset(List<String> files, List<Hunk> hunks, People commiter, Date commitDate, String commitMessage, int insertions, int deletions) {
        this.files = files;
        this.hunks = hunks;
        this.commiter = commiter;
        this.commitDate = commitDate;
        this.commitMessage = commitMessage;
        this.insertions = insertions;
        this.deletions = deletions;
    }

    /**
     *
     * @return
     */
    public List<String> getFiles() {
        return files;
    }

    /**
     *
     * @param files
     */
    public void setFiles(List<String> files) {
        this.files = files;
    }

    /**
     *
     * @return
     */
    public List<Hunk> getHunks() {
        return hunks;
    }

    /**
     *
     * @param hunks
     */
    public void setHunks(List<Hunk> hunks) {
        this.hunks = hunks;
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
        hash = 79 * hash + Objects.hashCode(this.files);
        hash = 79 * hash + Objects.hashCode(this.hunks);
        hash = 79 * hash + Objects.hashCode(this.commiter);
        hash = 79 * hash + Objects.hashCode(this.commitDate);
        hash = 79 * hash + Objects.hashCode(this.commitMessage);
        hash = 79 * hash + this.insertions;
        hash = 79 * hash + this.deletions;
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
        final AbstractChangeset other = (AbstractChangeset) obj;
        if (!Objects.equals(this.files, other.files)) {
            return false;
        }
        if (!Objects.equals(this.hunks, other.hunks)) {
            return false;
        }
        if (!Objects.equals(this.commiter, other.commiter)) {
            return false;
        }
        if (!Objects.equals(this.commitDate, other.commitDate)) {
            return false;
        }
        if (!Objects.equals(this.commitMessage, other.commitMessage)) {
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
        return "AbstractChangeset{" + "files=" + files + ", hunks=" + hunks + ", commiter=" + commiter + ", commitDate=" + commitDate + ", commitMessage=" + commitMessage + ", insertions=" + insertions + ", deletions=" + deletions + '}';
    }

}
