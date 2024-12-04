package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Data;

@Data
public class Notes {

    private Integer noteId;
    private String noteTitle;
    private String noteDescription;
    private Integer userId;

    public Notes(String title, String description) {
        this.noteTitle=title;
        this.noteDescription=description;
    }
}
