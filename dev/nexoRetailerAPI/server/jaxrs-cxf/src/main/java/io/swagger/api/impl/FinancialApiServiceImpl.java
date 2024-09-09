package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.PoiIdFinancialServiceBody;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * nexo retailer API
 *
 * <p>API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈 
 *
 */
public class FinancialApiServiceImpl implements FinancialApi {
    /**
     * creates a service request to a POI
     *
     * request a service, such as payment, to be done on the specified POI
     *
     */
    public void createService(PoiIdFinancialServiceBody body, Object poiId, Object idempotencyKey, Object traceparent, Object tracestate) {
        // TODO: Implement...
        
        
    }
    
}

