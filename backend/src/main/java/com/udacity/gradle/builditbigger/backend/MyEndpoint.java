package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import com.pfisterfarm.javajokelib.*;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myJokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "fetchJoke")
    public Joke fetchJoke() {
        Joke jokeToSend = new Joke();
        jokeToSend.setJoke(JavaJokeLib.tellMeAJoke());
        return jokeToSend;
    }

}
