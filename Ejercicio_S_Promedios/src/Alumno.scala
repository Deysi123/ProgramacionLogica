import scala.collection.mutable.ArrayBuffer


object Alumno {
  
  def obtenerPromedioParcial(p1:Array[Int], p2:Array[Int], p3:Array[Int], p4:Array[Int]): Unit = {
    
    println("Promedio de parciales-----------------")
    println("Parcial 1: " + recorrerVector(p1))
    println("Parcial 2: " + recorrerVector(p2))
    println("Parcial 3: " + recorrerVector(p3))
    println("Parcial 4: " + recorrerVector(p4))
   

    
  }
  
  def recorrerVector(vector: Array[Int]): Double={
    
    var promedio=0.0
    for(v<-vector){
      
      promedio+=v
      
    }
   
    promedio/6
  }
  
  
  def obtenerPromedioMateria(p1:Array[Int], p2:Array[Int], p3:Array[Int], p4:Array[Int]): Unit = {
    
    val materia1=p1(0)+p2(0)+p3(0)+p4(0)
    val materia2=p1(1)+p2(1)+p3(1)+p4(1)
    val materia3=p1(2)+p2(2)+p3(2)+p4(2)
    val materia4=p1(3)+p2(3)+p3(3)+p4(3)
    
    
    println("Promedio de materias-----------------")
    println("materia 1: "+materia1/4)
    println("materia 2: "+materia2/4)
    println("materia 3: "+materia3/4)
    println("materia 4: "+materia4/4)
    println()
    
  }
  
  def obtenerPromedioGeneral(p1:Array[Int], p2:Array[Int], p3:Array[Int], p4:Array[Int]): Unit = {
    
    val promedio= ArrayBuffer[Int]()
    var promedioFinal=0.0
    
    promedio++=p1
    promedio++=p2
    promedio++=p3
    promedio++=p4
    
    for(c<-promedio){
      //print(c+" ")
      
      promedioFinal+=c
    
    }
    
    println()
    println("Promedio general: "+promedioFinal/24)
    
  }
  
  def main(args: Array[String]): Unit = {
    
     val parcial1= Array(60, 70, 80, 78, 70, 90);
     val parcial2= Array(60, 70, 80, 78, 70, 90);
     val parcial3= Array(60, 70, 80, 78, 70, 90);
     val parcial4= Array(60, 70, 80, 78, 70, 90);
     
     obtenerPromedioMateria(parcial1, parcial2, parcial3,parcial4)
     obtenerPromedioParcial(parcial1, parcial2, parcial3,parcial4)
     obtenerPromedioGeneral(parcial1, parcial2, parcial3,parcial4)
    
  }
}