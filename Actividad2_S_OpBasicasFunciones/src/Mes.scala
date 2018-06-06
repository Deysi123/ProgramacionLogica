

object Mes {
  
  
  def main(args: Array[String]): Unit = {
    
    println("Ingresa el numero de mes")
    val no=readByte
    
    println("El mes tiene:"+ obtenerDiasMes(no)+" d�as")
    
  }
  
  def obtenerDiasMes(mes: Byte):Byte={
    
    var dias=0.byteValue()
    
    if(mes==2){
      
      dias=28
    }
    else if(mes==4||mes==6||mes==9||mes==11){
      
      dias=30
      
    }
    
    else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
      
      dias=31
      
    }
    
    dias
  }
}