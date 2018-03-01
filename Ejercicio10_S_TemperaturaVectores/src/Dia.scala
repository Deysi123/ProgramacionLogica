
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object Dia {
  
  
  def llenarDias(vector: Array[Int]): Array[Int] ={
    
     var contador=0
     for(i <- 0 until vector.length){
      
       
       
       if(i%2==0){
         
         contador+=1
         vector(i)=contador
         
       }
      
       
    }

     vector
     /*for(v<-vector){
      println(v)
    }*/
     
  }
  
   def llenarTemperatura(vector: Array[Int]): Array[Int] ={
     
    
     var contador=1
     
     for(i <- 0 until vector.length){
       
       if(i%2 !=0){
          val r= Random.nextInt(26)
         
         vector(i)=r
         
       }
     }
     
      
     //print(r)
     vector
   }
   
   def elegirTemperaturas(vector: Array[Int]): Unit={
    
     var contador=0
     var promedio=0.0
     var nHoras=0
     var vector2 = ArrayBuffer[Int]()
     
     
     for(i <- 0 until vector.length ){
       
       if(vector(i)==25){
          
         
         vector2+=vector(i-1)
         vector2+=vector(i)

         contador+=1
       }
     }
     
     if(contador>=1){
       
       println()
       println("Temperaturas de 25")
        for(i <- 0 until vector2.length){
       
         if(i%2 ==0){
         
         println ("Hora " + vector2(i))
         promedio=promedio+vector2(i)
         nHoras+=1
         }
       }
       
       println("Promedio de horas "+ promedio/(nHoras))
       
     }else
       println("No se encontraron temperaturas de 25")
  }
  
  def mostrarVector(vector: Array[Int]): Unit={
    
    println("Vector: ")
    for(v<-vector){
      print(v+" ")
    }
   
  }
  def main(args: Array[String]): Unit = {
   
    val vectorDatos= new Array[Int](48)
    val vector2= ArrayBuffer[Int]()
    
    llenarDias(vectorDatos)
    llenarTemperatura(vectorDatos)
    mostrarVector(vectorDatos)
    //mostrarVector(vector2)
    println("Arreglo de temperaturas--------------")
    elegirTemperaturas(vectorDatos)
    
  }
}