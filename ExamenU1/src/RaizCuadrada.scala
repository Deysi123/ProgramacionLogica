//Calclular la raiz cuadrada por medio del metodo newton rapshon
//Estimacion(y) x/y Promedio(y+1)


object RaizCuadrada {
  
 def obtenerRaizIterativa(n:Int, noAproximacion:Double, c:Int): Unit={
    
    var x=n;
    var y=noAproximacion
    //var y=1.0
    var cociente=0.0
    var promedio=0.0
    var iteracion=1
    var y2=0.0
    var r=0.0
    var salir=0.0
    
    
    do{
      
      //println()
      //println("Itetacion:"+(iteracion+1))
      
      iteracion=iteracion+1
      
      //cociente=x/y;
      cociente=obtenerCociente(x,y)
      //promedio= (cociente+y)/2;
      promedio=obtenerPromedio(cociente, y)
      y=promedio
      
      
      /*println("Cociente: "+cociente)
      println("promedio"+promedio)
      println("x: "+ math.sqrt(x))
      println(y)*/
      
      /*y2=y
      r=(Math.sqrt(x))
      
      for(i<-1 to c ){
      
        y2=y2*10
        r=r*10
        
        println("y2 "+y2)
        println("r "+r)
      
      }*/
      
      y2=obtenerNoCifras(y,c)
      r=obtenerNoCifras(Math.sqrt(x),c)

      if(r.toInt==y2.toInt)
      {
        salir=salir+1
        
      }
      
      if(salir==2)
      {
       //println("Cociente: "+cociente)
       //println("promedio"+promedio)
       println("La raiz de "+ x +" es: "+ math.sqrt(x))
       println("No de iteraciones: "+ (iteracion))
       //println(y)
        y=math.sqrt(x)
        
      }
      
      
    }while(y > (math.sqrt(x)))
    
     
  }
 
 def obtenerNoCifras(n:Double, c:Int): Double ={
   
      var x=n
      
      for(i<-1 to c ){
      
        x=x*10
      }
   x
 }
 
 
 
 def obtenerAproximacion(n:Int, n2:Double): Double={
   
   var x=n
   var x2=n2
   
  while(Math.pow(x2, 2)>x){
    
    x2=x2/2
  }
    x2
 }
 
 def obtenerCociente(n:Double, n2:Double): Double={
   
   var x=n
   var y=n2
   
   x/y
 }
 
 def obtenerPromedio(n:Double, n2:Double): Double={
   
   var cociente=n
   var y=n2
   
   (cociente+y)/2
 }
  
  
  
  def main(args: Array[String]): Unit = {
   
    var y=0.0
    //var noAproximacion=18
    //println("--"+math.sqrt(2))
    println("Ingrese valor a calcular")
    var n=readInt()
    println("No. cifras")
    var c=readInt()
    
    y=obtenerAproximacion(n,n)
    println(obtenerRaizIterativa(n,y,c))
    
    //println()
    //println( y+" Ap")
    
    
  }
  
}