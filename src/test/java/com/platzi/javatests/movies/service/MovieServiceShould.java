package com.platzi.javatests.movies.service;

import com.platzi.javatests.movies.data.MovieRepository;
import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    private  MovieRepository repository;
    private MovieService service;

    @Before
    public void setUp(){
        //Solo tengo la interfaz del repositorio, sin implementar, así que le hago un mock
        repository = Mockito.mock(MovieRepository.class);
        Mockito.when(repository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Dark Night",152, Genre.HORROR),
                        new Movie(2,"Blue Night",153, Genre.THRILLER),
                        new Movie(3,"Dfdfasd Night",142, Genre.ACTION),
                        new Movie(4,"FDsfdsfds Night",122, Genre.DRAMA),
                        new Movie(5,"ghfghsf g Night",178, Genre.COMEDY),
                        new Movie(6,"g dfasdf",174, Genre.COMEDY)

                )
        );
        service = new MovieService(repository);
    }

    @Test
    public void return_movies_by_genre() {
        Collection<Movie> movies = service.findMoviesByGenre(Genre.COMEDY);
        List<Integer> moviesIds = movies.stream().map(m->m.getId()).collect(Collectors.toList());
        Collection<Integer> comedy = Arrays.asList(5,6);

        assertTrue( moviesIds.containsAll(comedy));
    }
}