//34
class Movie(name: String, duration: Int, isAvailable: Boolean, trailer:Trailer?=null):Media(name, duration, isAvailable, trailer) {

    var wonOscar:Boolean=false

    override fun toString(): String {
        return "Nombre: $name -  Duración: $duration min"
    }

    override fun play() {
        super.play()
    }

    override fun equals(other: Any?): Boolean {
        return other!=null && other is Movie && other.name==this.name && other.duration==this.duration
    }
}