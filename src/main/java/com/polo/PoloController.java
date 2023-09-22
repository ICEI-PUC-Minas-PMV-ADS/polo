package com.polo;

import io.micronaut.http.annotation.*;

@Controller("/polo")
public class PoloController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}