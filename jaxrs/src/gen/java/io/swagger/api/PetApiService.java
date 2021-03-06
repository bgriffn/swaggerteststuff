package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.File;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-27T15:14:25.420Z")
public abstract class PetApiService {
    public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByStatus(List<String> status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findPetsByTags(List<String> tags,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response uploadFile(Long petId,String additionalMetadata,InputStream fileInputStream, FormDataContentDisposition fileDetail,SecurityContext securityContext) throws NotFoundException;
}
