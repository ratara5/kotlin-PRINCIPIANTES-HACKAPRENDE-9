
fun main(args: Array<String>) {

    // Una manera
    /*
    val movie1=Movie("Titanic",90,false)
    val series1=Series("Sponge Bob",100,true)

    playMedia(movie1)

    val mediaDownloader=MediaDownloader()
    mediaDownloader.createDownloadThread(object: MediaDownloader.DownloadListener{
        override fun onDownloadFisnished(media: Media) { //4.(viene de MediaDownloader)
            media.play() //5. Se hace cuando termina la descarga
        }

    })
    playMedia(series1)
    */
    //Otra manera
    val cineBoxPlayer=CineBoxPlayer()

    //y34
    val mediaDownloader=MediaDownloader()

    mediaDownloader.downloadMedia{
        //media->
        //media.play()
        it.play()
    }

    //y35 Comparar objetos
    val a=1
    val b=1

    if(a==b){
        println("Enteros Iguales")
    } else{
        println("Enteros Diferentes")
    }

    val c="Hola"
    val d="Hola"

    if(c==d){
        println("Cadenas Iguales")
    } else{
        println("Cadenas Diferentes")
    }

    val movie1=Movie("El smoking", 80,true)
    val movie2=Movie("El smoking", 80,true)

    if(movie1==movie2){ //Esto no compararía el contenido de las películas para saber si son iguales o no
        //se requeriría sobreescribir el método equals
        println("Movies Iguales")
    } else{
        println("Movies Diferentes ${movie1.hashCode()} y ${movie2.hashCode()}")
    }

    if(movie1.equals(movie2)){ //Esto sí compara el contenido de las películas para saber si son iguales o no
        //se sobreescribió el método equals
        println("Movies Iguales")
    } else{
        println("Movies Diferentes ${movie1.hashCode()} y ${movie2.hashCode()}")
    }
}

fun playMedia(media: Media){
    media.play()
}



