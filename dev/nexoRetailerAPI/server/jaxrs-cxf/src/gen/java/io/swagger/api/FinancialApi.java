package io.swagger.api;

import io.swagger.model.PoiIdFinancialServiceBody;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * nexo retailer API
 *
 * <p>API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈 
 *
 */
@Path("/")
public interface FinancialApi  {

    /**
     * creates a service request to a POI
     *
     * request a service, such as payment, to be done on the specified POI
     *
     */
    @POST
    @Path("/poi/{poiId}/financialService")
    @Consumes({ "application/json" })
    @Operation(summary = "creates a service request to a POI", tags={ "financial" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "service request created"),
        @ApiResponse(responseCode = "400", description = "Invalid request"),
        @ApiResponse(responseCode = "404", description = "POI not found"),
        @ApiResponse(responseCode = "500", description = "Unexpected error") })
    public void createService(@Valid PoiIdFinancialServiceBody body, @PathParam("poiId") Object poiId, @HeaderParam("Idempotency-Key") Object idempotencyKey, @HeaderParam("traceparent") Object traceparent, @HeaderParam("tracestate") Object tracestate);
}
