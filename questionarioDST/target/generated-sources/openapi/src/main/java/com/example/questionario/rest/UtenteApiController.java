package com.example.questionario.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-26T14:51:54.851013600+02:00[Europe/Rome]")
@Controller
@RequestMapping("${openapi.questionario.base-path:}")
public class UtenteApiController implements UtenteApi {

    private final UtenteApiDelegate delegate;

    public UtenteApiController(@Autowired(required = false) UtenteApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UtenteApiDelegate() {});
    }

    @Override
    public UtenteApiDelegate getDelegate() {
        return delegate;
    }

}
