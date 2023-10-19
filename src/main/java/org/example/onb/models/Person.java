package org.example.onb.models;

public class Person {
    private String dispositivo;
    private String cedula;
    private String codigoDactilar;
    private String celular;
    private String correo;
    private String ciudad;
    private String oficina;
    private String direccion;
    private String parroquia;
    private String direccionCompleta;
    private String descripcionCasa;
    private String referenciaCasa;
    private String numeroDomicilio;
    private String situacionLaboral;
    private String dependienteLaboral;
    private String nombreEmpresa;
    private String antiguedad;
    private String ingresoMensual;
    private String direccionTrabajo;
    private String referencia;
    private String telefonoTrabajo;
    private String tipoTrabajo;

    private String EgresoMensual;
    private String telefono;
    private boolean poseeActivosniPasivos;
    private String activos;
    private String pasivos;
    private String tieneOtraNacionalidad;
    private String tieneResidenciaEEUU;
    private String tieneEfectosTributarios;
    private String cuenta_mas;
    private String avisos_24;
    private String valor_cta_mas;
    private String codigoOtp;
    private String numeroCuentaGenerada;

    // Getters y setters para cada variable

    // Constructor
    public Person() {
        // Inicializa las variables aquí si es necesario
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public String getEgresoMensual() {
        return EgresoMensual;
    }

    public void setEgresoMensual(String egresoMensual) {
        EgresoMensual = egresoMensual;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoDactilar() {
        return codigoDactilar;
    }

    public void setCodigoDactilar(String codigoDactilar) {
        this.codigoDactilar = codigoDactilar;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }

    public String getDescripcionCasa() {
        return descripcionCasa;
    }

    public void setDescripcionCasa(String descripcionCasa) {
        this.descripcionCasa = descripcionCasa;
    }

    public String getReferenciaCasa() {
        return referenciaCasa;
    }

    public void setReferenciaCasa(String referenciaCasa) {
        this.referenciaCasa = referenciaCasa;
    }

    public String getNumeroDomicilio() {
        return numeroDomicilio;
    }

    public void setNumeroDomicilio(String numeroDomicilio) {
        this.numeroDomicilio = numeroDomicilio;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public String getDependienteLaboral() {
        return dependienteLaboral;
    }

    public void setDependienteLaboral(String dependienteLaboral) {
        this.dependienteLaboral = dependienteLaboral;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public boolean isPoseeActivosniPasivos() {
        return poseeActivosniPasivos;
    }

    public void setPoseeActivosniPasivos(boolean poseeActivosniPasivos) {
        this.poseeActivosniPasivos = poseeActivosniPasivos;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getActivos() {
        return activos;
    }

    public void setActivos(String activos) {
        this.activos = activos;
    }

    public String getPasivos() {
        return pasivos;
    }

    public void setPasivos(String pasivos) {
        this.pasivos = pasivos;
    }

    public String getTieneOtraNacionalidad() {
        return tieneOtraNacionalidad;
    }

    public void setTieneOtraNacionalidad(String tieneOtraNacionalidad) {
        this.tieneOtraNacionalidad = tieneOtraNacionalidad;
    }

    public String getTieneResidenciaEEUU() {
        return tieneResidenciaEEUU;
    }

    public void setTieneResidenciaEEUU(String tieneResidenciaEEUU) {
        this.tieneResidenciaEEUU = tieneResidenciaEEUU;
    }

    public String getTieneEfectosTributarios() {
        return tieneEfectosTributarios;
    }

    public void setTieneEfectosTributarios(String tieneEfectosTributarios) {
        this.tieneEfectosTributarios = tieneEfectosTributarios;
    }

    public String getCuenta_mas() {
        return cuenta_mas;
    }

    public void setCuenta_mas(String cuenta_mas) {
        this.cuenta_mas = cuenta_mas;
    }

    public String getAvisos_24() {
        return avisos_24;
    }

    public void setAvisos_24(String avisos_24) {
        this.avisos_24 = avisos_24;
    }

    public String getValor_cta_mas() {
        return valor_cta_mas;
    }

    public void setValor_cta_mas(String valor_cta_mas) {
        this.valor_cta_mas = valor_cta_mas;
    }

    public String getCodigoOtp() {
        return codigoOtp;
    }

    public void setCodigoOtp(String codigoOtp) {
        this.codigoOtp = codigoOtp;
    }

    public String getNumeroCuentaGenerada() {
        return numeroCuentaGenerada;
    }

    public void setNumeroCuentaGenerada(String numeroCuentaGenerada) {
        this.numeroCuentaGenerada = numeroCuentaGenerada;
    }
}
