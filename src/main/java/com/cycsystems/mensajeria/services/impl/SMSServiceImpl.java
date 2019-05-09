package com.cycsystems.mensajeria.services.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber; 

@Service
public class SMSServiceImpl {

	private static final Logger LOG = LogManager.getLogger(SMSServiceImpl.class);
	
	@Value("${twilio.account.sid}")
	private String ACCOUNT_SID;

	@Value("${twilio.account.auth.token}")
	private String AUTH_TOKEN;
	
	public void sendSMS(String to, String from, String smsMessage) {
		
		// Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator( 
                new PhoneNumber(to),  
                "MGca0f5a07c33c3663c04e712b687b1d80", 
                smsMessage)      
            .create();
		
		LOG.info("Mensaje: " + message);
	}
		
}
