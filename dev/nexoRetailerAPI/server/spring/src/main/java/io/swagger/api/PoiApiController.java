package io.swagger.api;

import io.swagger.model.PoiIdFinancialServiceBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")
@RestController
public class PoiApiController implements PoiApi {

    private static final Logger log = LoggerFactory.getLogger(PoiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PoiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createService(@Parameter(in = ParameterIn.PATH, description = "Identifier of the POI", required=true, schema=@Schema()) @PathVariable("poiId") Object poiId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody PoiIdFinancialServiceBody body
,@Parameter(in = ParameterIn.HEADER, description = "The idempotency key is a free identifier created by the client to identify a request. It is used by the service to identify subsequent retries of the same request and ensure idempotent behavior by sending the same response without executing the request a second time.  Clients should be careful as any subsequent requests with the same key may return the same response without further check. Therefore, it is recommended to use an UUID version 4 (random) or any other random string with enough entropy to avoid collisions.  Idempotency keys expire after 24 hours. Clients are responsible to stay within this limits, if they require idempotent behavior. " ,schema=@Schema()) @RequestHeader(value="Idempotency-Key", required=false) Object idempotencyKey
,@Parameter(in = ParameterIn.HEADER, description = "describes the position of the incoming request in its trace graph  in a portable, fixed-length format.  Its design focuses on fast parsing.  Every tracing tool MUST properly set traceparent even when it only relies  on vendor-specific information in tracestate. The traceparent HTTP header field identifies the incoming request in a tracing system. It has four fields: - version-format: 2 bytes, \"00-\" in ASCII - trace-id: 32 bytes, a unique identifier for the trace, represented as a 16-byte array, formatted as a 32-digit hexadecimal number - parent-id: 16 bytes, a unique identifier for the span, represented as an 8-byte array, formatted as a 16-digit hexadecimal number - trace-flags: An 8-bit field that controls tracing flags such as sampling, trace level, etc   Example Value = 00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01   base16(version) = 00   base16(trace-id) = 4bf92f3577b34da6a3ce929d0e0e4736   base16(parent-id) = 00f067aa0ba902b7   base16(trace-flags) = 01  // sampled " ,schema=@Schema()) @RequestHeader(value="traceparent", required=false) Object traceparent
,@Parameter(in = ParameterIn.HEADER, description = "extends traceparent with vendor-specific data represented by a set of name/value pairs. Storing information in tracestate is optional. " ,schema=@Schema()) @RequestHeader(value="tracestate", required=false) Object tracestate
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
