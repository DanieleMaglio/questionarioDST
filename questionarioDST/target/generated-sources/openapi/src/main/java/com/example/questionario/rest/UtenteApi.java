/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.questionario.rest;

import com.example.questionario.model.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-26T14:51:54.851013600+02:00[Europe/Rome]")
@Validated
@Tag(name = "utente", description = "the utente API")
public interface UtenteApi {

    default UtenteApiDelegate getDelegate() {
        return new UtenteApiDelegate() {};
    }

    /**
     * DELETE /utente : elimina un utente
     *
     * @param userDTO  (required)
     * @return utente eliminato (status code 200)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "elimina un utente",
        responses = {
            @ApiResponse(responseCode = "200", description = "utente eliminato")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/utente",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "UserDTO", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody UserDTO userDTO
    ) {
        return getDelegate().deleteUser(userDTO);
    }


    /**
     * POST /utente : registrazione di un nuovo utente
     *
     * @param userDTO  (required)
     * @return utente registrato (status code 200)
     */
    @Operation(
        operationId = "saveUser",
        summary = "registrazione di un nuovo utente",
        responses = {
            @ApiResponse(responseCode = "200", description = "utente registrato")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/utente",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> saveUser(
        @Parameter(name = "UserDTO", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody UserDTO userDTO
    ) {
        return getDelegate().saveUser(userDTO);
    }

}
