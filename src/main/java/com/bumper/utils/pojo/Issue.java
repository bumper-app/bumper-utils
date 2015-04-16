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

import com.bumper.utils.pojo.changeset.AbstractChangeset;
import com.bumper.utils.pojo.interfaces.SolrSerializable;
import java.util.Set;

/**
 *
 * @author math
 */
public class Issue implements SolrSerializable {

    private int id;
    private String targetVersion;
    private Dataset dataset;
    private People people;
    private Project project;
    private String exteralId;

    private Status status;
    private Severity severity;
    private Resolution resolution;

    private String shortDescription;
    private String longDescription;

    private IssueType issueType;

    private Set<LifecycleEvent> issueEvents;
    private Set<Comment> comments;
    private Set<AbstractChangeset> changesets;

    /**
     *
     */
    public Issue() {
    }

    /**
     *
     * @param version
     * @param dataset
     * @param people
     * @param project
     * @param exteralId
     * @param status
     * @param severity
     * @param resolution
     * @param shortDescription
     * @param longDescription
     * @param issueType
     * @param issueEvents
     * @param comments
     * @param changesets
     */
    public Issue(String version, Dataset dataset, People people, Project project, String exteralId, Status status, Severity severity, Resolution resolution, String shortDescription, String longDescription, IssueType issueType, Set<LifecycleEvent> issueEvents, Set<Comment> comments, Set<AbstractChangeset> changesets) {
        this.targetVersion = version;
        this.dataset = dataset;
        this.people = people;
        this.project = project;
        this.exteralId = exteralId;
        this.status = status;
        this.severity = severity;
        this.resolution = resolution;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.issueType = issueType;
        this.issueEvents = issueEvents;
        this.comments = comments;
        this.changesets = changesets;
    }

    /**
     *
     * @param id
     * @param version
     * @param dataset
     * @param people
     * @param project
     * @param exteralId
     * @param status
     * @param severity
     * @param resolution
     * @param shortDescription
     * @param longDescription
     * @param issueType
     * @param issueEvents
     * @param comments
     * @param changesets
     */
    public Issue(int id, String version, Dataset dataset, People people, Project project, String exteralId, Status status, Severity severity, Resolution resolution, String shortDescription, String longDescription, IssueType issueType, Set<LifecycleEvent> issueEvents, Set<Comment> comments, Set<AbstractChangeset> changesets) {
        this.id = id;
        this.targetVersion = version;
        this.dataset = dataset;
        this.people = people;
        this.project = project;
        this.exteralId = exteralId;
        this.status = status;
        this.severity = severity;
        this.resolution = resolution;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.issueType = issueType;
        this.issueEvents = issueEvents;
        this.comments = comments;
        this.changesets = changesets;
    }

    /**
     *
     * @param id
     */
    public Issue(int id) {
        this.id = id;
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
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     *
     * @return
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     *
     * @param dataset
     */
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     *
     * @return
     */
    public People getPeople() {
        return people;
    }

    /**
     *
     * @param people
     */
    public void setPeople(People people) {
        this.people = people;
    }

    /**
     *
     * @return
     */
    public Project getProject() {
        return project;
    }

    /**
     *
     * @param project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     *
     * @return
     */
    public String getExteralId() {
        return exteralId;
    }

    /**
     *
     * @param exteralId
     */
    public void setExteralId(String exteralId) {
        this.exteralId = exteralId;
    }

    /**
     *
     * @return
     */
    public Status getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     *
     * @param severity
     */
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    /**
     *
     * @return
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     *
     * @param resolution
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     *
     * @return
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     *
     * @param shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     *
     * @return
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     *
     * @param longDescription
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     *
     * @return
     */
    public IssueType getIssueType() {
        return issueType;
    }

    /**
     *
     * @param issueType
     */
    public void setIssueType(IssueType issueType) {
        this.issueType = issueType;
    }

    /**
     *
     * @return
     */
    public Set<LifecycleEvent> getIssueEvents() {
        return issueEvents;
    }

    /**
     *
     * @param issueEvents
     */
    public void setIssueEvents(Set<LifecycleEvent> issueEvents) {
        this.issueEvents = issueEvents;
    }

    /**
     *
     * @return
     */
    public Set<Comment> getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     */
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public Set<AbstractChangeset> getChangesets() {
        return changesets;
    }

    /**
     *
     * @param changesets
     */
    public void setChangesets(Set<AbstractChangeset> changesets) {
        this.changesets = changesets;
    }

    @Override
    public String toSolrXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
