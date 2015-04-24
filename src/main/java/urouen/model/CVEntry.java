package urouen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cv_entry")
public class CVEntry {
    private int id;
    private String firstname;
    private String name;
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

    public CVEntry(int id, String firstname, String name) {
        this.id = id;
        this.firstname = firstname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    @XmlElement
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }


}
