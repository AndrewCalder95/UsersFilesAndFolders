package com.codelan.filesandfolders.filesandfolders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long Id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "user")
    @JsonIgnoreProperties({"folders"})
    private User user;

    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy="folder")
    private List<File> files;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();
    }

    public Folder() {
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
