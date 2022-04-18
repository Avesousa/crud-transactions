package com.tenpo.transaction.exception;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ApiResponses(value = {
    @ApiResponse(responseCode = "404", description = "Data not found", content = {
        @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),
    @ApiResponse(responseCode = "405", description = "Endpoint not allowed", content = {
        @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),
    @ApiResponse(responseCode = "405", description = "Endpoint not allowed", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),
    @ApiResponse(responseCode = "401", description = "not authorized", content = {
        @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),
    @ApiResponse(responseCode = "500", description = "Error unexpected or Error occurred converting format algorithm", content = {
        @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),
    @ApiResponse(responseCode = "502", description = "Error with other services", content = {
        @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorMessage.class))
    }),})
@ControllerAdvice
@Getter
public class ApiExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ApiExceptionHandler.class);

    @ExceptionHandler({NotFoundContentException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessage noContent(HttpServletRequest request, NotFoundContentException ex) {
        ErrorMessage error = new ErrorMessage(ex.getMessage());
        logger(error, request);
        return error;
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public ErrorMessage methodNotSupported(HttpServletRequest request, HttpRequestMethodNotSupportedException ex) {
        ErrorMessage error = new ErrorMessage("The endpoint not allowed");
        logger(error, request);
        return error;
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorMessage fatalErrorUnexpected(HttpServletRequest request, Exception ex) {
        ErrorMessage error = new ErrorMessage(String.format("An error has occurred unexpected ex: %s", ex.getMessage()));
        logger(error, request);
        return error;
    }

    @ExceptionHandler({BadBodyException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessage badGateway(HttpServletRequest request, BadBodyException ex) {
        ErrorMessage error = new ErrorMessage(ex.getMessage());
        logger(error, request);
        return new ErrorMessage(ex.getMessage());
    }

    @ExceptionHandler({AuthorizationException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public ErrorMessage notAuthorization(HttpServletRequest request, AuthorizationException ex) {
        ErrorMessage error = new ErrorMessage("User not authorization");
        logger(error, request);
        return new ErrorMessage(ex.getMessage());
    }

    @ExceptionHandler({InternalAuthenticationServiceException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public ErrorMessage notAuthorization(HttpServletRequest request, InternalAuthenticationServiceException ex) {
        ErrorMessage error = new ErrorMessage("Could not log in");
        logger(error, request);
        return new ErrorMessage(error.getMessage());
    }

    private void logger(ErrorMessage error, HttpServletRequest request) {
        LOG.error(String.format("[%s%s] :: %s", request.getContextPath(), request.getServletPath(), error.getMessage()));
    }

}
