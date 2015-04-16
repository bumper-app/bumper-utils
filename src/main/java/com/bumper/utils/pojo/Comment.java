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
package com.bumper.utils.pojo;

import java.util.Date;

/**
 *
 * @author math
 */
public class Comment {

    private int id;
    private People commenter;
    private String comment;
    private Date dateComment;

    /**
     *
     */
    public Comment() {
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
    public People getCommenter() {
        return commenter;
    }

    /**
     *
     * @param commenter
     */
    public void setCommenter(People commenter) {
        this.commenter = commenter;
    }

    /**
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     */
    public Date getDateComment() {
        return dateComment;
    }

    /**
     *
     * @param dateComment
     */
    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
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
        final Comment other = (Comment) obj;
        if (this.id != other.id) {
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
        return "Comment{" + "bumperID=" + id + ", commenter=" + commenter + ", comment=" + comment + ", dateComment=" + dateComment + '}';
    }

}
