class CineBoxPlayer:MediaDownloader.DownloadListener { //va a hacer lo mismo que main, pero se crea para mostrar uso de innterfaces el . precede a la interfaz
    //cuando la interfaz se pone, quiere decir que se pueden implementar sus métodos
    override fun onDownloadFisnished(media: Media) {
        media.play()
    }

    init{
        val mediaDownloader=MediaDownloader()
        mediaDownloader.downloadMedia(this) //ejecutar DownloadListener en esta clase, ya que aquí se definió lo que se
        //hará cuando termine
    }

}