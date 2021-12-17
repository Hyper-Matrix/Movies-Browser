package com.example.moviesbrowser;

import com.google.gson.annotations.SerializedName;

import java.util.List;
//initial model class to store data.
public class Value {
    @SerializedName("page")
    Integer page;
    @SerializedName("results")
     List<Result> results;
    @SerializedName("total_pages")
     Integer totalPages;
    @SerializedName("total_results")
     Integer totalResults;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
}
