package com.cindric.ivan.springbootjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //if not commented, moved to xml config
public class ChuckConfiguration {

    //@Bean //if not commented, moved to xml config
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
