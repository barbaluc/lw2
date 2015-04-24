package urouen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import urouen.model.CV;
import urouen.model.CVEntry;
import urouen.model.CVList;

@Controller
@RequestMapping("/resume")
public class CVControler {

    public CVList cvList = new CVList();


    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody
    CVList getAllCV() {
        return cvList;
    }


    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    CVEntry getCVByID(@PathVariable int id) {
        CVEntry cv = new CVEntry();

        for (CVEntry cvEntry: cvList.getListCV()) {
            if (cvEntry.getId() == id) {
                cv = cvEntry;
                break;
            }
        }
        return cv;
    }


    @RequestMapping(value="", method = RequestMethod.POST)
    public @ResponseBody
    CVEntry getCVByPost(@RequestBody CVEntry cv) {
        CVEntry cvEntry = new CVEntry(cv.getId(), cv.getFirstname(), cv.getName());
        cvEntry.setId(cv.getId());
        cvEntry.setFirstname(cv.getFirstname());
        cvEntry.setName(cv.getName());

        return cvEntry;
    }

}