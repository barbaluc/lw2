package urouen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cv_entry")
public class CVEntry {
    private int id;
    private String name;
    private String firstname;
    private String gender;
    private List<String> objectives;
    private List<String> experiences;
    private List<String> schools;
    private List<String> skills;
    private List<String> langages;
    private List<String> computerSkills;

    public CVEntry() {
        this.id = 11110;
    }

    public CVEntry(int id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    @XmlElement
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
