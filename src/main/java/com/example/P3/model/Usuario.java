package com.example.P3.model;

public class Usuario {

    private String nombre;
    private String apellido;
    private String correo;
    private String barrio;
    private String ciudad;
    private String pais;
    private Long telef;
    private int cedula;
    private String oficio;
    private int salario;
    
    public Usuario() {}
    /*se realiza una vista publica - nombre (retornable)*/
        public String getNombre(){
            return nombre;
        }
        
        /*Se realiza la acción envío (no retornable)*/
        public void setNombre(String nombre){
            this.nombre = nombre;
            
        }
        
        public String getApellido(){
            return apellido;
               }
        public void setApellido(String apellido) {
            this.apellido = apellido;
    }
        public String getCorreo(){
            return correo;
}
        public void setCorreo(String correo){
            this.correo = correo;
        }
    
        
        public String getBarrio(){
        return barrio;
        }
        public void setBarrio(String barrio){
         this.barrio = barrio;   
            
        }    
        
        public String getCiudad(){
        return ciudad;
        }
        
        public void setCiudad(String ciudad){
        
            this.ciudad = ciudad;
         }
        
        
        public String getPais(){
            return pais;
        }
        public void setPais(String pais){
            this.pais = pais;
        }

        
        
        public Long getTelef(){
            return telef;
        }
        public void setTelef(Long telef){
            this.telef = telef;
        }
        
        
        public int getCedula(){
        return cedula;
        }
        public void setCedula(){
                this.cedula = cedula;
        }
        
        
        public String getOficio(){
        return oficio;
        }
        public void setOficio(String oficio){
        this.oficio = oficio;
        }
        public int  getSalario(){
       return salario;
        }
        public void setSalario(){
        this.salario = salario;
        }        
}
