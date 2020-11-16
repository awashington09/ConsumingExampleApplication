package com.example.ConsumingExample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private final String status;
    private final String copyright;
    private final String section;
    private final String last_updated;
    private final long num_results;
    private final ArrayList<Results> results;

    public Quote(String status, String copyright, String section, String last_updated, long num_results, ArrayList<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.section = section;
        this.last_updated = last_updated;
        this.num_results = num_results;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getSection() {
        return section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public long getNum_results() {
        return num_results;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "status='" + status +
                ", copyright=" + copyright  +
                ", section=" + section + ", last_updated =" + last_updated +
                ", num_results=" + num_results + ", results=" + results + '\'' +
                '}';
    }
}
