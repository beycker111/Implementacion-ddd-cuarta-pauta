package com.sofka.universidad.usecase;

public interface EnvioDeCorreoService {
    Boolean enviarCorreo(String emailDestino, String asunto, String mensaje);
}
