

object Prestamo {
  
  
  def main(args: Array[String]): Unit = {
    
    println("--------------------Ingresa tus datos--------------")
    println(" ")
    
    println("Ingresa tu nombre")
    val nombre = readLine
    println("Historia crediticia 'm' mala y 'b' buena")
    val historia=readLine
    println("Cantidad que se desea pedir")
    val cantidad=readDouble
    println("Salario anual")
    val salario=readDouble
    println("Valor de otras propiedades")
    val propiedades=readDouble
    
    if(historia.equals("b")){
      
      val puntos=procesarSolucitud(cantidad,salario,propiedades)
      
      if(puntos>=6){
        
        println("-----------------------")
        println(" ")
        println("No. de puntos: "+ puntos)
        println("Aceptado!!!")
        
      }else{
        
        println("-----------------------")
        println(" ")
        println("No. de puntos: "+ puntos)
        println("Rechazado")
        
      }
      
      
    
    }else
    {
      println("No aceptado")
    }
    
  }
  
  def procesarSolucitud(c:Double,s:Double,p:Double): Byte={
    
    var puntos=0;
    
    if(s>=(c*.5)){
      
      puntos=puntos+5
    }
    else if(s>=(c*.25)){
      
      puntos=puntos+3
    }
    else if(s>=(c*.10)){
      
      puntos=puntos+1
    }
    
    
    if(p>=(c*2)){
      
      puntos=puntos+5
    }
    else if(p>=(c)){
      
      puntos=puntos+3
    }
    
    
   
    
    puntos.byteValue() 
    
  }
}