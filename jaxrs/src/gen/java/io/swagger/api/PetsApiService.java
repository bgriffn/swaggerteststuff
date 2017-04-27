package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Pet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-27T15:14:25.420Z")
public abstract class PetsApiService {
    public abstract Response addPet(Pet body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePet(Pet body,SecurityContext securityContext) throws NotFoundException;
}
