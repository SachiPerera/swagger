/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amithfernando.swagger.resteasy.api.resources;

import com.amithfernando.swagger.resteasy.api.exception.ApiException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Amith
 */
@Path("/test")
@Api(value = "/test")
@Produces({"application/json"})
public interface TestResource {

    @GET
    @Path("/hello")
    @ApiOperation(value = "Hello Test",
            notes = "Returns a Hello World reposnse"
    )
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "not found")})
    Response testResource() throws ApiException;

}
