package urouen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cvs")
public class CVList {

    private List<CVEntry> cv;

    public CVList() {
        this.cv = new ArrayList<CVEntry>();
        cv.add(new CVEntry(1, "Stephane", "Herauville"));
        cv.add(new CVEntry(2, "Youen", "Chene"));
        cv.add(new CVEntry(3, "Georges", "Washington"));

    }

    public List<CVEntry> getCv() {
        return cv;
    }

    @XmlElement
    public void setCv(List<CVEntry> listCV) {
        this.cv = listCV;
    }

    public void addCV(CVEntry cvEntry) { cv.add(cvEntry);}
}
