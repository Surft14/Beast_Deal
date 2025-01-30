/*
 * Лучшая сделка 
 * 
 * У вас есть список цен на золото по дням 
 * за какойто интервал времени. В этом интервали вы хотите найти такие дни чтобы,
 * чтобы купив золото а затем продав его вы получите максимально возможную прибыль.
 * Учтите что путишествовать во времени вы не можите!
 * 
 * */

 import kotlin.random.Random

 fun main() {
     var maxPrice: Int = 0
     var minPrice: Int = 0
     
     var maxPriceDay: Int = 0
     var minPriceDay: Int = 0
     
     var bulge = 0
     
     val size: Int = 10
     var priceGold: Array<Int> = Array(size, {0})
     
     for (i in 0 until size){
        priceGold[i] = Random.nextInt(20)
        print(priceGold[i])
        print(" ")
     }
     
     println()
     
     for(i in 0 until size){
         
         for(j in i+1 until size){
             
             if(bulge < (priceGold[j] - priceGold[i])){ 
                    
                 minPrice = priceGold[i]
                 maxPrice = priceGold[j]
             
                 minPriceDay = i
                 maxPriceDay = j
                 bulge = maxPrice - minPrice
               }
         }
     }
     
     println("Min $minPrice day:$minPriceDay, Max $maxPrice day:$maxPriceDay")
     println("bulge: $bulge")
 }
