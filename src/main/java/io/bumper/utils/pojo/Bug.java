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
package io.bumper.utils.pojo;

import io.bumper.utils.pojo.changeset.AbstractChangeset;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author math
 */
public class Bug implements SolrSerializable {

    IssueType issueType;
    Status status;
    Severity severity;
    Resolution resolution;

    Date openDate;
    Date closeDate;

    String version;

    Project project;
    String bugId;
    String bugShortDescription;
    String bugDescription;

    List<Comment> comments;

    People reporter;
    People assignee;

    List<AbstractChangeset> changesets;

    /**
     *
     * @param issueType
     * @param status
     * @param severity
     * @param resolution
     * @param openDate
     * @param closeDate
     * @param version
     * @param project
     * @param bugId
     * @param bugShortDescription
     * @param bugDescription
     * @param comments
     * @param reporter
     * @param assignee
     * @param changesets
     */
    public Bug(IssueType issueType, Status status, Severity severity, Resolution resolution,
            Date openDate, Date closeDate, String version, Project project,
            String bugId, String bugShortDescription, String bugDescription,
            List<Comment> comments, People reporter, People assignee,
            List<AbstractChangeset> changesets) {

        this.issueType = issueType;
        this.status = status;
        this.severity = severity;
        this.resolution = resolution;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.version = version;
        this.project = project;
        this.bugId = bugId;
        this.bugShortDescription = bugShortDescription;
        this.bugDescription = bugDescription;
        this.comments = comments;
        this.reporter = reporter;
        this.assignee = assignee;
        this.changesets = changesets;
    }

    /**
     *
     * @return
     */
    public String getBugId() {
        return bugId;
    }

    /**
     *
     * @param bugId
     */
    public void setBugId(String bugId) {
        this.bugId = bugId;
    }

    /**
     *
     * @return
     */
    public String getBugShortDescription() {
        return bugShortDescription;
    }

    /**
     *
     * @param bugShortDescription
     */
    public void setBugShortDescription(String bugShortDescription) {
        this.bugShortDescription = bugShortDescription;
    }

    /**
     *
     * @return
     */
    public String getBugDescription() {
        return bugDescription;
    }

    /**
     *
     * @param bugDescription
     */
    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
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
    public Date getOpenDate() {
        return openDate;
    }

    /**
     *
     * @param openDate
     */
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    /**
     *
     * @return
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     *
     * @param closeDate
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
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
    public List<Comment> getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     */
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public People getReporter() {
        return reporter;
    }

    /**
     *
     * @param reporter
     */
    public void setReporter(People reporter) {
        this.reporter = reporter;
    }

    /**
     *
     * @return
     */
    public People getAssignee() {
        return assignee;
    }

    /**
     *
     * @param assignee
     */
    public void setAssignee(People assignee) {
        this.assignee = assignee;
    }

    /**
     *
     * @return
     */
    public List<AbstractChangeset> getChangesets() {
        return changesets;
    }

    /**
     *
     * @param changesets
     */
    public void setChangesets(List<AbstractChangeset> changesets) {
        this.changesets = changesets;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.issueType);
        hash = 71 * hash + Objects.hashCode(this.status);
        hash = 71 * hash + Objects.hashCode(this.severity);
        hash = 71 * hash + Objects.hashCode(this.resolution);
        hash = 71 * hash + Objects.hashCode(this.openDate);
        hash = 71 * hash + Objects.hashCode(this.closeDate);
        hash = 71 * hash + Objects.hashCode(this.version);
        hash = 71 * hash + Objects.hashCode(this.project);
        hash = 71 * hash + Objects.hashCode(this.bugId);
        hash = 71 * hash + Objects.hashCode(this.bugShortDescription);
        hash = 71 * hash + Objects.hashCode(this.bugDescription);
        hash = 71 * hash + Objects.hashCode(this.comments);
        hash = 71 * hash + Objects.hashCode(this.reporter);
        hash = 71 * hash + Objects.hashCode(this.assignee);
        hash = 71 * hash + Objects.hashCode(this.changesets);
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
        final Bug other = (Bug) obj;
        if (this.issueType != other.issueType) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (this.severity != other.severity) {
            return false;
        }
        if (this.resolution != other.resolution) {
            return false;
        }
        if (!Objects.equals(this.openDate, other.openDate)) {
            return false;
        }
        if (!Objects.equals(this.closeDate, other.closeDate)) {
            return false;
        }
        if (!Objects.equals(this.version, other.version)) {
            return false;
        }
        if (!Objects.equals(this.project, other.project)) {
            return false;
        }
        if (!Objects.equals(this.bugId, other.bugId)) {
            return false;
        }
        if (!Objects.equals(this.bugShortDescription, other.bugShortDescription)) {
            return false;
        }
        if (!Objects.equals(this.bugDescription, other.bugDescription)) {
            return false;
        }
        if (!Objects.equals(this.comments, other.comments)) {
            return false;
        }
        if (!Objects.equals(this.reporter, other.reporter)) {
            return false;
        }
        if (!Objects.equals(this.assignee, other.assignee)) {
            return false;
        }
        if (!Objects.equals(this.changesets, other.changesets)) {
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
        return "Bug{" + "issueType=" + issueType + ", status=" + status + ", severity=" + severity + ", resolution=" + resolution + ", openDate=" + openDate + ", closeDate=" + closeDate + ", version=" + version + ", project=" + project + ", bugId=" + bugId + ", bugShortDescription=" + bugShortDescription + ", bugDescription=" + bugDescription + ", comments=" + comments + ", reporter=" + reporter + ", assignee=" + assignee + ", changesets=" + changesets + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public String toSolrXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
