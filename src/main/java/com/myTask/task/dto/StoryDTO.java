package com.myTask.task.dto;

import org.springframework.data.annotation.Id;

public class StoryDTO {
    public StoryDTO() {
    }

    @Override
    public String toString() {
        return "StoryCard{" +
                "id='" + id + '\'' +
                ", epicNumber=" + epicNumber +
                ", heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", reporter='" + reporter + '\'' +
                ", assignee='" + assignee + '\'' +
                ", label='" + label + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public long getEpicNumber() {
        return epicNumber;
    }

    public void setEpicNumber(long epicNumber) {
        this.epicNumber = epicNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    private String id;
    private String heading;
    private long epicNumber;
    private String description;
    private String reporter;
    private String assignee;
    private String label;
    private String status;

}
