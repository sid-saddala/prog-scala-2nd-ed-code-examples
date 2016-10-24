// src/main/scala/progscala2/introscala/upper1.sc

class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
}

class Lower {
  def lower(strings: String*) : Seq[String] = {
    strings.map((s:String) => s.toLowerCase())
  }
}


val up = new Upper
println(up.upper("Hello", "World!"))

val lo = new Lower
println(lo.lower("Hello", "World!"))