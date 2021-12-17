package com.example.moviesbrowser;

import com.google.gson.annotations.SerializedName;

import java.util.List;
//model class to store result data passed from Value model class

public class Result {
    @SerializedName("original_name")
      String originalName;
    @SerializedName("origin_country")
      List<String> originCountry = null;
    @SerializedName("genre_ids")
      List<Integer> genreIds = null;
    @SerializedName("original_language")
      String originalLanguage;
    @SerializedName("vote_count")
      Integer voteCount;
    @SerializedName("poster_path")
      String posterPath;
    @SerializedName("vote_average")
      Double voteAverage;
    @SerializedName("overview")
      String overview;
    @SerializedName("id")
      Integer id;
    @SerializedName("first_air_date")
      String firstAirDate;
    @SerializedName("name")
      String name;
    @SerializedName("backdrop_path")
      String backdropPath;
    @SerializedName("popularity")
      Double popularity;
    @SerializedName("media_type")
      String mediaType;
    @SerializedName("original_title")
      String originalTitle;
    @SerializedName("title")
      String title;
    @SerializedName("release_date")
      String releaseDate;
    @SerializedName("adult")
      Boolean adult;
    @SerializedName("video")
      Boolean video;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public List<String> getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(List<String> originCountry) {
        this.originCountry = originCountry;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }
}
