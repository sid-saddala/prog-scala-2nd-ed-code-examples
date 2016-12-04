import java.util.Calendar

def age(birthYear: Int) :Int ={
  Calendar.getInstance.get(Calendar.YEAR) - birthYear
}

val birthdays = List (1990,1977, 1984, 1961)

birthdays.map(age)

birthdays.map (year => Calendar.getInstance.get(Calendar.YEAR) - year)

def ages (birthYear: Int) : List[Int] = {
  val today = Calendar.getInstance.get(Calendar.YEAR)
  List (today - 1 -birthYear, today - birthYear, today +1 - birthYear)

}

birthdays.map(ages)
birthdays.flatMap(ages)
