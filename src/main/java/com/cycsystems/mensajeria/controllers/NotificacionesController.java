package com.cycsystems.mensajeria.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.*;

import com.cycsystems.mensajeria.dto.input.MensajeRequest;
import com.cycsystems.mensajeria.dto.output.MensajeResponse;
import com.cycsystems.mensajeria.entities.Empresa;
import com.cycsystems.mensajeria.entities.Mensaje;
import com.cycsystems.mensajeria.services.ICanalService;
import com.cycsystems.mensajeria.services.IEmpresaService;
import com.cycsystems.mensajeria.services.IEstadoMensajeService;
import com.cycsystems.mensajeria.services.IMensajeService;
import com.cycsystems.mensajeria.services.impl.MailServiceImpl;
import com.cycsystems.mensajeria.services.impl.SMSServiceImpl;

@RestController
@RequestMapping("/api/v1/notifications")
@CrossOrigin(origins = {"https://cycsystemsgt.com", "http://localhost:80"})
public class NotificacionesController {

	@Autowired
	private SMSServiceImpl smsService;
	
	@Autowired
	private MailServiceImpl mailService;
	
	@Autowired
	private ICanalService canalService;
	
	@Autowired
	private IEmpresaService empresaService;
	
	@Autowired
	private IEstadoMensajeService estadoMensajeService;
	
	@Autowired
	private IMensajeService mensajeService;
	
	@Value("${canal.sms}")
	private Integer CANAL_SMS;
	
	@Value("${canal.mail}")
	private Integer CANAL_MAIL;
	
	@Value("${estado.mensaje.enviado}")
	private Integer ESTADO_MENSAJE_ENVIADO;
	
	@Async
	@PostMapping("/sendMail")
	public AsyncResult<ResponseEntity<?>> enviarCorreo(@RequestBody MensajeRequest mensajeRequest) {
	
		MensajeResponse mensajeResponse = new MensajeResponse();
		
		Empresa empresa = this.empresaService.findByToken(mensajeRequest.getToken());
		if (empresa != null) {
			
			this.mailService.sendMail(
					mensajeRequest.getRemitente(),
					mensajeRequest.getDestinatario(),
					mensajeRequest.getAsunto(),
					mensajeRequest.getMensaje());
			
			Mensaje mensaje = new Mensaje();
			mensaje.setCanal(this.canalService.findById(CANAL_MAIL));
			mensaje.setRemitente(mensajeRequest.getRemitente());
			mensaje.setDestinatario(mensajeRequest.getDestinatario());
			mensaje.setEmpresa(empresa);
			mensaje.setEstado(this.estadoMensajeService.findById(ESTADO_MENSAJE_ENVIADO));
			mensaje.setFechaCreacion(new Date());
			mensaje.setFechaEnvio(new Date());
			mensaje.setTexto(mensajeRequest.getMensaje());
			
			this.mensajeService.save(mensaje);
			
			mensajeResponse.setCodigo("0001");
			mensajeResponse.setDescripcion("Mensaje enviado exitosamente");
			mensajeResponse.setIndicador("EXITO");
		} else {
			mensajeResponse.setCodigo("0002");
			mensajeResponse.setDescripcion("El token enviado no es valido");
			mensajeResponse.setIndicador("ERROR");
		}
		
		return new AsyncResult<>(ResponseEntity.ok(mensajeResponse));
	}
	
	@Async
	@PostMapping("/sendSMS")
	public AsyncResult<ResponseEntity<?>> enviarSMS(@RequestBody MensajeRequest mensajeRequest) {
		
		MensajeResponse mensajeResponse = new MensajeResponse();
		
		Empresa empresa = this.empresaService.findByToken(mensajeRequest.getToken());
		if (empresa != null) {
			
			this.smsService.sendSMS(
					mensajeRequest.getDestinatario(),
					mensajeRequest.getRemitente(),
					mensajeRequest.getMensaje());
			
			Mensaje mensaje = new Mensaje();
			mensaje.setCanal(this.canalService.findById(CANAL_MAIL));
			mensaje.setRemitente(mensajeRequest.getRemitente());
			mensaje.setDestinatario(mensajeRequest.getDestinatario());
			mensaje.setEmpresa(empresa);
			mensaje.setEstado(this.estadoMensajeService.findById(ESTADO_MENSAJE_ENVIADO));
			mensaje.setFechaCreacion(new Date());
			mensaje.setFechaEnvio(new Date());
			mensaje.setTexto(mensajeRequest.getMensaje());
			
			this.mensajeService.save(mensaje);
			
			mensajeResponse.setCodigo("0001");
			mensajeResponse.setDescripcion("Mensaje enviado exitosamente");
			mensajeResponse.setIndicador("EXITO");
		} else {
			mensajeResponse.setCodigo("0002");
			mensajeResponse.setDescripcion("El token enviado no es valido");
			mensajeResponse.setIndicador("ERROR");
		}
		
		return new AsyncResult<>(ResponseEntity.ok(mensajeResponse));
	}
}
