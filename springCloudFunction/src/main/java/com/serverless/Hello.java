package com.serverless;

import org.springframework.stereotype.*;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.common.base.Function;


@Component
public class Hello implements Function<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent>  {
	@Override
	public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
		APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
		responseEvent.setStatusCode(200);
		responseEvent.setBody(" hello garg" + input.getBody());
		return responseEvent ;
	}

}
