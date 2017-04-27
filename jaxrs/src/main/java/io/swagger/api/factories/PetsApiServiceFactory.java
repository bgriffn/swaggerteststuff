package io.swagger.api.factories;

import io.swagger.api.PetsApiService;
import io.swagger.api.impl.PetsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-27T15:14:25.420Z")
public class PetsApiServiceFactory {
    private final static PetsApiService service = new PetsApiServiceImpl();

    public static PetsApiService getPetsApi() {
        return service;
    }
}
