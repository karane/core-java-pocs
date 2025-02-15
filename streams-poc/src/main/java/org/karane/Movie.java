package org.karane;

class Movie {
    private String title;
    private String genre;
    private double rating;
    
    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}