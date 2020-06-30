package com.divistant.joke.springjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Tell spring that this class is a component
@Configuration
public class ChuckConfiguration {

    // Register the dependency as a Bean
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
