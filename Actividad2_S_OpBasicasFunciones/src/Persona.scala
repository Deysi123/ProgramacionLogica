

object Persona {
  
  
  def main(args: Array[String]): Unit = {
    
    println("Ingresa tu peso en kg")
    val kg=readDouble()
    
    println("Ingresa tu altura en m")
    val altura=readDouble()
    
    val imc=calcularIMC(kg,altura)
    
    if(imc<16)
    {
      println("")
      println("------Resultado------")
      println("Ingreso al hospital!!")
    }
    else if(imc<=17){
      
      println("")
      println("------Resultado------")
      println("Infrapeso")
    
    }
    else if(imc<=18){
      
      println("")
      println("------Resultado------")
      println("Bajo peso")
    
    }
    else if(imc<=25){
      
      println("")
      println("------Resultado------")
      println("Peso normal...Saludable")
    
    }
    else if(imc<=30){
      
      println("")
      println("------Resultado------")
      println("Obesidad en fase I")
    
    }
    else if(imc<=35){
      
      println("")
      println("------Resultado------")
      println("Sobrepeso cronico...Obesidad en fase II")
    
    }
     else if(imc<=40){
      
      println("")
      println("------Resultado------")
      println("Obesidad prem�rbida...Obesidad en fase III")
    
    }
    else if(imc>40){
      
      println("")
      println("------Resultado------")
      println("Obesidad morbida...Obesidad en fase IV")
    
    }
    
  }
  
  def calcularIMC(kg:Double, altura:Double): Double={
    val imc=kg/(altura*altura);
    imc
  }
  
}