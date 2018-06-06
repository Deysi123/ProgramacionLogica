

object bisiesto {
  
  
   def main(args: Array[String]): Unit = {
    
    println("Ingresa el a�o")
    val bisiesto=readInt
    
    if(hacerOperacion(bisiesto)==1)
    {
      println(" ")
      println("El "+ bisiesto+" es bisiesto")
    }else{
      
      println(" ")
      println("El "+ bisiesto+" no es bisiesto")
      
    }
  }
  
  def hacerOperacion(bisiesto:Int):Int= {
    
    
    var bisiesto=0
    if((bisiesto%400)==0){
      
      bisiesto=1
      
    }else{
      bisiesto=0
    }
    
    bisiesto
    
  }
}