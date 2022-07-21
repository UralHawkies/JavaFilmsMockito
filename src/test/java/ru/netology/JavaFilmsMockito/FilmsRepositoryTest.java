package ru.netology.JavaFilmsMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsRepositoryTest {

    @Test
    public void shouldAddNewFilm() {
        FilmsRepository repo = new FilmsRepository();

        repo.addFilm("film1");

        String[] expected = {"film1"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        FilmsRepository repo = new FilmsRepository();

        repo.addFilm("film1");
        repo.addFilm("film2");
        repo.addFilm("film3");
        repo.addFilm("film4");
        repo.addFilm("film5");
        repo.addFilm("film6");
        repo.addFilm("film7");
        repo.addFilm("film8");
        repo.addFilm("film9");
        repo.addFilm("film10");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        FilmsRepository manager = new FilmsRepository (10);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
