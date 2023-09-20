package com.desafio.desafioaccenture.configuraciones.model;

import java.io.Serializable;

public class CuerpoExcepcion implements Serializable {
    private static final long serialVersionUID = -2430432626264650558L;
    private Integer codigo;
    private String mensaje;
    private String tipoExcepcion;
    private String traceId;
    private String cliente;
    private String url;
    private String stackTrace;
    private String body;

    public CuerpoExcepcion() {
    }

    public CuerpoExcepcion(Integer codigo, String mensaje, String tipoExcepcion) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.tipoExcepcion = tipoExcepcion;
    }

    public CuerpoExcepcion(Integer codigo, String mensaje, String tipoExcepcion, String traceId, String stackTrace) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.tipoExcepcion = tipoExcepcion;
        this.traceId = traceId;
        this.stackTrace = stackTrace;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipoExcepcion() {
        return this.tipoExcepcion;
    }

    public void setTipoExcepcion(String tipoExcepcion) {
        this.tipoExcepcion = tipoExcepcion;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Causado por: {");
        sb.append("codigo=").append(this.codigo);
        sb.append(", mensaje='").append(this.mensaje).append('\'');
        sb.append(", tipoExcepcion='").append(this.tipoExcepcion).append('\'');
        sb.append(", traceId='").append(this.traceId).append('\'');
        sb.append(", cliente='").append(this.cliente).append('\'');
        sb.append(", url='").append(this.url).append('\'');
        sb.append(", stackTrace='").append(this.stackTrace).append('\'');
        sb.append(", body='").append(this.body).append('\'');
        sb.append('}');
        return sb.toString();
    }
}