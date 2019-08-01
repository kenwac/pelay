
package com.ken.pelay.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultsTopChart {

    private Integer totalresult;
    private String update_date;
    private List<Songlist> songlist = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getTotalresult() {
        return totalresult;
    }

    public void setTotalresult(Integer totalresult) {
        this.totalresult = totalresult;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public List<Songlist> getSonglist() {
        return songlist;
    }

    public void setSonglist(List<Songlist> songlist) {
        this.songlist = songlist;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
