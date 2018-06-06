

object Alumno {
  
  def main(args: Array[String]): Unit = {
    
    println("Ingresa calificacion 1")
    val c1=readDouble()
    
    println("Ingresa calificacion 2")
    val c2=readDouble()
    
    println("Ingresa calificacion 3")
    val c3=readDouble()
    
    println("Ingresa calificacion 4")
    val c4=readDouble()
    
    println("Ingresa calificacion 5")
    val c5=readDouble()
    
    val promedio=obtenerPromedio(c1,c2,c3,c4,c5)
    if(promedio<=69)
    {
      println(" ")
      println("--------------------- ")
      println(" ")
      println("Calificacion Terrible")
      
    }else if(promedio>=70&&promedio<=79)
    {
      println(" ")
      println("--------------------- ")
      println(" ")
      println("Calificacion Regular")
    
    }else if(promedio>=80&&promedio<=89)
    {
      println(" ")
      println("--------------------- ")
      println(" ")
      println("Calificacion Buena")
      
    }else if(promedio>=90&&promedio<=100)
    {
      println(" ")
      println("--------------------- ")
      println(" ")
      println("Calificacion excelente")
    }
    
    
  }
  
  def obtenerPromedio(c1:Double, c2:Double, c3:Double, c4:Double, c5:Double):Double= {
  
    val promedio=(c1+c3+c2+c4+c5)/5
    promedio
  }
}