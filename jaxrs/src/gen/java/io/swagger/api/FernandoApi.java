package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FernandoApiService;
import io.swagger.api.factories.FernandoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Pet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/fernando")


@io.swagger.annotations.Api(description = "the fernando API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-27T15:28:55.014Z")
public class FernandoApi  {
   private final FernandoApiService delegate = FernandoApiServiceFactory.getFernandoApi();

    @POST
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Add a new pet to the store", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "petstore_auth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @io.swagger.annotations.AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = void.class) })
    public Response addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true) Pet body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPet(body,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/xml" })
    @Produces({ "application/json", "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing pet", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "petstore_auth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "write:pets", description = "modify pets in your account"),
            @io.swagger.annotations.AuthorizationScope(scope = "read:pets", description = "read your pets")
        })
    }, tags={ "pet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = void.class) })
    public Response updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true) Pet body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePet(body,securityContext);
    }
}
