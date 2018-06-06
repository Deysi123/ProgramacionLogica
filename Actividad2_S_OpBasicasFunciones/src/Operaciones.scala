//Obtener perimetro o area de un circulo, tringulo o rectangulo

object Operaciones {
  
  def main(args: Array[String]): Unit = {
    
    var opcion=1
    
    do{
      
       var figura=ejecutarMenu()
    
    println("Elige: 1)Area  2)Perimetro")
    val operacion=readByte()
    
    
    if(operacion==1)//Area
    {
      if(figura==1)//C
      {
        
        println("Ingresa el radio del circulo")
        val radio=readDouble()
        println("Area del circulo:"+obtenerAreaCirculo(radio))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
      
        
      }else if(figura==2){//T
        
        println("Ingresa la altura del triangulo")
        val h=readDouble()
        println("Ingresa la base del triangulo")
        val b=readDouble()
        
        println("Area del triangulo:"+obtenerAreaTriangulo(h,b))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
        
        
        
      }else{//R
        
        println("Ingresa lado 1 del rectangulo")
        val l=readDouble()
        println("Ingresa lado 2 del rectangulo")
        val a=readDouble()
        
        println("Area del rectangulo:"+obtenerAreaRectangulo(l,a))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
        
      }
      
    }else if(operacion==2)//Perimetro
    {
      if(figura==1){
        
        println("Ingresa el diametro del circulo")
        val perimetro=readDouble()
        println("Perimetro del circulo:"+obtenerAreaCirculo(perimetro))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
      
      }
      else if(figura==2){
        
        println("Ingresa la base del triangulo")
        val b=readDouble()
        println("Ingresa lado 1 del triangulo")
        val l1=readDouble()
        println("Ingresa lado 2 del triangulo")
        val l2=readDouble()
        
        println("Perimetro del triangulo:"+ obtenerPermietroTriangulo(b,l1,l2))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
        
        
      }
      else{
        println("Ingresa lado 1 del rectangulo")
        val l=readDouble()
        println("Ingresa lado 2 del rectangulo")
        val a=readDouble()
        
        println("Perimetro del rectangulo:"+obtenerPermietroRectangulo(l,a))
        println("  ")
        println("---------Elije-------------")
        println("1)Regresar a Men�")
        println("2)Salir")
        opcion=readByte
      }
    }
      
      
      
    }while(opcion==1)
      
 
  }
  
  def ejecutarMenu(): Byte= {
    
    println("=====Menu=====")
    println(" ")
    println("1) Circulo")
    println("2) Triangulo")
    println("3) Rectangulo")
    var figura=readByte()
    
    if(figura>3||figura<0){
      println("Opcion invalida, elige un numero del 1-3")
      ejecutarMenu()
    }
    
    
    figura
  }
  
  def obtenerAreaCirculo(r:Double):Double= {
  
    val area=((math.Pi)*(r*r))
    area
  }
  
  def obtenerAreaTriangulo(h:Double, b:Double):Double={
    val area=(b*h)/2
    area
  }
  
  def obtenerAreaRectangulo(l:Double, a:Double):Double={
    val area=(l*a)
    area
  }
  
   def obtenerPermietroCirculo(d:Double):Double={
     val perimetro=((math.Pi)*(d))
     perimetro
  }
   
  def obtenerPermietroTriangulo(l1:Double, l2:Double, b: Double):Double={
     val perimetro=(l1+l2+b)
     perimetro
  }
  
  def obtenerPermietroRectangulo(l:Double, a:Double):Double={
     val perimetro=(l+l+a+a)
     perimetro
  }
  
  
}