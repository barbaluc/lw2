package urouen.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "cv_list")
public class CVList {

    private List<CVEntry> listCV;

    public CVList() {
        this.listCV = new ArrayList<CVEntry>();
        listCV.add(new CVEntry(1, "Jean", "Petitquidanse"));
        listCV.add(new CVEntry(2, "Alphonse", "Pastamob"));
        listCV.add(new CVEntry(3, "Georges", "Washington"));

    }

    public List<CVEntry> getListCV() {
        return listCV;
    }

    @XmlElement
    public void setListCV(List<CVEntry> listCV) {
        this.listCV = listCV;
    }

    public void addCV(CVEntry cvEntry) { listCV.add(cvEntry);}
}
