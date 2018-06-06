

object Compra {
  
  def main(args: Array[String]): Unit = {
    println("No. de pantalones adquiridos")
    val no=readByte
    
    println("Total a pagar:"+obtenerTotalCompra(no))
  }
  
   def obtenerTotalCompra(no:Int):Double= {
   
     var total=0.00
     var descuento=0.00
     
     if(no<5){
       total=(no*356.82)
     }
     else if(no>=5&&no<12){//15
       descuento=((no*356.82)*15)/100
       total=(no*356.82)-descuento
     }
     else if(no>=12){
       descuento =((no*356.82)*30)/100
       total=((no*356.82)-descuento)
     }
     
     total
   }
}