package com.divistant.joke.springjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /**
     * Tidak melakukan injection dikarenakan
     * Class ChuckNorrisQuotes merupakan Class
     * dari luar yang tidak di atur oleh Spring.
     */
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
