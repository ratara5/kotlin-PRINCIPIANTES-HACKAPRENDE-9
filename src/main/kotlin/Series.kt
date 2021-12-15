class Series(name: String, duration: Int, isAvailable: Boolean, trailer:Trailer?=null):Media(name, duration, isAvailable, trailer)   {

    var totalEpisodes=0
    var totalSeasons=0
    var episodeDuration=0

    init{
        episodeDuration=duration
        totalEpisodes=10
    }

    private var v=false

    override fun play() {
        //super.play()
        val realDuration=episodeDuration*totalEpisodes
        if(isAvailable){
            if(realDuration>0){
                for (i in 0 until realDuration step realDuration / 10) {
                    println("Playing series $name")
                }
                v=true
            }else {
                println("Playing series duration is zero or less than zero")

            }
        }else{
            println("Series $name is not available")
        }
    }
    //  y31
    override fun played(): Boolean {
        return if(v){
            println("${name} had played: true")
            this.pause()
            true
        }else{
            println("${name} had played: false")
            false
        }
    }
}