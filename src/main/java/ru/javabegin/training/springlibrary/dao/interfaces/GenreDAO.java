package ru.javabegin.training.springlibrary.dao.interfaces;


import ru.javabegin.training.springlibrary.entities.Genre;

import java.util.List;

public interface GenreDAO {

    List<Genre> getGenres();

}
