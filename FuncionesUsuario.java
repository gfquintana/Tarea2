public class FuncionesUsuario{
    
    int impuestoAPagar;
    
    public Impuestos (Usuario edad, Usuario cantidadDeHijos){
        if(usuario.edad<18){
        impuestoAPagar=0;
        }
        if(usuario.edad<=18 && usuario.edad>30){            
            if(usuario.cantidadDeHijos>0){
                int descuento = cantidadDeHijos * 3%;
                 impuestoAPagar= 2000-descuento;                
            } else impuestoAPagar=2000;
        }
        
         if(usuario.edad<=30 && usuario.edad>65){
            if(usuario.cantidadDeHijos>0){
                int descuento = cantidadDeHijos * 3%;
                 impuestoAPagar= 7000-descuento;                
            } else impuestoAPagar=7000;
        }
         if(usuario.edad<=65){
            if(usuario.cantidadDeHijos>0){
                int descuento = cantidadDeHijos * 3%;
                 impuestoAPagar= 2000-descuento;                
            } else impuestoAPagar=2000;
        }
}
    
    Usuario.saldo= sueldo;
    
    
    
    
    
}