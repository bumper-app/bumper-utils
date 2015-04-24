/*
 * Copyright (C) 2015 Mathieu Nayrolles
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.bumper.utils.pojo;

import java.util.Date;

/**
 *
 * @author math
 */
public class LifecycleEvent {

    private int id;
    private Date date;
    private People people;
    private String eventType;
    private String message;

    /**
     *
     */
    public LifecycleEvent() {
    }

    /**
     *
     * @param id
     */
    public LifecycleEvent(int id) {
        this.id = id;
    }

    /**
     *
     * @param id
     * @param date
     * @param people
     * @param eventType
     */
    public LifecycleEvent(int id, Date date, People people, String eventType) {
        this.id = id;
        this.date = date;
        this.people = people;
        this.eventType = eventType;
    }

    public LifecycleEvent(Date date, People people, String eventType) {
        this.date = date;
        this.people = people;
        this.eventType = eventType;
    }

    public LifecycleEvent(Date date, People people, String eventType, String message) {
        this.date = date;
        this.people = people;
        this.eventType = eventType;
        this.message = message;
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

    /**
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "\n \t LifecycleEvent{" + "id=" + id + ", date=" + date + ", people=" + people + ", eventType=" + eventType + ", message=" + message + '}';
    }

}
