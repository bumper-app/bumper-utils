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

import io.bumper.utils.pojo.People;
import java.util.Date;
import java.util.List;

/**
 *
 * @author math
 */
public class MercurialChangeset extends AbstractChangeset {

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
    public MercurialChangeset(List<String> files, List<Hunk> hunks, People commiter, Date commitDate, String commitMessage, int insertions, int deletions) {
        super(files, hunks, commiter, commitDate, commitMessage, insertions, deletions);
    }

}
