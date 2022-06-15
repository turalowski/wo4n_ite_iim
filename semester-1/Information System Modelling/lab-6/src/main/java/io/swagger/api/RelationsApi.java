/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Relation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T17:45:23.160Z[GMT]")
@Validated
public interface RelationsApi {

    @Operation(summary = "", description = "Creates a new relation. Duplicates are not allowed", tags={ "relations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "relation response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Relation.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/relations",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Relation> addRelation(@Parameter(in = ParameterIn.DEFAULT, description = "Add relation", required=true, schema=@Schema()) @Valid @RequestBody Relation body);


    @Operation(summary = "", description = "deletes a single relation based on the ID supplied", tags={ "relations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "relation response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/relations/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Item> deleteRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to delete", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoints are related with the relations model of the application.", tags={ "relations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "relation response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Relation.class))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/relations/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Relation> getRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoint returns all relations from the database.", tags={ "relations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns list of relations.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Relation.class)))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/relations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Relation>> getRelations(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) BigDecimal type, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name);


    @Operation(summary = "", description = "Update relation", tags={ "relations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "relation response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/relations/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Item> updateRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);

}

