
package com.ken.pelay.Models;

import java.util.HashMap;
import java.util.Map;

public class TopChartModels {

    private Integer code;
    private Object msg;
    private ResultsTopChart results;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public ResultsTopChart getResults() {
        return results;
    }

    public void setResults(ResultsTopChart results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
