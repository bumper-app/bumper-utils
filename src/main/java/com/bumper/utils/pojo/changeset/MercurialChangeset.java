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
import java.util.Date;
import java.util.Set;

/**
 *
 * @author math
 */
public class MercurialChangeset extends AbstractChangeset {

    /**
     *
     * @param bumperId
     * @param commiter
     * @param commitDate
     * @param commitMessage
     * @param commitRevision
     * @param changes
     */
    public MercurialChangeset(int bumperId, People commiter, Date commitDate, String commitMessage, String commitRevision, Set<Change> changes) {
        super(bumperId, commiter, commitDate, commitMessage, commitRevision, changes, ChangesetType.MERCURIAL);
    }

    /**
     *
     * @param commiter
     * @param commitDate
     * @param commitMessage
     * @param commitRevision
     * @param changes
     */
    public MercurialChangeset(People commiter, Date commitDate, String commitMessage, String commitRevision, Set<Change> changes) {
        super(commiter, commitDate, commitMessage, commitRevision, changes, ChangesetType.MERCURIAL);
    }

    @Override
    public String toSolrXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
