package com.juliuskanani.movieapi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") // represents each Movie as a document in the .
@Data // takes care of all getters, and Setters and toString Methods
@AllArgsConstructor // A constructor for all fields
@NoArgsConstructor // A constructor with no args
public class Movie {

    @Id // this property should be treated as a unique identifier for each movie.
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference // Manual reference relationships
    private List<Review> reviewIds; // an embedded relationship.
}
