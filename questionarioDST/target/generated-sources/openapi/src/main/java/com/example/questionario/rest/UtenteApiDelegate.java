package com.example.questionario.rest;

import com.example.questionario.model.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UtenteApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-26T14:51:54.851013600+02:00[Europe/Rome]")
public interface UtenteApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /utente : elimina un utente
     *
     * @param userDTO  (required)
     * @return utente eliminato (status code 200)
     * @see UtenteApi#deleteUser
     */
    default ResponseEntity<Void> deleteUser(UserDTO userDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /utente : registrazione di un nuovo utente
     *
     * @param userDTO  (required)
     * @return utente registrato (status code 200)
     * @see UtenteApi#saveUser
     */
    default ResponseEntity<Void> saveUser(UserDTO userDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
