package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        String remote = request.getRemoteAddr();
        String local = request.getLocalAddr();
        log.info("Solicitud /hello recibida desde {}", remote);
        String response = "Hola Mundo v2 desde " + local;
        log.info("Respuesta /hello enviada hacia {}", remote);
        return response;
    }

}
