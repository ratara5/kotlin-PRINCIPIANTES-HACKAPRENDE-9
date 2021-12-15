open class Media(var name: String, var duration: Int, var isAvailable: Boolean, var trailer:Trailer?=null) {

    companion object{
        private const val FRAME_RATE_HD=60
        private const val FRAME_RATE_SD=24
        private const val SECONDS_IN_A_MINUTE=60

        fun getTotalFrames(duration: Int, isHd: Boolean):Int{
            return if(isHd) {
                FRAME_RATE_HD * SECONDS_IN_A_MINUTE * duration
            }else{
                FRAME_RATE_SD * SECONDS_IN_A_MINUTE * duration
            }
        }
    }

    private var v=false

    open fun play(): Unit {
        if(isAvailable){
            if(duration>0){
                for (i in 0 until duration step duration / 10) {
                    println("Playing movie $name")
                }
                v=true
            }else {
                println("Playing movie duration is zero or less than zero")

            }
        }else{
            println("Movie $name is not available")
        }
    }

    fun pause(){
        println("Movie paused")
    }

    open fun played():Boolean{
        return if(v){
            println("${name} had played: true")
            this.pause()
            true
        }else{
            println("${name} had played: false")
            false
        }
    }

    fun playTrailer(){
        trailer?.play(name) ?: println("No movie trailer available")
    }

}