/*
 * SecuritytextOrgAPILib
 *
 * This file was automatically generated for SecurityTextOrg by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.securitytext.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import org.securitytext.api.*;
import org.securitytext.api.models.*;
import org.securitytext.api.exceptions.*;
import org.securitytext.api.http.client.HttpClient;
import org.securitytext.api.http.client.HttpContext;
import org.securitytext.api.http.request.HttpRequest;
import org.securitytext.api.http.response.HttpResponse;
import org.securitytext.api.http.response.HttpStringResponse;
import org.securitytext.api.http.client.APICallBack;
import org.securitytext.api.controllers.syncwrapper.APICallBackCatcher;

public class WhoisController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static WhoisController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the WhoisController class 
     */
    public static WhoisController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new WhoisController();
            }
        }
        return instance;
    }

    /**
     * Query the server for a Domain object
     * @param    body    Required parameter: Body of API request
     * @return    Returns the ResponsesQueryModel response from the API call 
     */
    public ResponsesQueryModel createApiWhoisQuery(
                final RequestsQueryModel body
    ) throws Throwable {
        APICallBackCatcher<ResponsesQueryModel> callback = new APICallBackCatcher<ResponsesQueryModel>();
        createApiWhoisQueryAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Query the server for a Domain object
     * @param    body    Required parameter: Body of API request
     * @return    Returns the void response from the API call 
     */
    public void createApiWhoisQueryAsync(
                final RequestsQueryModel body,
                final APICallBack<ResponsesQueryModel> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == body)
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/query");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5681418445751672831L;
            {
                    put( "user-agent", "securitytextorg-sdk/v1" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();

                            //return null on 404
                            if (_responseCode == 404)
                                callBack.onSuccess(_context, null);

                            if (_responseCode == 400)
                                throw new ResponsesErrorException("Bad Request", _context);

                            if (_responseCode == 406)
                                throw new ResponsesErrorException("Not Acceptable", _context);

                            if (_responseCode == 500)
                                throw new ResponsesErrorException("Internal Server Error", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ResponsesQueryModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ResponsesQueryModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}