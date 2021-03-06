package com.volkosky.sfgjokesapp.services;

import com.volkosky.sfgjokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public Joke getJoke() {
        return new Joke(chuckNorrisQuotes.getRandomQuote());
    }
}
