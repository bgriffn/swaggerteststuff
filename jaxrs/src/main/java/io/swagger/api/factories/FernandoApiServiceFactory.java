package io.swagger.api.factories;

import io.swagger.api.FernandoApiService;
import io.swagger.api.impl.FernandoApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-27T15:28:55.014Z")
public class FernandoApiServiceFactory {
    private final static FernandoApiService service = new FernandoApiServiceImpl();

    public static FernandoApiService getFernandoApi() {
        return service;
    }
}
